package com.java.gitgist.Util;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.java.gitgist.R;
import com.java.gitgist.feature.home.HomeRecycleAdapter;
import com.java.gitgist.model.Gists;

import java.util.List;

/**
 * Created by Swapnil on 2/24/18.
 */

public class ViewBinder {

    @SuppressWarnings("unchecked")
    @BindingAdapter("items")
    public static void setAutoSuggestList(RecyclerView view, List<Gists> list) {

        ArrayRecyclerAdapter adapter = (HomeRecycleAdapter) view.getAdapter();
        if (adapter != null) {
            adapter.addAll(list);
            adapter.notifyDataSetChanged();
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("imageUrl")
    public static void loadNetworkImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .fallback(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(imageView);
    }
}
