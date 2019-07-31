package com.example.cryptocompare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.example.cryptocompare.api.ClientRetrofit;
import com.example.cryptocompare.apiCallAndResponse.Datum;
import com.example.cryptocompare.graphResponse.Data;
import com.example.cryptocompare.graphResponse.MyPojo;
import com.example.cryptocompare.interfaces.GraphInterface;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;

import static com.example.cryptocompare.R.layout.marker_view;

public class DetailedCoinData extends AppCompatActivity implements View.OnClickListener,OnChartValueSelectedListener {
    public static final String COIN_DATA = "coin_data";
    public static final String HTTPS_WWW_CRYPTOCOMPARE_COM = "https://www.cryptocompare.com";
    public static final String DATA_SET = "dataSet";
    public static final String MY_PREF = "MyPref";
    public static final String FOLLOWING = "Following";
    public static final String FOLLOW = "Follow";
    public static final String REMOVED = " removed";
    public static final String ADDED = " Added";
    public static String time="histominute";

    LineChart lineChart;
    Datum datumList;
    ImageView coinImage, detailBackSign;
    Button oneMin,oneHour,oneDay;
    TextView detailCoinName, detailTotalVolPrize, detailPercentPrize, detailmarket, detailtotalvol, detailDirectVol, detailDirectDollar, detailOpen, detailLow, followButton;
    private ArrayList<Data> graphDataList = new ArrayList();

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_coin_data);
        detailCoinName = findViewById(R.id.detail_coin_Name);
        detailTotalVolPrize = findViewById(R.id.detail_total_volume_prize);
        detailPercentPrize = findViewById(R.id.detail_percentage_prize);
        detailmarket = findViewById(R.id.detail_market_cap_number);
        detailtotalvol = findViewById(R.id.detail_total_vol_24h_number);
        detailDirectVol = findViewById(R.id.detail_direct_vol_24h_number);
        detailDirectDollar = findViewById(R.id.detail_direct_dollar_number);
        detailOpen = findViewById(R.id.detail_open_24h_number);
        detailLow = findViewById(R.id.detail_low_24h_number);
        coinImage = findViewById(R.id.detail_coin_symbol_image);
        followButton = findViewById(R.id.detail_follow);
        detailBackSign = findViewById(R.id.detail_backSign);
        lineChart = findViewById(R.id.line_chart);
        oneMin=findViewById(R.id.one_min);
        oneHour=findViewById(R.id.one_hour);
        oneDay=findViewById(R.id.one_Day);

        Intent intentStartedActivity = getIntent();
        if (intentStartedActivity.hasExtra(COIN_DATA)) {
            datumList = getIntent().getParcelableExtra(COIN_DATA);
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
                .load(HTTPS_WWW_CRYPTOCOMPARE_COM + datumList.getCoinInfo().getImageUrl())
                .placeholder(R.drawable.ic_launcher_foreground)
                .resize(200, 200)
                .centerCrop()
                .into(coinImage);

        detailBackSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        callGraphData();
        oneMin.setOnClickListener(this);
        oneHour.setOnClickListener(this);
        oneDay.setOnClickListener(this);


        final SharedPreferences pref = getApplicationContext().getSharedPreferences(MY_PREF, 0);
        final SharedPreferences.Editor editor = pref.edit();

        if (pref.contains(datumList.getCoinInfo().getId())) {
            followButton.setText(FOLLOWING);
            followButton.setTextColor(getResources().getColor(R.color.colorWhite));
            followButton.setBackground(getResources().getDrawable(R.drawable.rounded_border_greenfollow));
        }
//graph
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (pref.contains(datumList.getCoinInfo().getId())) {
                    followButton.setText(FOLLOW);
                    followButton.setBackground(getResources().getDrawable(R.drawable.rounded_border_follow));
                    followButton.setTextColor(getResources().getColor(R.color.colorBlack));
                    Toast.makeText(view.getContext(), datumList.getCoinInfo().getFullName() + REMOVED, Toast.LENGTH_SHORT).show();
                    editor.remove(datumList.getCoinInfo().getId());
                    editor.commit();

                } else {
                    followButton.setText(FOLLOWING);
                    followButton.setTextColor(getResources().getColor(R.color.colorWhite));
                    followButton.setBackground(getResources().getDrawable(R.drawable.rounded_border_greenfollow));
                    Toast.makeText(view.getContext(), datumList.getCoinInfo().getFullName() + ADDED, Toast.LENGTH_SHORT).show();
                    editor.putString(datumList.getCoinInfo().getId(), datumList.getCoinInfo().getFullName());
                    editor.commit();
                    Log.d("saved pref", editor.toString());
                }
            }
        });
    }

