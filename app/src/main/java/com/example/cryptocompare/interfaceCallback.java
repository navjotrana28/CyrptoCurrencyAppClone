package com.example.cryptocompare;

import com.example.cryptocompare.apiCallAndResponse.Example;

import java.util.List;

public interface interfaceCallback {
    void onSuccess(Example example);
    void onFailure(Throwable e);
}
