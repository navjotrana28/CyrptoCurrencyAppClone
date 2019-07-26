package com.example.cryptocompare;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.example.cryptocompare.apiCallAndResponse.Api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Api.ServiceRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.apiCallAndResponse.Example;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentTopVolume extends Fragment {

RecyclerView recyclerView;
TopVolumeAdapter topVolumeAdapter;
GridLayoutManager layoutManager;
private static  List<Datum> datumList=new ArrayList<>();


    public FragmentTopVolume() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_top_volume, container, false);
         recyclerView=v.findViewById(R.id.recycler_view_topvolume);
         topVolumeAdapter=new TopVolumeAdapter(getActivity(), datumList);
         layoutManager=new GridLayoutManager(getActivity(),1);
         recyclerView.setLayoutManager(layoutManager);
         recyclerView.setAdapter(topVolumeAdapter);
         topVolumeAdapter.notifyDataSetChanged();

         ClientRetrofit clientRetrofit = new ClientRetrofit();
         clientRetrofit.loadJSON(new interfaceCallback(){
             @Override
             public void onSuccess(Example example) {
                datumList.addAll(example.getData());
                 topVolumeAdapter.notifyDataSetChanged();
             }
             @Override
             public void onFailure(Throwable e) {
             }
         });


        return v;
    }

//    public interface OnFragmentInteractionListener {
//        void onFragmentInteraction(Uri uri);
//    }
}
