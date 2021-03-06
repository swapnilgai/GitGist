package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class SortTimingsZsh implements Parcelable {

    public static final Parcelable.Creator<SortTimingsZsh> CREATOR = new Parcelable.Creator<SortTimingsZsh>() {
        @Override
        public SortTimingsZsh createFromParcel(Parcel source) {
            return new SortTimingsZsh(source);
        }

        @Override
        public SortTimingsZsh[] newArray(int size) {
            return new SortTimingsZsh[size];
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

    public SortTimingsZsh() {
    }

    protected SortTimingsZsh(Parcel in) {
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