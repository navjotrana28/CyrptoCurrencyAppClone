package com.example.cryptocompare.apiCallAndResponse;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USD_ implements Parcelable {

    @SerializedName("FROMSYMBOL")
    @Expose
    private String fROMSYMBOL;
    @SerializedName("TOSYMBOL")
    @Expose
    private String tOSYMBOL;
    @SerializedName("MARKET")
    @Expose
    private String mARKET;
    @SerializedName("PRICE")
    @Expose
    private String pRICE;
    @SerializedName("LASTUPDATE")
    @Expose
    private String lASTUPDATE;
    @SerializedName("LASTVOLUME")
    @Expose
    private String lASTVOLUME;
    @SerializedName("LASTVOLUMETO")
    @Expose
    private String lASTVOLUMETO;
    @SerializedName("LASTTRADEID")
    @Expose
    private String lASTTRADEID;
    @SerializedName("VOLUMEDAY")
    @Expose
    private String vOLUMEDAY;
    @SerializedName("VOLUMEDAYTO")
    @Expose
    private String vOLUMEDAYTO;
    @SerializedName("VOLUME24HOUR")
    @Expose
    private String vOLUME24HOUR;
    @SerializedName("VOLUME24HOURTO")
    @Expose
    private String vOLUME24HOURTO;
    @SerializedName("OPENDAY")
    @Expose
    private String oPENDAY;
    @SerializedName("HIGHDAY")
    @Expose
    private String hIGHDAY;
    @SerializedName("LOWDAY")
    @Expose
    private String lOWDAY;
    @SerializedName("OPEN24HOUR")
    @Expose
    private String oPEN24HOUR;
    @SerializedName("HIGH24HOUR")
    @Expose
    private String hIGH24HOUR;
    @SerializedName("LOW24HOUR")
    @Expose
    private String lOW24HOUR;
    @SerializedName("LASTMARKET")
    @Expose
    private String lASTMARKET;
    @SerializedName("VOLUMEHOUR")
    @Expose
    private String vOLUMEHOUR;
    @SerializedName("VOLUMEHOURTO")
    @Expose
    private String vOLUMEHOURTO;
    @SerializedName("OPENHOUR")
    @Expose
    private String oPENHOUR;
    @SerializedName("HIGHHOUR")
    @Expose
    private String hIGHHOUR;
    @SerializedName("LOWHOUR")
    @Expose
    private String lOWHOUR;
    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private String tOPTIERVOLUME24HOUR;
    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private String tOPTIERVOLUME24HOURTO;
    @SerializedName("CHANGE24HOUR")
    @Expose
    private String cHANGE24HOUR;
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private String cHANGEPCT24HOUR;
    @SerializedName("CHANGEDAY")
    @Expose
    private String cHANGEDAY;
    @SerializedName("CHANGEPCTDAY")
    @Expose
    private String cHANGEPCTDAY;
    @SerializedName("SUPPLY")
    @Expose
    private String sUPPLY;
    @SerializedName("MKTCAP")
    @Expose
    private String mKTCAP;
    @SerializedName("TOTALVOLUME24H")
    @Expose
    private String tOTALVOLUME24H;
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private String tOTALVOLUME24HTO;
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private String tOTALTOPTIERVOLUME24H;
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private String tOTALTOPTIERVOLUME24HTO;
    @SerializedName("IMAGEURL")
    @Expose
    private String iMAGEURL;

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

    public String getMARKET() {
        return mARKET;
    }

    public void setMARKET(String mARKET) {
        this.mARKET = mARKET;
    }

    public String getPRICE() {
        return pRICE;
    }

    public void setPRICE(String pRICE) {
        this.pRICE = pRICE;
    }

    public String getLASTUPDATE() {
        return lASTUPDATE;
    }

    public void setLASTUPDATE(String lASTUPDATE) {
        this.lASTUPDATE = lASTUPDATE;
    }

    public String getLASTVOLUME() {
        return lASTVOLUME;
    }

    public void setLASTVOLUME(String lASTVOLUME) {
        this.lASTVOLUME = lASTVOLUME;
    }

    public String getLASTVOLUMETO() {
        return lASTVOLUMETO;
    }

    public void setLASTVOLUMETO(String lASTVOLUMETO) {
        this.lASTVOLUMETO = lASTVOLUMETO;
    }

    public String getLASTTRADEID() {
        return lASTTRADEID;
    }

    public void setLASTTRADEID(String lASTTRADEID) {
        this.lASTTRADEID = lASTTRADEID;
    }

    public String getVOLUMEDAY() {
        return vOLUMEDAY;
    }

    public void setVOLUMEDAY(String vOLUMEDAY) {
        this.vOLUMEDAY = vOLUMEDAY;
    }

    public String getVOLUMEDAYTO() {
        return vOLUMEDAYTO;
    }

    public void setVOLUMEDAYTO(String vOLUMEDAYTO) {
        this.vOLUMEDAYTO = vOLUMEDAYTO;
    }

    public String getVOLUME24HOUR() {
        return vOLUME24HOUR;
    }

    public void setVOLUME24HOUR(String vOLUME24HOUR) {
        this.vOLUME24HOUR = vOLUME24HOUR;
    }

    public String getVOLUME24HOURTO() {
        return vOLUME24HOURTO;
    }

    public void setVOLUME24HOURTO(String vOLUME24HOURTO) {
        this.vOLUME24HOURTO = vOLUME24HOURTO;
    }

    public String getOPENDAY() {
        return oPENDAY;
    }

    public void setOPENDAY(String oPENDAY) {
        this.oPENDAY = oPENDAY;
    }

    public String getHIGHDAY() {
        return hIGHDAY;
    }

    public void setHIGHDAY(String hIGHDAY) {
        this.hIGHDAY = hIGHDAY;
    }

    public String getLOWDAY() {
        return lOWDAY;
    }

    public void setLOWDAY(String lOWDAY) {
        this.lOWDAY = lOWDAY;
    }

    public String getOPEN24HOUR() {
        return oPEN24HOUR;
    }

    public void setOPEN24HOUR(String oPEN24HOUR) {
        this.oPEN24HOUR = oPEN24HOUR;
    }

    public String getHIGH24HOUR() {
        return hIGH24HOUR;
    }

    public void setHIGH24HOUR(String hIGH24HOUR) {
        this.hIGH24HOUR = hIGH24HOUR;
    }

    public String getLOW24HOUR() {
        return lOW24HOUR;
    }

    public void setLOW24HOUR(String lOW24HOUR) {
        this.lOW24HOUR = lOW24HOUR;
    }

    public String getLASTMARKET() {
        return lASTMARKET;
    }

    public void setLASTMARKET(String lASTMARKET) {
        this.lASTMARKET = lASTMARKET;
    }

    public String getVOLUMEHOUR() {
        return vOLUMEHOUR;
    }

    public void setVOLUMEHOUR(String vOLUMEHOUR) {
        this.vOLUMEHOUR = vOLUMEHOUR;
    }

    public String getVOLUMEHOURTO() {
        return vOLUMEHOURTO;
    }

    public void setVOLUMEHOURTO(String vOLUMEHOURTO) {
        this.vOLUMEHOURTO = vOLUMEHOURTO;
    }

    public String getOPENHOUR() {
        return oPENHOUR;
    }

    public void setOPENHOUR(String oPENHOUR) {
        this.oPENHOUR = oPENHOUR;
    }

    public String getHIGHHOUR() {
        return hIGHHOUR;
    }

    public void setHIGHHOUR(String hIGHHOUR) {
        this.hIGHHOUR = hIGHHOUR;
    }

    public String getLOWHOUR() {
        return lOWHOUR;
    }

    public void setLOWHOUR(String lOWHOUR) {
        this.lOWHOUR = lOWHOUR;
    }

    public String getTOPTIERVOLUME24HOUR() {
        return tOPTIERVOLUME24HOUR;
    }

    public void setTOPTIERVOLUME24HOUR(String tOPTIERVOLUME24HOUR) {
        this.tOPTIERVOLUME24HOUR = tOPTIERVOLUME24HOUR;
    }

    public String getTOPTIERVOLUME24HOURTO() {
        return tOPTIERVOLUME24HOURTO;
    }

    public void setTOPTIERVOLUME24HOURTO(String tOPTIERVOLUME24HOURTO) {
        this.tOPTIERVOLUME24HOURTO = tOPTIERVOLUME24HOURTO;
    }

    public String getCHANGE24HOUR() {
        return cHANGE24HOUR;
    }

    public void setCHANGE24HOUR(String cHANGE24HOUR) {
        this.cHANGE24HOUR = cHANGE24HOUR;
    }

    public String getCHANGEPCT24HOUR() {
        return cHANGEPCT24HOUR;
    }

    public void setCHANGEPCT24HOUR(String cHANGEPCT24HOUR) {
        this.cHANGEPCT24HOUR = cHANGEPCT24HOUR;
    }

    public String getCHANGEDAY() {
        return cHANGEDAY;
    }

    public void setCHANGEDAY(String cHANGEDAY) {
        this.cHANGEDAY = cHANGEDAY;
    }

    public String getCHANGEPCTDAY() {
        return cHANGEPCTDAY;
    }

    public void setCHANGEPCTDAY(String cHANGEPCTDAY) {
        this.cHANGEPCTDAY = cHANGEPCTDAY;
    }

    public String getSUPPLY() {
        return sUPPLY;
    }

    public void setSUPPLY(String sUPPLY) {
        this.sUPPLY = sUPPLY;
    }

    public String getMKTCAP() {
        return mKTCAP;
    }

    public void setMKTCAP(String mKTCAP) {
        this.mKTCAP = mKTCAP;
    }

    public String getTOTALVOLUME24H() {
        return tOTALVOLUME24H;
    }

    public void setTOTALVOLUME24H(String tOTALVOLUME24H) {
        this.tOTALVOLUME24H = tOTALVOLUME24H;
    }

    public String getTOTALVOLUME24HTO() {
        return tOTALVOLUME24HTO;
    }

    public void setTOTALVOLUME24HTO(String tOTALVOLUME24HTO) {
        this.tOTALVOLUME24HTO = tOTALVOLUME24HTO;
    }

    public String getTOTALTOPTIERVOLUME24H() {
        return tOTALTOPTIERVOLUME24H;
    }

    public void setTOTALTOPTIERVOLUME24H(String tOTALTOPTIERVOLUME24H) {
        this.tOTALTOPTIERVOLUME24H = tOTALTOPTIERVOLUME24H;
    }

    public String getTOTALTOPTIERVOLUME24HTO() {
        return tOTALTOPTIERVOLUME24HTO;
    }

    public void setTOTALTOPTIERVOLUME24HTO(String tOTALTOPTIERVOLUME24HTO) {
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
        dest.writeString(this.fROMSYMBOL);
        dest.writeString(this.tOSYMBOL);
        dest.writeString(this.mARKET);
        dest.writeString(this.pRICE);
        dest.writeString(this.lASTUPDATE);
        dest.writeString(this.lASTVOLUME);
        dest.writeString(this.lASTVOLUMETO);
        dest.writeString(this.lASTTRADEID);
        dest.writeString(this.vOLUMEDAY);
        dest.writeString(this.vOLUMEDAYTO);
        dest.writeString(this.vOLUME24HOUR);
        dest.writeString(this.vOLUME24HOURTO);
        dest.writeString(this.oPENDAY);
        dest.writeString(this.hIGHDAY);
        dest.writeString(this.lOWDAY);
        dest.writeString(this.oPEN24HOUR);
        dest.writeString(this.hIGH24HOUR);
        dest.writeString(this.lOW24HOUR);
        dest.writeString(this.lASTMARKET);
        dest.writeString(this.vOLUMEHOUR);
        dest.writeString(this.vOLUMEHOURTO);
        dest.writeString(this.oPENHOUR);
        dest.writeString(this.hIGHHOUR);
        dest.writeString(this.lOWHOUR);
        dest.writeString(this.tOPTIERVOLUME24HOUR);
        dest.writeString(this.tOPTIERVOLUME24HOURTO);
        dest.writeString(this.cHANGE24HOUR);
        dest.writeString(this.cHANGEPCT24HOUR);
        dest.writeString(this.cHANGEDAY);
        dest.writeString(this.cHANGEPCTDAY);
        dest.writeString(this.sUPPLY);
        dest.writeString(this.mKTCAP);
        dest.writeString(this.tOTALVOLUME24H);
        dest.writeString(this.tOTALVOLUME24HTO);
        dest.writeString(this.tOTALTOPTIERVOLUME24H);
        dest.writeString(this.tOTALTOPTIERVOLUME24HTO);
        dest.writeString(this.iMAGEURL);
    }

    public USD_() {
    }

    protected USD_(Parcel in) {
        this.fROMSYMBOL = in.readString();
        this.tOSYMBOL = in.readString();
        this.mARKET = in.readString();
        this.pRICE = in.readString();
        this.lASTUPDATE = in.readString();
        this.lASTVOLUME = in.readString();
        this.lASTVOLUMETO = in.readString();
        this.lASTTRADEID = in.readString();
        this.vOLUMEDAY = in.readString();
        this.vOLUMEDAYTO = in.readString();
        this.vOLUME24HOUR = in.readString();
        this.vOLUME24HOURTO = in.readString();
        this.oPENDAY = in.readString();
        this.hIGHDAY = in.readString();
        this.lOWDAY = in.readString();
        this.oPEN24HOUR = in.readString();
        this.hIGH24HOUR = in.readString();
        this.lOW24HOUR = in.readString();
        this.lASTMARKET = in.readString();
        this.vOLUMEHOUR = in.readString();
        this.vOLUMEHOURTO = in.readString();
        this.oPENHOUR = in.readString();
        this.hIGHHOUR = in.readString();
        this.lOWHOUR = in.readString();
        this.tOPTIERVOLUME24HOUR = in.readString();
        this.tOPTIERVOLUME24HOURTO = in.readString();
        this.cHANGE24HOUR = in.readString();
        this.cHANGEPCT24HOUR = in.readString();
        this.cHANGEDAY = in.readString();
        this.cHANGEPCTDAY = in.readString();
        this.sUPPLY = in.readString();
        this.mKTCAP = in.readString();
        this.tOTALVOLUME24H = in.readString();
        this.tOTALVOLUME24HTO = in.readString();
        this.tOTALTOPTIERVOLUME24H = in.readString();
        this.tOTALTOPTIERVOLUME24HTO = in.readString();
        this.iMAGEURL = in.readString();
    }

    public static final Parcelable.Creator<USD_> CREATOR = new Parcelable.Creator<USD_>() {
        @Override
        public USD_ createFromParcel(Parcel source) {
            return new USD_(source);
        }

        @Override
        public USD_[] newArray(int size) {
            return new USD_[size];
        }
    };
}
