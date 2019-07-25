package com.example.cryptocompare.apiCallAndResponse.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientRetrofit {

    public static Retrofit getClient() {
        String BASE_URL = "https://min-api.cryptocompare.com";
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
