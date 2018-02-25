package com.java.gitgist.network;

import com.java.gitgist.model.Gists;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Swapnil on 2/23/18.
 */

public class DataManager {

    private static String TAG = DataManager.class.getSimpleName();
    private ApiService mApiService;

    public DataManager(ApiService homesAPIService) {
        this.mApiService = homesAPIService;
    }


    public Call<List<Gists>> makeLocalGistApiCall(String pageNumber) {
        return  mApiService.getPublicGist(pageNumber);
    }

    public Call<Object> makeGistDetailApiCall(List<Object> body) {

        return null;
    }
}
