package com.example.cryptocompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.cryptocompare.apiCallAndResponse.Datum;

import java.util.ArrayList;
import java.util.List;

public class DetailedCoinData extends AppCompatActivity {

    Datum datumList;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_coin_data);

        Intent intentStartedActivity=getIntent();

       if(intentStartedActivity.hasExtra("coin_data")){
           datumList =  getIntent().getParcelableExtra("coin_data");
           Log.d("frag", String.valueOf(datumList));



       }

//        if(intentStartedActivity.hasExtra("coin_data")){
//            datum=  intentStartedActivity.getExtras.("coin_data");
//            Log.d("Datacoin",datum.toString());
    }
}
