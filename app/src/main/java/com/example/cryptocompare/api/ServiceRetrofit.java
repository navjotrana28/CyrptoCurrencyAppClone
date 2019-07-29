package com.example.cryptocompare.api;

import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.graphResponse.MyPojo;
import com.example.cryptocompare.newsResponse.NewsResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ServiceRetrofit {


    @GET("/data/top/totalvolfull?limit=20&tsym=USD")
    Single<Example> getTopVolumeData(
//            @Query("limit")int limit,
//            @Query("tsym") String tsym,
            @Query("api_key") String apiKey);

    @GET("/data/v2/news/?lang=EN")
    Single<NewsResult>getNewsData(

            @Query("api_key") String apikey);

    @GET("/data/histoday?fsym=BTC&tsym=USD&limit=99")
    Single<MyPojo>getGraphData(

     @Query("api_key") String apikey);

}
