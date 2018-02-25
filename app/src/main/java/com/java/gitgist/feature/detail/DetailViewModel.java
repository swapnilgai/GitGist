package com.java.gitgist.feature.detail;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.util.Log;

import com.java.gitgist.network.DataManager;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

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

    public void loadFileData(String fileUrl){
        Call<ResponseBody> call = mDataManager.getFileFromServer(fileUrl);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "server contacted and has file");

                    try {
                        String str = response.body().string().toString();
                        Log.d(TAG, "file download was a success? " + str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, "error");
            }
        });
    }

}
