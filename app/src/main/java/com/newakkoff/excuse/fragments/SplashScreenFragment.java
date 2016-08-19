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
import com.newakkoff.excuse.activities.ExcuseListActivity;

import java.util.concurrent.TimeUnit;


public class SplashScreenFragment extends Fragment {

    private String TAG = "SplashScreen Exception";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash_screen, container, false);

        new SplashTask().execute();


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
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            startActivity(new Intent(getActivity(), ExcuseListActivity.class));
        }
    }
}
