package com.example.cryptocompare.apiCallAndResponse;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinInfo implements Parcelable {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Internal")
    @Expose
    private String internal;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("Algorithm")
    @Expose
    private String algorithm;
    @SerializedName("ProofType")
    @Expose
    private String proofType;
    @SerializedName("NetHashesPerSecond")
    @Expose
    private Double netHashesPerSecond;
    @SerializedName("BlockNumber")
    @Expose
    private Integer blockNumber;
    @SerializedName("BlockTime")
    @Expose
    private Integer blockTime;
    @SerializedName("BlockReward")
    @Expose
    private Double blockReward;
    @SerializedName("Type")
    @Expose
    private Integer type;
    @SerializedName("DocumentType")
    @Expose
    private String documentType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public Double getNetHashesPerSecond() {
        return netHashesPerSecond;
    }

    public void setNetHashesPerSecond(Double netHashesPerSecond) {
        this.netHashesPerSecond = netHashesPerSecond;
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public Integer getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    public Double getBlockReward() {
        return blockReward;
    }

    public void setBlockReward(Double blockReward) {
        this.blockReward = blockReward;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.fullName);
        dest.writeString(this.internal);
        dest.writeString(this.imageUrl);
        dest.writeString(this.url);
        dest.writeString(this.algorithm);
        dest.writeString(this.proofType);
        dest.writeValue(this.netHashesPerSecond);
        dest.writeValue(this.blockNumber);
        dest.writeValue(this.blockTime);
        dest.writeValue(this.blockReward);
        dest.writeValue(this.type);
        dest.writeString(this.documentType);
    }

    public CoinInfo() {
    }

    protected CoinInfo(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.fullName = in.readString();
        this.internal = in.readString();
        this.imageUrl = in.readString();
        this.url = in.readString();
        this.algorithm = in.readString();
        this.proofType = in.readString();
        this.netHashesPerSecond = (Double) in.readValue(Double.class.getClassLoader());
        this.blockNumber = (Integer) in.readValue(Integer.class.getClassLoader());
        this.blockTime = (Integer) in.readValue(Integer.class.getClassLoader());
        this.blockReward = (Double) in.readValue(Double.class.getClassLoader());
        this.type = (Integer) in.readValue(Integer.class.getClassLoader());
        this.documentType = in.readString();
    }

    public static final Parcelable.Creator<CoinInfo> CREATOR = new Parcelable.Creator<CoinInfo>() {
        @Override
        public CoinInfo createFromParcel(Parcel source) {
            return new CoinInfo(source);
        }

        @Override
        public CoinInfo[] newArray(int size) {
            return new CoinInfo[size];
        }
    };
}