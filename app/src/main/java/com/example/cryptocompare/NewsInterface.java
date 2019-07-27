package com.example.cryptocompare;
import com.example.cryptocompare.newsResponse.NewsResult;

public interface NewsInterface {
    void onSuccessNews(NewsResult newsResult);
    void onFailure(Throwable e);
}
