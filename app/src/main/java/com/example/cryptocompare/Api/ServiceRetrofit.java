package com.example.cryptocompare.Api;

import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.newsResponse.NewsResult;

import io.reactivex.Single;
import retrofit2.Call;
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
}
