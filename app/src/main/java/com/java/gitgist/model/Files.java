package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Files implements Parcelable {

    public static final Parcelable.Creator<Files> CREATOR = new Parcelable.Creator<Files>() {
        @Override
        public Files createFromParcel(Parcel source) {
            return new Files(source);
        }

        @Override
        public Files[] newArray(int size) {
            return new Files[size];
        }
    };
    @SerializedName(value = "gistfile1.txt", alternate = {"config.json", "CoroRP_fiche_RoT.md",
            "sort_timings.zsh", "get_db3_tbl.py", "index.css", "svg", "MountainousUnsungSecurity.c"})
    private Gistfile1Txt gistfile1Txt;

    public Files() {
    }

    protected Files(Parcel in) {
        this.gistfile1Txt = in.readParcelable(Gistfile1Txt.class.getClassLoader());
    }

    public Gistfile1Txt getGistfile1Txt() {
        return gistfile1Txt;
    }

    public void setGistfile1Txt(Gistfile1Txt gistfile1Txt) {
        this.gistfile1Txt = gistfile1Txt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.gistfile1Txt, flags);
    }
}