package com.example.cryptocompare.apiCallAndResponse.Api;

import com.example.cryptocompare.apiCallAndResponse.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ServiceRetrofit {

//    @GET("/data/pricemulti?fsyms=BTC,ETH&tsyms=USD,EUR")
//    Call<BtcEthResults>getCoinSymbols   (
////            @Path("") String category,
//            @Query("api_key") String apiKey);
////            @Query("page") int PAGE);

    @GET("/data/top/totalvolfull?limit=10&tsym=USD")
    Call<Example>getTopVolumeData(
//            @Query("limit")int limit,
//            @Query("tsym") String tsym,
            @Query("api_key") String apiKey);

}
