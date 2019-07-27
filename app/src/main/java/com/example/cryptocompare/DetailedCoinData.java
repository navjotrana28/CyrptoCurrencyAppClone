package com.example.cryptocompare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.squareup.picasso.Picasso;

public class DetailedCoinData extends AppCompatActivity {

    Datum datumList;
    ImageView coinImage;
    TextView detailCoinName,detailTotalVolPrize,detailPercentPrize,detailmarket,detailtotalvol
            ,detailDirectVol,detailDirectDollar,detailOpen,detailLow,followButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_coin_data);
        detailCoinName=findViewById(R.id.detail_coin_Name);
        detailTotalVolPrize=findViewById(R.id.detail_total_volume_prize);
        detailPercentPrize=findViewById(R.id.detail_percentage_prize);
        detailmarket=findViewById(R.id.detail_market_cap_number);
        detailtotalvol=findViewById(R.id.detail_total_vol_24h_number);
        detailDirectVol=findViewById(R.id.detail_direct_vol_24h_number);
        detailDirectDollar=findViewById(R.id.detail_direct_dollar_number);
        detailOpen=findViewById(R.id.detail_open_24h_number);
        detailLow=findViewById(R.id.detail_low_24h_number);
        coinImage=findViewById(R.id.detail_coin_symbol_image);
        followButton=findViewById(R.id.detail_follow);

        Intent intentStartedActivity=getIntent();
       if(intentStartedActivity.hasExtra("coin_data")){
           datumList =  getIntent().getParcelableExtra("coin_data");
           Log.d("frag", String.valueOf(datumList));

           detailCoinName.setText(datumList.getCoinInfo().getFullName());
           detailTotalVolPrize.setText(datumList.getDISPLAY().getUSD().getPRICE());
           detailmarket.setText(datumList.getDISPLAY().getUSD().getMKTCAP());
           detailtotalvol.setText(datumList.getDISPLAY().getUSD().getTOTALVOLUME24H());
           detailDirectVol.setText(datumList.getDISPLAY().getUSD().getTOPTIERVOLUME24HOUR());
           detailDirectDollar.setText(datumList.getDISPLAY().getUSD().getTOPTIERVOLUME24HOURTO());
           detailOpen.setText(datumList.getDISPLAY().getUSD().getOPEN24HOUR());
           detailLow.setText(datumList.getDISPLAY().getUSD().getLOW24HOUR());
           Picasso.get()
                   .load("https://www.cryptocompare.com"+datumList.getCoinInfo().getImageUrl())
                   .placeholder(R.drawable.ic_launcher_foreground)
                   .resize(350,160)
                   .centerInside()
                   .into(coinImage);

           followButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   //followButton.setTextColor(getResources().getColor(R.color.colorWhite));
                   followButton.setText("Following");

               }
           });



       }

//        if(intentStartedActivity.hasExtra("coin_data")){
//            datum=  intentStartedActivity.getExtras.("coin_data");
//            Log.d("Datacoin",datum.toString());
    }
}
