package com.newakkoff.excuse.tasks;

import com.newakkoff.excuse.models.ExcuseCategory;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Фахош on 23.08.2016.
 */
public interface ExcuseCategoryInterface {

    @GET("/ExcuseCategory/getAllExcuseCategories")
    Call<ArrayList<ExcuseCategory>> getAllExcuseCategories();
}
