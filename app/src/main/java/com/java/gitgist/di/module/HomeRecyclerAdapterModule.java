package com.java.gitgist.di.module;

import com.java.gitgist.feature.home.HomeNavigator;
import com.java.gitgist.feature.home.HomeRecycleAdapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Swapnil on 2/24/18.
 */

@Module(includes = HomeModule.class)
public class HomeRecyclerAdapterModule {

    @Singleton
    @Provides
    public HomeRecycleAdapter getRecycleAdapter(HomeNavigator homeNavigator){
        return new HomeRecycleAdapter(homeNavigator);
    }

}
