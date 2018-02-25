package com.java.gitgist.di.module;

import com.java.gitgist.feature.detail.DetailNavigator;
import com.java.gitgist.feature.detail.DetailViewModel;
import com.java.gitgist.feature.home.HomeNavigator;
import com.java.gitgist.feature.home.HomeViewModel;
import com.java.gitgist.network.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module(includes = {HomeModule.class, DataManagerModule.class})
public class HomeViewModelModule {

    @Provides
    @Singleton
    public HomeViewModel getSearchResultViewModel(DataManager dataManager, HomeNavigator homeNavigator) {
        return new HomeViewModel(dataManager, homeNavigator);
    }
}
