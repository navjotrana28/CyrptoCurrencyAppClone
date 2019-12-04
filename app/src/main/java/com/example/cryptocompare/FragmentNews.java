package com.example.cryptocompare;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompare.newsResponse.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.gson.reflect.TypeToken.get;


public class FragmentNews extends Fragment {

    private static List<Data> dataList = new ArrayList<>();
    RecyclerView recyclerView;
    NewsAdapter newsAdapter;
    GridLayoutManager layoutManager;

    public FragmentNews() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_news, container, false);
        recyclerView = v.findViewById(R.id.recycler_view_news);
        newsAdapter = new NewsAdapter(getActivity(), dataList);
        layoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(newsAdapter);

        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        if (myViewModel.getList().getValue() == null) {
            myViewModel.get();
        }

        myViewModel.getList().observe(this, new Observer<List<Data>>() {
            @Override
            public void onChanged(List<Data> data) {
                dataList.addAll(data);
                newsAdapter.notifyDataSetChanged();
                Log.d("Dataget",dataList.size()+"");
            }
        });
        return v;
    }
}
