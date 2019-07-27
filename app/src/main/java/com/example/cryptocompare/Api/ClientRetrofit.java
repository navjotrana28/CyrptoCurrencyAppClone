package com.example.cryptocompare.Api;

import android.util.Log;

import com.example.cryptocompare.NewsInterface;
import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.InterfaceCallback;
import com.example.cryptocompare.newsResponse.NewsResult;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientRetrofit {

    public static final String BASE_URL = "https://min-api.cryptocompare.com";
    private static final String API = "33354f1d432a0dcf2185b2dee2554f06ee3a2b1490c1e5e3b6958d1620e17445";

    public static Retrofit retrofit = null;
    public final ServiceRetrofit serviceRetrofit;

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

    public void loadJSON(final InterfaceCallback interfaceCallback) {
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

    public void loadNewsData(final NewsInterface newsInterface) {
        Log.d("result","resultthere");

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

                    @Override
                    public void onError(Throwable e) {
                        Log.d("result",e.getLocalizedMessage());

                    }
                });
    }
}
//        try{
//            ServiceRetrofit apiService= ClientRetrofit.getClient().create(ServiceRetrofit.class);
//            Call<Example> call =apiService.getTopVolumeData(API);
//            call.enqueue(new Callback<Example>() {
//                @Override
//                public void onResponse(Call<Example> call, Response<Example> response) {
//                    Example example=response.body();
//                    datumList.addAll(example.getData());
//                    Log.d("coinData", String.valueOf(example.getData()));

//                    topVolumeAdapter.notifyDataSetChanged();
//                }
//
//                @Override
//                public void onFailure(Call<Example> call, Throwable t) {
//                    Toast.makeText(getActivity(),"Error Fetching Data", Toast.LENGTH_SHORT).show();
//                    t.printStackTrace();
//                }
//            });
//        }catch (Exception e){
//            Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_SHORT).show();
//
//        }
//    }
//}
