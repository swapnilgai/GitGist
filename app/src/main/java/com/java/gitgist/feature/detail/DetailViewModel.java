package com.java.gitgist.feature.detail;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.java.gitgist.network.DataManager;

/**
 * Created by Swapnil on 2/24/18.
 */

public class DetailViewModel extends BaseObservable {

    private DataManager mDataManager;
    private DetailNavigator mDetailNavigator;
    private ObservableField<String> mDescription;
    private ObservableField<Boolean> mFile;

    public DetailViewModel(DataManager mDataManager, DetailNavigator mDetailNavigator) {
        this.mDataManager = mDataManager;
        this.mDetailNavigator = mDetailNavigator;
    }
}
