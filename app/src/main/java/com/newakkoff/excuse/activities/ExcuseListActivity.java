package com.newakkoff.excuse.activities;

import android.support.v4.app.Fragment;

import com.newakkoff.excuse.fragments.ExcuseListFragment;

/**
 * Created by Фахош on 19.08.2016.
 */
public class ExcuseListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ExcuseListFragment();
    }

    @Override
    public void onBackPressed() {
    }
}
