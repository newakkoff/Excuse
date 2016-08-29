package com.newakkoff.excuse.activities;

import android.support.v4.app.Fragment;

import com.newakkoff.excuse.fragments.ExcusesListFragment;

public class ExcuseListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ExcusesListFragment();
    }


}
