package com.newakkoff.excuse.tasks;

import com.newakkoff.excuse.models.ExcuseCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Фахош on 23.08.2016.
 */
public interface ExcuseCategoryInterface {

    @GET("/allexcusecategory")
    Call<List<ExcuseCategory>> getAllExcuseCategories();
}
