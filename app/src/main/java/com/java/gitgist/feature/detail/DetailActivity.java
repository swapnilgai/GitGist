package com.java.gitgist.feature.detail;

import android.app.Dialog;
import android.databinding.DataBindingUtil;
import android.databinding.generated.callback.OnClickListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.java.gitgist.R;
import com.java.gitgist.databinding.DetailDataBinding;
import com.java.gitgist.di.component.DaggerDetailComponent;
import com.java.gitgist.di.module.DetailModule;
import com.java.gitgist.di.module.NetModule;
import com.java.gitgist.model.Files;
import com.java.gitgist.model.Gists;

import javax.inject.Inject;

public class DetailActivity extends Activity implements DetailNavigator {

    @Inject
    DetailViewModel detailViewModel;
    private Dialog mDialog;
    private TextView fileTitle;
    private TextView fileDescription;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DetailDataBinding detailDataBinding= DataBindingUtil.setContentView(this, R.layout.activity_detail);

        DaggerDetailComponent.builder().netModule(new NetModule(getString(R.string.base_url))).detailModule(new DetailModule(this)).build().inject(this);

        detailDataBinding.setViewModel(detailViewModel);

        Gists gists = getIntent().getParcelableExtra(getString(R.string.gist_object));

        setDialog();

        detailViewModel.loadGistDetail(gists.getId());

    }

    private void setDialog(){
        mDialog = new Dialog(this);
        mDialog.setContentView(R.layout.file_detail_dialog);
        fileTitle = mDialog.findViewById(R.id.file_name);
        fileDescription = mDialog.findViewById(R.id.file_description);
        button = mDialog.findViewById(R.id.file_close);
        // if button is clicked, close the custom dialog
        button.setOnClickListener((View v) -> {
            mDialog.dismiss();
        });
    }

    @Override
    public void displayFile(String title, String content) {
        fileTitle.setText(title);
        fileDescription.setText(content);
        mDialog.show();
    }
}
