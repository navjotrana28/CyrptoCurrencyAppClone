package com.example.cryptocompare.api;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.graphResponse.MyPojo;
import com.example.cryptocompare.interfaces.GraphInterface;
import com.example.cryptocompare.interfaces.InterfaceCallback;
import com.example.cryptocompare.interfaces.NewsInterface;
import com.example.cryptocompare.newsResponse.NewsResult;

import java.util.Objects;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientRetrofit {

	private static final String BASE_URL = "https://min-api.cryptocompare.com";
	private static final String API = "33354f1d432a0dcf2185b2dee2554f06ee3a2b1490c1e5e3b6958d1620e17445";

	private static Retrofit retrofit = null;
	private static ServiceRetrofit serviceRetrofit = null;

	public ClientRetrofit() {
		if (retrofit == null) {
			retrofit = new Retrofit.Builder()
					.baseUrl(BASE_URL)
					.addConverterFactory(GsonConverterFactory.create())
					.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
					.build();
		}
		serviceRetrofit = retrofit.create(ServiceRetrofit.class);
	}
/*
    public static void loadNewsData() {
    }*/

	public static void loadJSON(final InterfaceCallback interfaceCallback) {
		serviceRetrofit.getTopVolumeData(API)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new SingleObserver<Example>() {
					@Override
					public void onSubscribe(Disposable d) {
					}

					@Override
					public void onSuccess(Example example) {
						interfaceCallback.onSuccess(example);
					}

					@Override
					public void onError(Throwable e) {

					}
				});
	}

	public static void loadNewsData(final NewsInterface newsInterface) {
		Log.d("result", "resultthere");

		serviceRetrofit.getNewsData(API)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new SingleObserver<NewsResult>() {
					@Override
					public void onSubscribe(Disposable d) {
					}

					@Override
					public void onSuccess(NewsResult newsResult) {
						newsInterface.onSuccessNews(newsResult);
					}

					@RequiresApi(api = Build.VERSION_CODES.KITKAT)
					@Override
					public void onError(Throwable e) {
						Log.d("result", Objects.requireNonNull(e.getLocalizedMessage()));

					}
				});
	}

	public void loadGraphData(String time, String coinSymbol, String coinUsd, int limit, final GraphInterface graphInterface) {
		Log.d("graphresult", coinSymbol);

		serviceRetrofit.getGraphData(time, coinSymbol, coinUsd, limit, API)
				.subscribeOn(Schedulers.io())
				.observeOn(AndroidSchedulers.mainThread())
				.subscribe(new SingleObserver<MyPojo>() {
					@Override
					public void onSubscribe(Disposable d) {
					}

					@Override
					public void onSuccess(MyPojo myPojo) {
						Log.d("graphresultsuccess", "resultthere");
						graphInterface.onGraphSuccess(myPojo);
					}

					@RequiresApi(api = Build.VERSION_CODES.KITKAT)
					@Override
					public void onError(Throwable e) {
						Log.d("result", Objects.requireNonNull(e.getLocalizedMessage()));

					}
				});
	}
}
