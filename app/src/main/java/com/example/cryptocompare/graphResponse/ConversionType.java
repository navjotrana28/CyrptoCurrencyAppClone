package com.example.cryptocompare.graphResponse;

public class ConversionType {
    private String conversionSymbol;

    private String type;

    public String getConversionSymbol() {
        return conversionSymbol;
    }

    public void setConversionSymbol(String conversionSymbol) {
        this.conversionSymbol = conversionSymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClassPojo [conversionSymbol = " + conversionSymbol + ", type = " + type + "]";
    }
}