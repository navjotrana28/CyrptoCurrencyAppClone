package com.example.cryptocompare.apiCallAndResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Type")
    @Expose
    private Integer type;
    @SerializedName("SponsoredData")
    @Expose
    private List<Object> sponsoredData = null;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("RateLimit")
    @Expose
    private RateLimit rateLimit;
    @SerializedName("HasWarning")
    @Expose
    private Boolean hasWarning;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Object> getSponsoredData() {
        return sponsoredData;
    }

    public void setSponsoredData(List<Object> sponsoredData) {
        this.sponsoredData = sponsoredData;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public Boolean getHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(Boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

}
