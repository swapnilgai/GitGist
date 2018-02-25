package com.java.gitgist.di.module;

import com.java.gitgist.network.ApiService;
import com.java.gitgist.network.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module(includes = NetModule.class)
public class DataManagerModule {

    @Provides
    @Singleton
    public ApiService getHomesAPIService(Retrofit mRetrofit) {
        return mRetrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    public DataManager getDataManager(ApiService mHomesAPIService) {
        return new DataManager(mHomesAPIService);
    }
}
