package com.example.cryptocompare.apiCallAndResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DISPLAY implements Parcelable {

    public static final Parcelable.Creator<DISPLAY> CREATOR = new Parcelable.Creator<DISPLAY>() {
        @Override
        public DISPLAY createFromParcel(Parcel source) {
            return new DISPLAY(source);
        }

        @Override
        public DISPLAY[] newArray(int size) {
            return new DISPLAY[size];
        }
    };
    @SerializedName("USD")
    @Expose
    private USD_ uSD;

    public DISPLAY() {
    }

    protected DISPLAY(Parcel in) {
        this.uSD = in.readParcelable(USD_.class.getClassLoader());
    }

    public USD_ getUSD() {
        return uSD;
    }

    public void setUSD(USD_ uSD) {
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
