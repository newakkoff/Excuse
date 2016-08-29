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
import com.newakkoff.excuse.activities.ExcuseCategoriesActivity;
import com.newakkoff.excuse.models.ExcuseCategory;
import com.newakkoff.excuse.tasks.ExcuseCategoryInterface;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SplashScreenFragment extends Fragment {

    private String TAG = "SplashScreenFragment";
    private Retrofit retrofit;
    private String BASE_URL = "http://10.0.2.2:8080";
    private ExcuseCategoryInterface excuseCategoryInterface;
    private ArrayList<ExcuseCategory> excuseCategoryList;


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
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            excuseCategoryInterface = retrofit.create(ExcuseCategoryInterface.class);

            Call<ArrayList<ExcuseCategory>> getCategoryList = excuseCategoryInterface.getAllExcuseCategories();

            try {
                excuseCategoryList = getCategoryList.execute().body();
            } catch (IOException e) {

                Log.i(TAG, "doInBackground: IOException" + e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            Intent intent = new Intent(getActivity(), ExcuseCategoriesActivity.class);
            if (excuseCategoryList != null) {
                intent.putParcelableArrayListExtra("allCategories", excuseCategoryList);
            } else {
                Log.i(TAG, "onPostExecute: excuseCategoryList = null");
            }
            startActivity(intent);
        }


    }
}
