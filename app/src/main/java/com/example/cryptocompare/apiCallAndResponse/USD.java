package com.example.cryptocompare.apiCallAndResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USD implements Parcelable {

    public static final Parcelable.Creator<USD> CREATOR = new Parcelable.Creator<USD>() {
        @Override
        public USD createFromParcel(Parcel source) {
            return new USD(source);
        }

        @Override
        public USD[] newArray(int size) {
            return new USD[size];
        }
    };
    @SerializedName("TYPE")
    @Expose
    private String tYPE;
    @SerializedName("MARKET")
    @Expose
    private String mARKET;
    @SerializedName("FROMSYMBOL")
    @Expose
    private String fROMSYMBOL;
    @SerializedName("TOSYMBOL")
    @Expose
    private String tOSYMBOL;
    @SerializedName("FLAGS")
    @Expose
    private String fLAGS;
    @SerializedName("PRICE")
    @Expose
    private Double pRICE;
    @SerializedName("LASTUPDATE")
    @Expose
    private Integer lASTUPDATE;
    @SerializedName("LASTVOLUME")
    @Expose
    private Double lASTVOLUME;
    @SerializedName("LASTVOLUMETO")
    @Expose
    private Double lASTVOLUMETO;
    @SerializedName("LASTTRADEID")
    @Expose
    private String lASTTRADEID;
    @SerializedName("VOLUMEDAY")
    @Expose
    private Double vOLUMEDAY;
    @SerializedName("VOLUMEDAYTO")
    @Expose
    private Double vOLUMEDAYTO;
    @SerializedName("VOLUME24HOUR")
    @Expose
    private Double vOLUME24HOUR;
    @SerializedName("VOLUME24HOURTO")
    @Expose
    private Double vOLUME24HOURTO;
    @SerializedName("OPENDAY")
    @Expose
    private Double oPENDAY;
    @SerializedName("HIGHDAY")
    @Expose
    private Double hIGHDAY;
    @SerializedName("LOWDAY")
    @Expose
    private Double lOWDAY;
    @SerializedName("OPEN24HOUR")
    @Expose
    private Double oPEN24HOUR;
    @SerializedName("HIGH24HOUR")
    @Expose
    private Double hIGH24HOUR;
    @SerializedName("LOW24HOUR")
    @Expose
    private Double lOW24HOUR;
    @SerializedName("LASTMARKET")
    @Expose
    private String lASTMARKET;
    @SerializedName("VOLUMEHOUR")
    @Expose
    private Double vOLUMEHOUR;
    @SerializedName("VOLUMEHOURTO")
    @Expose
    private Double vOLUMEHOURTO;
    @SerializedName("OPENHOUR")
    @Expose
    private Double oPENHOUR;
    @SerializedName("HIGHHOUR")
    @Expose
    private Double hIGHHOUR;
    @SerializedName("LOWHOUR")
    @Expose
    private Double lOWHOUR;
    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private Double tOPTIERVOLUME24HOUR;
    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private Double tOPTIERVOLUME24HOURTO;
    @SerializedName("CHANGE24HOUR")
    @Expose
    private Double cHANGE24HOUR;
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private Double cHANGEPCT24HOUR;
    @SerializedName("CHANGEDAY")
    @Expose
    private Double cHANGEDAY;
    @SerializedName("CHANGEPCTDAY")
    @Expose
    private Double cHANGEPCTDAY;
    @SerializedName("SUPPLY")
    @Expose
    private Double sUPPLY;
    @SerializedName("MKTCAP")
    @Expose
    private Double mKTCAP;
    @SerializedName("TOTALVOLUME24H")
    @Expose
    private Double tOTALVOLUME24H;
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private Double tOTALVOLUME24HTO;
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private Double tOTALTOPTIERVOLUME24H;
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private Double tOTALTOPTIERVOLUME24HTO;
    @SerializedName("IMAGEURL")
    @Expose
    private String iMAGEURL;

    public USD() {
    }

    protected USD(Parcel in) {
        this.tYPE = in.readString();
        this.mARKET = in.readString();
        this.fROMSYMBOL = in.readString();
        this.tOSYMBOL = in.readString();
        this.fLAGS = in.readString();
        this.pRICE = (Double) in.readValue(Double.class.getClassLoader());
        this.lASTUPDATE = (Integer) in.readValue(Integer.class.getClassLoader());
        this.lASTVOLUME = (Double) in.readValue(Double.class.getClassLoader());
        this.lASTVOLUMETO = (Double) in.readValue(Double.class.getClassLoader());
        this.lASTTRADEID = in.readString();
        this.vOLUMEDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.vOLUMEDAYTO = (Double) in.readValue(Double.class.getClassLoader());
        this.vOLUME24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.vOLUME24HOURTO = (Double) in.readValue(Double.class.getClassLoader());
        this.oPENDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.hIGHDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.lOWDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.oPEN24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.hIGH24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.lOW24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.lASTMARKET = in.readString();
        this.vOLUMEHOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.vOLUMEHOURTO = (Double) in.readValue(Double.class.getClassLoader());
        this.oPENHOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.hIGHHOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.lOWHOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.tOPTIERVOLUME24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.tOPTIERVOLUME24HOURTO = (Double) in.readValue(Double.class.getClassLoader());
        this.cHANGE24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.cHANGEPCT24HOUR = (Double) in.readValue(Double.class.getClassLoader());
        this.cHANGEDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.cHANGEPCTDAY = (Double) in.readValue(Double.class.getClassLoader());
        this.sUPPLY = (Double) in.readValue(Double.class.getClassLoader());
        this.mKTCAP = (Double) in.readValue(Double.class.getClassLoader());
        this.tOTALVOLUME24H = (Double) in.readValue(Double.class.getClassLoader());
        this.tOTALVOLUME24HTO = (Double) in.readValue(Double.class.getClassLoader());
        this.tOTALTOPTIERVOLUME24H = (Double) in.readValue(Double.class.getClassLoader());
        this.tOTALTOPTIERVOLUME24HTO = (Double) in.readValue(Double.class.getClassLoader());
        this.iMAGEURL = in.readString();
    }

    public String getTYPE() {
        return tYPE;
    }

    public void setTYPE(String tYPE) {
        this.tYPE = tYPE;
    }

    public String getMARKET() {
        return mARKET;
    }

    public void setMARKET(String mARKET) {
        this.mARKET = mARKET;
    }

    public String getFROMSYMBOL() {
        return fROMSYMBOL;
    }

    public void setFROMSYMBOL(String fROMSYMBOL) {
        this.fROMSYMBOL = fROMSYMBOL;
    }

    public String getTOSYMBOL() {
        return tOSYMBOL;
    }

    public void setTOSYMBOL(String tOSYMBOL) {
        this.tOSYMBOL = tOSYMBOL;
    }

    public String getFLAGS() {
        return fLAGS;
    }

    public void setFLAGS(String fLAGS) {
        this.fLAGS = fLAGS;
    }

    public Double getPRICE() {
        return pRICE;
    }

    public void setPRICE(Double pRICE) {
        this.pRICE = pRICE;
    }

    public Integer getLASTUPDATE() {
        return lASTUPDATE;
    }

    public void setLASTUPDATE(Integer lASTUPDATE) {
        this.lASTUPDATE = lASTUPDATE;
    }

    public Double getLASTVOLUME() {
        return lASTVOLUME;
    }

    public void setLASTVOLUME(Double lASTVOLUME) {
        this.lASTVOLUME = lASTVOLUME;
    }

    public Double getLASTVOLUMETO() {
        return lASTVOLUMETO;
    }

    public void setLASTVOLUMETO(Double lASTVOLUMETO) {
        this.lASTVOLUMETO = lASTVOLUMETO;
    }

    public String getLASTTRADEID() {
        return lASTTRADEID;
    }

    public void setLASTTRADEID(String lASTTRADEID) {
        this.lASTTRADEID = lASTTRADEID;
    }

    public Double getVOLUMEDAY() {
        return vOLUMEDAY;
    }

    public void setVOLUMEDAY(Double vOLUMEDAY) {
        this.vOLUMEDAY = vOLUMEDAY;
    }

    public Double getVOLUMEDAYTO() {
        return vOLUMEDAYTO;
    }

    public void setVOLUMEDAYTO(Double vOLUMEDAYTO) {
        this.vOLUMEDAYTO = vOLUMEDAYTO;
    }

    public Double getVOLUME24HOUR() {
        return vOLUME24HOUR;
    }

    public void setVOLUME24HOUR(Double vOLUME24HOUR) {
        this.vOLUME24HOUR = vOLUME24HOUR;
    }

    public Double getVOLUME24HOURTO() {
        return vOLUME24HOURTO;
    }

    public void setVOLUME24HOURTO(Double vOLUME24HOURTO) {
        this.vOLUME24HOURTO = vOLUME24HOURTO;
    }

    public Double getOPENDAY() {
        return oPENDAY;
    }

    public void setOPENDAY(Double oPENDAY) {
        this.oPENDAY = oPENDAY;
    }

    public Double getHIGHDAY() {
        return hIGHDAY;
    }

    public void setHIGHDAY(Double hIGHDAY) {
        this.hIGHDAY = hIGHDAY;
    }

    public Double getLOWDAY() {
        return lOWDAY;
    }

    public void setLOWDAY(Double lOWDAY) {
        this.lOWDAY = lOWDAY;
    }

    public Double getOPEN24HOUR() {
        return oPEN24HOUR;
    }

    public void setOPEN24HOUR(Double oPEN24HOUR) {
        this.oPEN24HOUR = oPEN24HOUR;
    }

    public Double getHIGH24HOUR() {
        return hIGH24HOUR;
    }

    public void setHIGH24HOUR(Double hIGH24HOUR) {
        this.hIGH24HOUR = hIGH24HOUR;
    }

    public Double getLOW24HOUR() {
        return lOW24HOUR;
    }

    public void setLOW24HOUR(Double lOW24HOUR) {
        this.lOW24HOUR = lOW24HOUR;
    }

    public String getLASTMARKET() {
        return lASTMARKET;
    }

    public void setLASTMARKET(String lASTMARKET) {
        this.lASTMARKET = lASTMARKET;
    }

    public Double getVOLUMEHOUR() {
        return vOLUMEHOUR;
    }

    public void setVOLUMEHOUR(Double vOLUMEHOUR) {
        this.vOLUMEHOUR = vOLUMEHOUR;
    }

    public Double getVOLUMEHOURTO() {
        return vOLUMEHOURTO;
    }

    public void setVOLUMEHOURTO(Double vOLUMEHOURTO) {
        this.vOLUMEHOURTO = vOLUMEHOURTO;
    }

    public Double getOPENHOUR() {
        return oPENHOUR;
    }

    public void setOPENHOUR(Double oPENHOUR) {
        this.oPENHOUR = oPENHOUR;
    }

    public Double getHIGHHOUR() {
        return hIGHHOUR;
    }

    public void setHIGHHOUR(Double hIGHHOUR) {
        this.hIGHHOUR = hIGHHOUR;
    }

    public Double getLOWHOUR() {
        return lOWHOUR;
    }

    public void setLOWHOUR(Double lOWHOUR) {
        this.lOWHOUR = lOWHOUR;
    }

    public Double getTOPTIERVOLUME24HOUR() {
        return tOPTIERVOLUME24HOUR;
    }

    public void setTOPTIERVOLUME24HOUR(Double tOPTIERVOLUME24HOUR) {
        this.tOPTIERVOLUME24HOUR = tOPTIERVOLUME24HOUR;
    }

    public Double getTOPTIERVOLUME24HOURTO() {
        return tOPTIERVOLUME24HOURTO;
    }

    public void setTOPTIERVOLUME24HOURTO(Double tOPTIERVOLUME24HOURTO) {
        this.tOPTIERVOLUME24HOURTO = tOPTIERVOLUME24HOURTO;
    }

    public Double getCHANGE24HOUR() {
        return cHANGE24HOUR;
    }

    public void setCHANGE24HOUR(Double cHANGE24HOUR) {
        this.cHANGE24HOUR = cHANGE24HOUR;
    }

    public Double getCHANGEPCT24HOUR() {
        return cHANGEPCT24HOUR;
    }

    public void setCHANGEPCT24HOUR(Double cHANGEPCT24HOUR) {
        this.cHANGEPCT24HOUR = cHANGEPCT24HOUR;
    }

    public Double getCHANGEDAY() {
        return cHANGEDAY;
    }

    public void setCHANGEDAY(Double cHANGEDAY) {
        this.cHANGEDAY = cHANGEDAY;
    }

    public Double getCHANGEPCTDAY() {
        return cHANGEPCTDAY;
    }

    public void setCHANGEPCTDAY(Double cHANGEPCTDAY) {
        this.cHANGEPCTDAY = cHANGEPCTDAY;
    }

    public Double getSUPPLY() {
        return sUPPLY;
    }

    public void setSUPPLY(Double sUPPLY) {
        this.sUPPLY = sUPPLY;
    }

    public Double getMKTCAP() {
        return mKTCAP;
    }

    public void setMKTCAP(Double mKTCAP) {
        this.mKTCAP = mKTCAP;
    }

    public Double getTOTALVOLUME24H() {
        return tOTALVOLUME24H;
    }

    public void setTOTALVOLUME24H(Double tOTALVOLUME24H) {
        this.tOTALVOLUME24H = tOTALVOLUME24H;
    }

    public Double getTOTALVOLUME24HTO() {
        return tOTALVOLUME24HTO;
    }

    public void setTOTALVOLUME24HTO(Double tOTALVOLUME24HTO) {
        this.tOTALVOLUME24HTO = tOTALVOLUME24HTO;
    }

    public Double getTOTALTOPTIERVOLUME24H() {
        return tOTALTOPTIERVOLUME24H;
    }

    public void setTOTALTOPTIERVOLUME24H(Double tOTALTOPTIERVOLUME24H) {
        this.tOTALTOPTIERVOLUME24H = tOTALTOPTIERVOLUME24H;
    }

    public Double getTOTALTOPTIERVOLUME24HTO() {
        return tOTALTOPTIERVOLUME24HTO;
    }

    public void setTOTALTOPTIERVOLUME24HTO(Double tOTALTOPTIERVOLUME24HTO) {
        this.tOTALTOPTIERVOLUME24HTO = tOTALTOPTIERVOLUME24HTO;
    }

    public String getIMAGEURL() {
        return iMAGEURL;
    }

    public void setIMAGEURL(String iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tYPE);
        dest.writeString(this.mARKET);
        dest.writeString(this.fROMSYMBOL);
        dest.writeString(this.tOSYMBOL);
        dest.writeString(this.fLAGS);
        dest.writeValue(this.pRICE);
        dest.writeValue(this.lASTUPDATE);
        dest.writeValue(this.lASTVOLUME);
        dest.writeValue(this.lASTVOLUMETO);
        dest.writeString(this.lASTTRADEID);
        dest.writeValue(this.vOLUMEDAY);
        dest.writeValue(this.vOLUMEDAYTO);
        dest.writeValue(this.vOLUME24HOUR);
        dest.writeValue(this.vOLUME24HOURTO);
        dest.writeValue(this.oPENDAY);
        dest.writeValue(this.hIGHDAY);
        dest.writeValue(this.lOWDAY);
        dest.writeValue(this.oPEN24HOUR);
        dest.writeValue(this.hIGH24HOUR);
        dest.writeValue(this.lOW24HOUR);
        dest.writeString(this.lASTMARKET);
        dest.writeValue(this.vOLUMEHOUR);
        dest.writeValue(this.vOLUMEHOURTO);
        dest.writeValue(this.oPENHOUR);
        dest.writeValue(this.hIGHHOUR);
        dest.writeValue(this.lOWHOUR);
        dest.writeValue(this.tOPTIERVOLUME24HOUR);
        dest.writeValue(this.tOPTIERVOLUME24HOURTO);
        dest.writeValue(this.cHANGE24HOUR);
        dest.writeValue(this.cHANGEPCT24HOUR);
        dest.writeValue(this.cHANGEDAY);
        dest.writeValue(this.cHANGEPCTDAY);
        dest.writeValue(this.sUPPLY);
        dest.writeValue(this.mKTCAP);
        dest.writeValue(this.tOTALVOLUME24H);
        dest.writeValue(this.tOTALVOLUME24HTO);
        dest.writeValue(this.tOTALTOPTIERVOLUME24H);
        dest.writeValue(this.tOTALTOPTIERVOLUME24HTO);
        dest.writeString(this.iMAGEURL);
    }
}