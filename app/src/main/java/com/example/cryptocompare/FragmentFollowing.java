package com.example.cryptocompare;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.interfaces.InterfaceCallback;

import java.util.ArrayList;
import java.util.List;

public class FragmentFollowing extends Fragment {
    public static final String MY_PREF = "MyPref";
    RecyclerView recyclerView;
    TopVolumeAdapter followingAdapter;
    GridLayoutManager layoutManager;

    public FragmentFollowing() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_following, container, false);
        recyclerView = v.findViewById(R.id.recycler_view_following_fragment);
        followingAdapter = new TopVolumeAdapter(getActivity());
        layoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(followingAdapter);

        ClientRetrofit clientRetrofit = new ClientRetrofit();
        clientRetrofit.loadJSON(new InterfaceCallback() {
            @Override
            public void onSuccess(Example example) {

                List<Datum> datumTemp = new ArrayList<>();
                SharedPreferences pref = getActivity().getSharedPreferences(MY_PREF, 0);
                for (int i = 0; i < example.getData().size(); i++) {
                    if (pref.contains(example.getData().get(i).getCoinInfo().getId())) {
                        datumTemp.add(example.getData().get(i));
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

