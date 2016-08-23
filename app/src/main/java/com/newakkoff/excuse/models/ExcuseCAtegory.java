package com.newakkoff.excuse.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by Фахош on 19.08.2016.
 */
@Generated("org.jsonschema2pojo")
public class ExcuseCategory {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("categoryName")
    @Expose
    private String categoryName;

    @SerializedName("categoryDescription")
    @Expose
    private String categoryDescription;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName The categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return The categoryDescription
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * @param categoryDescription The categoryDescription
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

}
