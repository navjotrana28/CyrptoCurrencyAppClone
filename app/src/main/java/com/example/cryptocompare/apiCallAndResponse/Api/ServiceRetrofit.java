package com.example.cryptocompare.apiCallAndResponse.Api;

import com.example.cryptocompare.apiCallAndResponse.Example;

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

}
