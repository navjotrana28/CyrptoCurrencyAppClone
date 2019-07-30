package com.example.cryptocompare.apiCallAndResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Parcelable {

    public static final Parcelable.Creator<Datum> CREATOR = new Parcelable.Creator<Datum>() {
        @Override
        public Datum createFromParcel(Parcel source) {
            return new Datum(source);
        }

        @Override
        public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };
    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo coinInfo;
    @SerializedName("RAW")
    @Expose
    private RAW rAW;
    @SerializedName("DISPLAY")
    @Expose
    private DISPLAY dISPLAY;

    public Datum() {
    }

    protected Datum(Parcel in) {
        this.coinInfo = in.readParcelable(CoinInfo.class.getClassLoader());
        this.rAW = in.readParcelable(RAW.class.getClassLoader());
        this.dISPLAY = in.readParcelable(DISPLAY.class.getClassLoader());
    }

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

    public RAW getRAW() {
        return rAW;
    }

    public void setRAW(RAW rAW) {
        this.rAW = rAW;
    }

    public DISPLAY getDISPLAY() {
        return dISPLAY;
    }

    public void setDISPLAY(DISPLAY dISPLAY) {
        this.dISPLAY = dISPLAY;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.coinInfo, flags);
        dest.writeParcelable(this.rAW, flags);
        dest.writeParcelable(this.dISPLAY, flags);
    }
}