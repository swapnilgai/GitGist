package com.java.gitgist.feature.home;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.java.gitgist.feature.detail.DetailNavigator;
import com.java.gitgist.model.Gists;
import com.java.gitgist.network.DataManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Swapnil on 2/24/18.
 */

public class HomeViewModel extends BaseObservable {

    private DataManager mDataManager;
    private Gists gists;
    public final ObservableList<Gists> items = new ObservableArrayList<>();

    public HomeViewModel(DataManager mDataManager, HomeNavigator mHomeNavigator) {
        this.mDataManager = mDataManager;
    }

    public  void getPublicGist(){
        mDataManager.makeLocalGistApiCall("1").enqueue(new Callback<List<Gists>>() {
            @Override
            public void onResponse(Call<List<Gists>> call, Response<List<Gists>> response) {
                List<Gists> gistList = (List<Gists>) response.body();
                items.addAll(gistList);
            }
            @Override
            public void onFailure(Call<List<Gists>> call, Throwable throwable) {
            }
        });
    }

    public Gists getGists() {
        return gists;
    }

    public void setGists(Gists gists) {
        this.gists = gists;
    }
}
