package com.newakkoff.excuse.activities;

import android.support.v4.app.Fragment;

import com.newakkoff.excuse.fragments.SplashScreenFragment;

/**
 * Created by Фахош on 19.08.2016.
 */
public class SplashScreenActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment() {
        return new SplashScreenFragment();
    }
}
