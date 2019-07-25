package com.example.cryptocompare;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class fragmentTopVolume extends Fragment {
    private static final String API="33354f1d432a0dcf2185b2dee2554f06ee3a2b1490c1e5e3b6958d1620e17445";
    private BtcEthResults btcEthResults;
    public fragmentTopVolume() {
    }
        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment
           View v= inflater.inflate(R.layout.fragment_top__volume, container, false);
         ServiceRetrofit apiService=ClientRetrofit.getClient().create(ServiceRetrofit.class);
            Call<BtcEthResults>call =apiService.getCoinSymbols(API);
            Log.d("datacome","data is not coming");
            call.enqueue(new Callback<BtcEthResults>() {
                @Override
                public void onResponse(Call<BtcEthResults> call, Response<BtcEthResults> response) {
                     btcEthResults =response.body();
                    Log.d("apicall",btcEthResults.getBTC().toString());
                }

                @Override
                public void onFailure(Call<BtcEthResults> call, Throwable t) {

                }
            });

     return v;
    }
    }





















//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
