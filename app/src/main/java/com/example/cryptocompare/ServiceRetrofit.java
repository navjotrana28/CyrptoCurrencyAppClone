package com.example.cryptocompare;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;



public interface ServiceRetrofit {

    @GET("/data/pricemulti?fsyms=BTC,ETH&tsyms=USD,EUR")
    Call<BtcEthResults>getCoinSymbols   (
//            @Path("") String category,
            @Query("api_key") String apiKey);
//            @Query("page") int PAGE);
}
