package com.java.gitgist.di.module;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.java.gitgist.feature.detail.DetailNavigator;
import com.java.gitgist.feature.detail.DetailViewModel;
import com.java.gitgist.network.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module(includes = {DetailModule.class, DataManagerModule.class})
public class DetailViewModelModule {

    @Provides
    @Singleton
    public DetailViewModel getSearchResultViewModel(DataManager dataManager, DetailNavigator mDetailNavigator) {
        return new DetailViewModel(dataManager, mDetailNavigator);
    }
}
