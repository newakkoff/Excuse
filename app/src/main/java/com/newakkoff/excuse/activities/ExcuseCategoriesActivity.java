package com.newakkoff.excuse.activities;

import android.support.v4.app.Fragment;

import com.newakkoff.excuse.fragments.ExcuseCategoriesListFragment;

/**
 * Created by Фахош on 19.08.2016.
 */
public class ExcuseCategoriesActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ExcuseCategoriesListFragment();
    }

    @Override
    public void onBackPressed() {
    }
}
