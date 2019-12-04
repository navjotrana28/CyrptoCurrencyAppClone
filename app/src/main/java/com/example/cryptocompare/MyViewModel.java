package com.example.cryptocompare;


import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.interfaces.NewsInterface;
import com.example.cryptocompare.newsResponse.Data;
import com.example.cryptocompare.newsResponse.NewsResult;
import java.util.Arrays;
import java.util.List;

class MyViewModel extends AndroidViewModel{


    MutableLiveData<List<Data>> getList() {
        return list;
    }

    public void setList(MutableLiveData<List<Data>> list) {
        this.list = list;
    }

    private MutableLiveData<List<Data>>list;

    public MyViewModel(Application application) {
        super(application);
        list = new MutableLiveData<>();
    }

    void get() {
        ClientRetrofit.loadNewsData(new NewsInterface() {
            @Override
            public void onSuccessNews(NewsResult newsResult) {
                list.setValue(Arrays.asList(newsResult.getData()));
                Log.d("Data",list.getValue().size()+"");
            }

            @Override
            public void onFailure(Throwable e) {
                Log.d("Failure",e.getMessage());
            }
        });
    }


}