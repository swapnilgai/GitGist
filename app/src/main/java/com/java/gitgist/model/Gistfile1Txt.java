package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Gistfile1Txt implements Parcelable {

    public static final Parcelable.Creator<Gistfile1Txt> CREATOR = new Parcelable.Creator<Gistfile1Txt>() {
        @Override
        public Gistfile1Txt createFromParcel(Parcel source) {
            return new Gistfile1Txt(source);
        }

        @Override
        public Gistfile1Txt[] newArray(int size) {
            return new Gistfile1Txt[size];
        }
    };
    @SerializedName("filename")
    private String filename;
    @SerializedName("size")
    private int size;
    @SerializedName("truncated")
    private boolean truncated;
    @SerializedName("language")
    private String language;
    @SerializedName("type")
    private String type;
    @SerializedName("raw_url")
    private String rawUrl;
    @SerializedName("content")
    private String content;

    public Gistfile1Txt() {
    }

    protected Gistfile1Txt(Parcel in) {
        this.filename = in.readString();
        this.size = in.readInt();
        this.truncated = in.readByte() != 0;
        this.language = in.readString();
        this.type = in.readString();
        this.rawUrl = in.readString();
        this.content = in.readString();
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

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.filename);
        dest.writeInt(this.size);
        dest.writeByte(this.truncated ? (byte) 1 : (byte) 0);
        dest.writeString(this.language);
        dest.writeString(this.type);
        dest.writeString(this.rawUrl);
        dest.writeString(this.content);
    }
}