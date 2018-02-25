package com.java.gitgist.feature.home;

/**
 * Created by Swapnil on 2/24/18.
 */

public class HomeItemViewModel extends HomeViewModel {

    HomeNavigator mHomeNavigator;

    public HomeItemViewModel(HomeNavigator mHomeNavigator) {
        super(null, mHomeNavigator);
        this.mHomeNavigator = mHomeNavigator;
    }

    public void onItemClicked() {
       mHomeNavigator.onItemClick(getGists());
    }
}
