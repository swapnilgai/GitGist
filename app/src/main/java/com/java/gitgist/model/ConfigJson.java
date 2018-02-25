package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ConfigJson implements Parcelable {

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

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setRawUrl(String rawUrl){
		this.rawUrl = rawUrl;
	}

	public String getRawUrl(){
		return rawUrl;
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

	public ConfigJson() {
	}

	protected ConfigJson(Parcel in) {
		this.filename = in.readString();
		this.size = in.readInt();
		this.language = in.readString();
		this.type = in.readString();
		this.rawUrl = in.readString();
	}

	public static final Parcelable.Creator<ConfigJson> CREATOR = new Parcelable.Creator<ConfigJson>() {
		@Override
		public ConfigJson createFromParcel(Parcel source) {
			return new ConfigJson(source);
		}

		@Override
		public ConfigJson[] newArray(int size) {
			return new ConfigJson[size];
		}
	};
}