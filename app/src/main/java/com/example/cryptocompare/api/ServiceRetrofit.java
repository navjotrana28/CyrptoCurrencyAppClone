package com.example.cryptocompare.api;

import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.graphResponse.MyPojo;
import com.example.cryptocompare.newsResponse.NewsResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ServiceRetrofit {


    @GET("/data/top/totalvolfull?limit=20&tsym=USD")
    Single<Example> getTopVolumeData(
//            @Query("limit")int limit,
//            @Query("tsym") String tsym,
            @Query("api_key") String apiKey);

    @GET("/data/v2/news/?lang=EN")
    Single<NewsResult> getNewsData(

            @Query("api_key") String apikey);

    @GET("/data/{time}")
    Single<MyPojo> getGraphData(
            @Path("time") String time,
            @Query("fsym") String coinSymbol,
            @Query("tsym") String coinusd,
            @Query("limit") int limit,
            @Query("api_key") String apikey);
}
