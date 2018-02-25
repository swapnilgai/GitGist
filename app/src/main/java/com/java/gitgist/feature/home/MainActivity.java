package com.java.gitgist.feature.home;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.java.gitgist.R;
import com.java.gitgist.databinding.HomeDataBinding;
import com.java.gitgist.di.component.DaggerHomeComponent;
import com.java.gitgist.di.module.HomeModule;
import com.java.gitgist.di.module.NetModule;
import com.java.gitgist.feature.detail.DetailActivity;
import com.java.gitgist.model.Gists;

import javax.inject.Inject;

public class MainActivity extends Activity implements HomeNavigator{


    @Inject
    HomeViewModel homeViewModel;

    @Inject
    HomeRecycleAdapter homeRecycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeDataBinding homeDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DaggerHomeComponent.builder().netModule(new NetModule(getString(R.string.base_url)))
                .homeModule(new HomeModule(this))
                .build()
                .inject(this);

        homeDataBinding.gistListRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        homeDataBinding.gistListRecyclerView.setAdapter(homeRecycleAdapter);
        homeDataBinding.setViewModel(homeViewModel);
    }

    @Override
    protected void onResume() {
        super.onResume();
        homeViewModel.getPublicGist();
    }

    @Override
    public void onItemClick(Gists gists) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(getString(R.string.gist_object), gists);
        startActivity(intent);
    }
}
