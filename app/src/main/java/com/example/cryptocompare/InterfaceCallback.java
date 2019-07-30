package com.example.cryptocompare;

import com.example.cryptocompare.apiCallAndResponse.Example;

public interface InterfaceCallback {
    void onSuccess(Example example);
    void onFailure(Throwable e);
}
