package com.java.gitgist.network;

import com.java.gitgist.model.Gists;
import com.java.gitgist.model.temp.DetailResponse;

import java.util.List;

import okhttp3.ResponseBody;
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
        return mApiService.getPublicGist(pageNumber);
    }

    public Call<ResponseBody> getFileFromServer(String fileUrl) {
        return mApiService.getFileFromServer(fileUrl);
    }

    public Call<DetailResponse> getGistDetail(String gistId) {
        return mApiService.getGistDetail(gistId);
    }

}
