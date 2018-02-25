package com.java.gitgist.feature.detail;

import android.os.Bundle;
import android.app.Activity;

import com.java.gitgist.R;
import com.java.gitgist.di.component.DaggerDetailComponent;
import com.java.gitgist.di.module.DetailModule;
import com.java.gitgist.di.module.NetModule;
import com.java.gitgist.model.Gists;

import javax.inject.Inject;

public class DetailActivity extends Activity implements DetailNavigator {

    @Inject
    DetailViewModel detailViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DaggerDetailComponent.builder().netModule(new NetModule(getString(R.string.base_url))).detailModule(new DetailModule(this)).build().inject(this);

        Gists gists = getIntent().getParcelableExtra(getString(R.string.gist_object));

        detailViewModel.loadFileData(gists.getFiles().getGistfile1Txt().getRawUrl());

    }
}
