package com.example.cryptocompare;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Btc{

    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("EUR")
    @Expose
    private Double eUR;

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getEUR() {
        return eUR;
    }

    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

}