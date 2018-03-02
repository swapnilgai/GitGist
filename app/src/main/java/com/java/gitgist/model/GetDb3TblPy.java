package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class GetDb3TblPy implements Parcelable {

    public static final Parcelable.Creator<GetDb3TblPy> CREATOR = new Parcelable.Creator<GetDb3TblPy>() {
        @Override
        public GetDb3TblPy createFromParcel(Parcel source) {
            return new GetDb3TblPy(source);
        }

        @Override
        public GetDb3TblPy[] newArray(int size) {
            return new GetDb3TblPy[size];
        }
    };
    @SerializedName("filename")
    private String filename;
    @SerializedName("size")
    private int size;
    @SerializedName("language")
    private String language;
    @SerializedName("type")
    private String type;
    @SerializedName("raw_url")
    private String rawUrl;

    public GetDb3TblPy() {
    }

    protected GetDb3TblPy(Parcel in) {
        this.filename = in.readString();
        this.size = in.readInt();
        this.language = in.readString();
        this.type = in.readString();
        this.rawUrl = in.readString();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.filename);
        dest.writeInt(this.size);
        dest.writeString(this.language);
        dest.writeString(this.type);
        dest.writeString(this.rawUrl);
    }
}