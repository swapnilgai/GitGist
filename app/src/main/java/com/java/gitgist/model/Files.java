package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class Files implements Parcelable {

	@SerializedName("gistfile1.txt")
	private Gistfile1Txt gistfile1Txt;

	protected Files(Parcel in) {
	}

	public static final Creator<Files> CREATOR = new Creator<Files>() {
		@Override
		public Files createFromParcel(Parcel in) {
			return new Files(in);
		}

		@Override
		public Files[] newArray(int size) {
			return new Files[size];
		}
	};

	public void setGistfile1Txt(Gistfile1Txt gistfile1Txt){
		this.gistfile1Txt = gistfile1Txt;
	}

	public Gistfile1Txt getGistfile1Txt(){
		return gistfile1Txt;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
	}
}