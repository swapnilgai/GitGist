package com.java.gitgist.network;

import com.java.gitgist.model.Gists;
import com.java.gitgist.model.temp.DetailResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Swapnil on 2/23/18.
 */

public interface ApiService {

    @GET("gists")
    Call<List<Gists>> getPublicGist(@Query("page") String pageNumber);

    @GET("gists/{gist_id}")
    Call<DetailResponse> getGistDetail(@Path("gist_id") String gistId);

    @GET
    Call<ResponseBody> getFileFromServer(@Url String fileUrl);
}
