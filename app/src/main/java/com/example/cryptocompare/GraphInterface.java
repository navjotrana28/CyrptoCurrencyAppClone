package com.example.cryptocompare;


import com.example.cryptocompare.graphResponse.MyPojo;

public interface GraphInterface {
    void onGraphSuccess(MyPojo myPojo);
    void onFailure(Throwable e);
}
