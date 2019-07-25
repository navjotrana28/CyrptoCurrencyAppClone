package com.example.cryptocompare;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.cryptocompare.apiCallAndResponse.Api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Api.ServiceRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentTopVolume extends Fragment {

RecyclerView recyclerView;
TopVolumeAdapter topVolumeAdapter;
GridLayoutManager layoutManager;
private static final String API="33354f1d432a0dcf2185b2dee2554f06ee3a2b1490c1e5e3b6958d1620e17445";


    public FragmentTopVolume() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_top_volume, container, false);
             recyclerView=v.findViewById(R.id.recycler_view_topvolume);

         topVolumeAdapter=new TopVolumeAdapter(getActivity());
         layoutManager=new GridLayoutManager(getActivity(),1);
         recyclerView.setAdapter(topVolumeAdapter);
         topVolumeAdapter.notifyDataSetChanged();

      try{
          ServiceRetrofit apiService= ClientRetrofit.getClient().create(ServiceRetrofit.class);
          Call<Example> call =apiService.getTopVolumeData(API);
          call.enqueue(new Callback<Example>() {
              @Override
              public void onResponse(Call<Example> call, Response<Example> response) {
                  Example example=response.body();
                  Log.d("coinData", String.valueOf(example.getData().size()));
              }

              @Override
              public void onFailure(Call<Example> call, Throwable t) {
                  Toast.makeText(getActivity(),"Error Fetching Data", Toast.LENGTH_SHORT).show();
                  t.printStackTrace();
              }
          });
      }catch (Exception e){
          Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_SHORT).show();

      }



        return v;
    }




//    public interface OnFragmentInteractionListener {
//        void onFragmentInteraction(Uri uri);
//    }
}
