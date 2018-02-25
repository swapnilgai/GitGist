package com.java.gitgist.di.component;

import com.java.gitgist.di.module.DataManagerModule;
import com.java.gitgist.di.module.HomeModule;
import com.java.gitgist.di.module.HomeRecyclerAdapterModule;
import com.java.gitgist.di.module.HomeViewModelModule;
import com.java.gitgist.di.module.NetModule;
import com.java.gitgist.feature.home.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Swapnil on 2/24/18.
 */

@Singleton
@Component(modules = {DataManagerModule.class, NetModule.class, HomeModule.class, HomeViewModelModule.class, HomeRecyclerAdapterModule.class})
public interface HomeComponent {
    void inject(MainActivity mainActivity);
}
