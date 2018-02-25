package com.java.gitgist.di.module;

import android.content.Context;

import com.java.gitgist.feature.detail.DetailNavigator;
import com.java.gitgist.feature.home.HomeNavigator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module
public class DetailModule {

    private DetailNavigator mDetailNavigator;

    public DetailModule(DetailNavigator mDetailNavigator) {
        this.mDetailNavigator = mDetailNavigator;
    }

    @Singleton
    @Provides
    public DetailNavigator getHomeNavigator() {
        return mDetailNavigator;
    }
}
