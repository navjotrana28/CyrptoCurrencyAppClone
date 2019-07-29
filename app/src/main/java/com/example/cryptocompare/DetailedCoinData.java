package com.example.cryptocompare;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cryptocompare.Api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.graphResponse.Data;
import com.example.cryptocompare.graphResponse.MyPojo;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailedCoinData extends AppCompatActivity {

    LineChart lineChart;
    Datum datumList;
    ImageView coinImage,detailBackSign;
    TextView detailCoinName,detailTotalVolPrize,detailPercentPrize,detailmarket,detailtotalvol
            ,detailDirectVol,detailDirectDollar,detailOpen,detailLow,followButton;

    private static List<Data> dataList =new ArrayList<>();

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
        detailBackSign=findViewById(R.id.detail_backSign);
        lineChart=findViewById(R.id.line_chart);

        Intent intentStartedActivity=getIntent();
       if(intentStartedActivity.hasExtra("coin_data")) {
           datumList = getIntent().getParcelableExtra("coin_data");
           Log.d("frag", String.valueOf(datumList));
       }

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
                   .resize(400,190)
                   .centerInside()
                   .into(coinImage);

           followButton.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   //followButton.setTextColor(getResources().getColor(R.color.colorWhite));
                   followButton.setText("Following");

               }
           });
          detailBackSign.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  finish();
              }
          });


          try{
              ClientRetrofit clientRetrofit=new ClientRetrofit();
                clientRetrofit.loadGraphData(new GraphInterface() {
                    @Override
                    public void onGraphSuccess(MyPojo myPojo) {
                      dataList.addAll(Arrays.asList(myPojo.getData()));
                        Log.d("graphData", String.valueOf(dataList.size()));

                    }

                    @Override
                    public void onFailure(Throwable e) {

                    }
                });
          }catch (Exception e){
              Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();

          }



//graph
         LineDataSet lineDataSet=new LineDataSet(getDataVal(),"dataSet");
         ArrayList<ILineDataSet>dataSets= new ArrayList<>();
         dataSets.add(lineDataSet);
         //for x-axis-
        XAxis xAxis=lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        //for Y-axis-
        YAxis yAxis=lineChart.getAxisLeft();
        yAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        //rightside y-axis
        YAxis yAxisright=lineChart.getAxisRight();
        yAxisright.setEnabled(false);
        //color
        lineDataSet.setFillAlpha(80);
        lineDataSet.setFillColor(Color.RED);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setColor(Color.RED);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawValues(false);

//setting data
        LineData lineData=new LineData(dataSets);
         lineChart.setData(lineData);
        //hide background grid lines
        lineChart.getAxisLeft().setDrawGridLines(false);
        lineChart.getXAxis().setDrawGridLines(false);
        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setDrawAxisLine(false);

//         //hide legend
//        Legend legend = lineChart.getLegend();
//        legend.setEnabled(false);
//         lineChart.invalidate();
        lineChart.setPinchZoom(true);

    }


 private ArrayList<Entry> getDataVal() {
     ArrayList<Entry> dataVal = new ArrayList<Entry>();
     dataVal.add(new Entry(0, 20));
     dataVal.add(new Entry(1, 24));
     dataVal.add(new Entry(2, 2));
     dataVal.add(new Entry(3, 10));
    return dataVal;
    }
}
