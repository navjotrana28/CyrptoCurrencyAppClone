package com.example.cryptocompare;

import com.example.cryptocompare.apiCallAndResponse.Example;

import java.util.List;

public interface InterfaceCallback {
    void onSuccess(Example example);
    void onFailure(Throwable e);
}
