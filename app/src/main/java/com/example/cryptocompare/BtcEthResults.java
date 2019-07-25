package com.example.cryptocompare;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BtcEthResults {

    @SerializedName("BTC")
    @Expose
    private Btc bTC;
    @SerializedName("ETH")
    @Expose
    private Eth eTH;

    public Btc getBTC() {
        return bTC;
    }

    public void setBTC(Btc bTC) {
        this.bTC = bTC;
    }

    public Eth getETH() {
        return eTH;
    }

    public void setETH(Eth eTH) {
        this.eTH = eTH;
    }

}