package com.java.gitgist.di.module;

import com.java.gitgist.feature.detail.DetailNavigator;
import com.java.gitgist.feature.home.HomeNavigator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module
public class HomeModule {

    private HomeNavigator mHomeNavigator;

    public HomeModule(HomeNavigator mHomeNavigator) {
        this.mHomeNavigator = mHomeNavigator;
    }

    @Singleton
    @Provides
    public HomeNavigator getHomeNavigator() {
        return mHomeNavigator;
    }
}
