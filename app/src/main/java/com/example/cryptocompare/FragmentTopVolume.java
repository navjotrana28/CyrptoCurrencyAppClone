package com.example.cryptocompare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.apiCallAndResponse.Example;
import java.util.ArrayList;
import java.util.List;


public class FragmentTopVolume extends Fragment {

    private static List<Datum> datumList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TopVolumeAdapter topVolumeAdapter;
    private GridLayoutManager layoutManager;

    public FragmentTopVolume() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_top_volume, container, false);
        recyclerView = v.findViewById(R.id.recycler_view_topvolume);
        topVolumeAdapter = new TopVolumeAdapter(getActivity());
        layoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(topVolumeAdapter);
        topVolumeAdapter.notifyDataSetChanged();

        ClientRetrofit clientRetrofit = new ClientRetrofit();
        clientRetrofit.loadJSON(new InterfaceCallback() {
            @Override
            public void onSuccess(Example example) {
                datumList.addAll(example.getData());
                topVolumeAdapter.setDatumList(example.getData());
                topVolumeAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable e) {
            }
        });
        return v;
    }
}
