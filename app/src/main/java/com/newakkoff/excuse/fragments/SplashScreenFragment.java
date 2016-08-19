package com.newakkoff.excuse.fragments;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newakkoff.excuse.R;

import java.util.concurrent.TimeUnit;


public class SplashScreenFragment extends Fragment {
    String TAG = "SplashScreen Exception";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash_screen, container, false);

        SplashTask splashTask = new SplashTask();
        splashTask.execute();

        return view;
    }



    class SplashTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Log.e(TAG, e + " ");
            }

            startActivity(new Intent(getActivity(), ExcuseListActivity.class));

            return null;
        }
    }
}
