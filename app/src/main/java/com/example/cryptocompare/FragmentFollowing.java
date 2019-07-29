package com.example.cryptocompare;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.apiCallAndResponse.Example;

import java.util.ArrayList;
import java.util.List;

public class FragmentFollowing extends Fragment {
    RecyclerView recyclerView;
    FollowingAdapter followingAdapter;
    GridLayoutManager layoutManager;

    public FragmentFollowing() {
    }
        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment


            View v= inflater.inflate(R.layout.fragment_following, container, false);

            recyclerView=v.findViewById(R.id.recycler_view_following_fragment);
            followingAdapter=new FollowingAdapter(getActivity());
            layoutManager=new GridLayoutManager(getActivity(),1);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(followingAdapter);

            ClientRetrofit clientRetrofit = new ClientRetrofit();
            clientRetrofit.loadJSON(new InterfaceCallback(){
                @Override
                public void onSuccess(Example example) {
                    List<Datum>datumTemp=new ArrayList<>();
//                    datumList.addAll(example.getData());
                    SharedPreferences pref = getActivity().getSharedPreferences("MyPref", 0);
                    for(int i=0;i<example.getData().size();i++) {
                        if (pref.contains(example.getData().get(i).getCoinInfo().getId())) {
                            datumTemp.add(example.getData().get(i));
                            Log.d("prefData", String.valueOf(datumTemp.size()));
                            Log.d("prefData2", String.valueOf(example.getData().size()));


                        }
                    }
                    followingAdapter.setDatumList(datumTemp);


                }
                @Override
                public void onFailure(Throwable e) {
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
