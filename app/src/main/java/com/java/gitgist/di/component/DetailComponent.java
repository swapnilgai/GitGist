package com.java.gitgist.di.component;

import com.java.gitgist.di.module.DataManagerModule;
import com.java.gitgist.di.module.NetModule;
import com.java.gitgist.feature.detail.DetailActivity;
import com.java.gitgist.feature.home.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Swapnil on 2/24/18.
 */

@Singleton
@Component(modules = {DataManagerModule.class, NetModule.class})
public interface DetailComponent {
    void inject(DetailActivity detailActivity);
}
