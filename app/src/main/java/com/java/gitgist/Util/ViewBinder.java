package com.java.gitgist.Util;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

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
}
