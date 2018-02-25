package com.java.gitgist.feature.home;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.java.gitgist.R;
import com.java.gitgist.Util.ArrayRecyclerAdapter;
import com.java.gitgist.databinding.HomeGistItemDataBinding;
import com.java.gitgist.model.Gists;

/**
 * Created by Swapnil on 2/24/18.
 */

public class HomeRecycleAdapter extends ArrayRecyclerAdapter<Gists, RecyclerView.ViewHolder> {

    HomeNavigator mHomeNavigator;

    public HomeRecycleAdapter(HomeNavigator mHomeNavigator) {
        this.mHomeNavigator = mHomeNavigator;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeGistItemDataBinding homeGistItemDataBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.home_gist_item,
                parent,
                false
        );
        return new HomeRecycleAdapter.DataResultHolder(homeGistItemDataBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof HomeRecycleAdapter.DataResultHolder) {
            Gists gists = getItem(position);
            HomeItemViewModel homeItemViewModel = new HomeItemViewModel(mHomeNavigator);
            homeItemViewModel.setGists(gists);
            ((DataResultHolder) holder).binding.setViewModel(homeItemViewModel);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class DataResultHolder extends RecyclerView.ViewHolder {

        private final HomeGistItemDataBinding binding;

        public DataResultHolder(HomeGistItemDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
