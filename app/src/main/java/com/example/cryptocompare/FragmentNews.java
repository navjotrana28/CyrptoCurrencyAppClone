package com.example.cryptocompare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cryptocompare.Api.ClientRetrofit;
import com.example.cryptocompare.newsResponse.Data;
import com.example.cryptocompare.newsResponse.NewsResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FragmentNews extends Fragment {

  RecyclerView recyclerView;
  NewsAdapter newsAdapter;
  GridLayoutManager layoutManager;
  private static List<Data> dataList=new ArrayList<>();

    public FragmentNews() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView=v.findViewById(R.id.recycler_view_news);
        newsAdapter= new NewsAdapter(getActivity(),dataList);
        layoutManager=new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(newsAdapter);

        ClientRetrofit clientRetrofit=new ClientRetrofit();

        clientRetrofit.loadNewsData(new NewsInterface() {
            @Override
            public void onSuccessNews(NewsResult newsResult) {
                dataList.addAll(Arrays.asList(newsResult.getData()));
               newsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable e) {

            }
        });

      return v;
    }

}