//    private ArrayList<Entry> getDataVal() {
//
//        return dataVal;
//    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.one_min: {
                time="histominute";
                oneMin.setTextColor(getResources().getColor(R.color.colorWhite));
                oneMin.setBackgroundColor(  getResources().getColor(R.color.colorGreen));
                oneDay.setTextColor(getResources().getColor(R.color.colorBlack));
                oneDay.setBackgroundColor(  getResources().getColor(R.color.colorWhite));
                oneHour.setTextColor(getResources().getColor(R.color.colorBlack));
                oneHour.setBackgroundColor(  getResources().getColor(R.color.colorWhite));
                callGraphData();
                break;
            }
            case R.id.one_hour:{
              time="histohour";
                oneHour.setTextColor(getResources().getColor(R.color.colorWhite));
                oneHour.setBackgroundColor(  getResources().getColor(R.color.colorGreen));
                oneDay.setTextColor(getResources().getColor(R.color.colorBlack));
                oneDay.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                oneMin.setTextColor(getResources().getColor(R.color.colorBlack));
                oneMin.setBackgroundColor(  getResources().getColor(R.color.colorWhite));
              callGraphData();
              break;
            }
            case R.id.one_Day:{
                time="histoday";
                oneDay.setTextColor(getResources().getColor(R.color.colorWhite));
                oneDay.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                oneMin.setTextColor(getResources().getColor(R.color.colorBlack));
                oneMin.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                oneHour.setTextColor(getResources().getColor(R.color.colorBlack));
                oneHour.setBackgroundColor(getResources().getColor(R.color.colorWhite));

                callGraphData();
                break;
            }
        }
    }


    private void callGraphData(){

        try {
            ClientRetrofit clientRetrofit = new ClientRetrofit();
            clientRetrofit.loadGraphData(time,datumList.getCoinInfo().getName(),datumList.getRAW().getUSD().getTOSYMBOL(),100,new GraphInterface() {
                @Override
                public void onGraphSuccess(MyPojo myPojo) {
                    ArrayList<Entry> dataVal = new ArrayList<Entry>();
                    for (int i = 0; i < Arrays.asList(myPojo.getData()).size(); i++) {
                        dataVal.add(new Entry(i, Float.valueOf(Arrays.asList(myPojo.getData()).get(i).getClose())));
                    }

                    LineDataSet lineDataSet = new LineDataSet(dataVal, DATA_SET);
                    final ArrayList<ILineDataSet> dataSets = new ArrayList<>();
                    dataSets.add(lineDataSet);
                    //for x-axis-
                    XAxis xAxis = lineChart.getXAxis();
                    xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                    //for Y-axis-
                    YAxis yAxis = lineChart.getAxisLeft();
                    yAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
                    //rightside y-axis
                    YAxis yAxisright = lineChart.getAxisRight();
                    yAxisright.setEnabled(false);
                    //color
                    lineDataSet.setFillAlpha(80);
                    lineDataSet.setFillColor(Color.RED);
                    lineDataSet.setDrawCircles(false);
                    lineDataSet.setColor(Color.RED);
                    lineDataSet.setDrawFilled(true);
                    lineDataSet.setDrawValues(false);
                    //setting data
                    LineData lineData = new LineData(dataSets);
                    lineChart.setData(lineData);
                    //hide background grid lines
                    lineChart.getAxisLeft().setDrawGridLines(false);
                    lineChart.getXAxis().setDrawGridLines(false);
                    YAxis leftAxis = lineChart.getAxisLeft();
                    leftAxis.setDrawAxisLine(false);
                    lineChart.setPinchZoom(true);
                    lineChart.setTouchEnabled(true);
                    lineChart.getDescription().setEnabled(false);

                    lineChart.setTouchEnabled(true);
                    lineChart.setOnChartValueSelectedListener(DetailedCoinData.this);
                    MyMarkerView mv =new MyMarkerView(getApplicationContext(), marker_view);
                    mv.setChartView(lineChart);
                    lineChart.setMarker(mv);
                    lineChart.setDragEnabled(true);
                    lineChart.setScaleEnabled(true);
                    lineChart.invalidate();
                }

                @Override
                public void onFailure(Throwable e) {
                }
            });
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onValueSelected(Entry e, Highlight h) {
    }

    @Override
    public void onNothingSelected() {
    }
}
