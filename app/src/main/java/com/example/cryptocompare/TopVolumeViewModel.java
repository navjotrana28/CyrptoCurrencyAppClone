package com.example.cryptocompare;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.apiCallAndResponse.Example;
import com.example.cryptocompare.interfaces.InterfaceCallback;
import java.util.List;

    class TopVolumeViewModel extends AndroidViewModel {


        MutableLiveData<List<Datum>> getList() {
            return list;
        }

        public void setList(MutableLiveData<List<Datum>> list) {
            this.list = list;
        }

        private MutableLiveData<List<Datum>>list;

        public TopVolumeViewModel(@NonNull Application application) {
            super(application);
            list = new MutableLiveData<>();
        }

        void get() {
            ClientRetrofit.loadJSON(new InterfaceCallback() {
                @Override
                public void onSuccess(Example example) {
                    list.setValue(example.getData());
                    Log.d("Data",list.getValue().size()+"");
                }

                @Override
                public void onFailure(Throwable e) {
                    Log.d("Failure",e.getMessage());
                }
            });
        }
}
