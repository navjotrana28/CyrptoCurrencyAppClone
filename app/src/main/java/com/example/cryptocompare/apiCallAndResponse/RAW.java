package com.example.cryptocompare.apiCallAndResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RAW implements Parcelable {

    public static final Parcelable.Creator<RAW> CREATOR = new Parcelable.Creator<RAW>() {
        @Override
        public RAW createFromParcel(Parcel source) {
            return new RAW(source);
        }

        @Override
        public RAW[] newArray(int size) {
            return new RAW[size];
        }
    };
    @SerializedName("USD")
    @Expose
    private USD uSD;

    public RAW() {
    }

    protected RAW(Parcel in) {
        this.uSD = in.readParcelable(USD.class.getClassLoader());
    }

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
        this.uSD = uSD;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uSD, flags);
    }
}