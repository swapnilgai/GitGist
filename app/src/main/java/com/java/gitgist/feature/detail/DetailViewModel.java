package com.java.gitgist.feature.detail;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import com.java.gitgist.model.Gists;
import com.java.gitgist.model.temp.DetailResponse;
import com.java.gitgist.model.temp.Files;
import com.java.gitgist.network.DataManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Swapnil on 2/24/18.
 */

public class DetailViewModel extends BaseObservable {

    private DataManager mDataManager;
    public ObservableField<String> mDescription = new ObservableField<>();
    public ObservableField<String> mUserAvatarImage = new ObservableField<>();
    private DetailNavigator mDetailNavigator;
    private Files file;
    public ObservableInt hideOrUnHideFile = new ObservableInt(View.INVISIBLE);


    public DetailViewModel(DataManager mDataManager, DetailNavigator mDetailNavigator) {
        this.mDataManager = mDataManager;
        this.mDetailNavigator = mDetailNavigator;
        hideOrUnHideFile.set(View.INVISIBLE);
    }

    public void loadGistDetail(String gistId){
        Call<DetailResponse> call = mDataManager.getGistDetail(gistId);

        call.enqueue(new Callback<DetailResponse>() {
            @Override
            public void onResponse(Call<DetailResponse> call, Response<DetailResponse> response) {
                if (response.isSuccessful()) {
                    updateFields((DetailResponse)response.body());
                }
            }
            @Override
            public void onFailure(Call<DetailResponse> call, Throwable t) {
            }
        });
    }

    private void updateFields(DetailResponse detailResponse){

        try {
           if(detailResponse.getUser()!=null)
               mUserAvatarImage.set(detailResponse.getUser().getAvatarUrl());
               mDescription.set(detailResponse.getDescription());
               file = detailResponse.getFiles();

            if(file.getGistfile1Txt() !=null)
                   hideOrUnHideFile.set(View.VISIBLE);
        }catch (NullPointerException e){

        }finally {
        }
    }

    public void onClick(){
            mDetailNavigator.displayFile(file.getGistfile1Txt().getFilename(), file.getGistfile1Txt().getContent());
    }
}
