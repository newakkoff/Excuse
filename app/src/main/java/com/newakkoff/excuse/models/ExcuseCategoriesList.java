package com.newakkoff.excuse.models;

/**
 * Created by Фахош on 19.08.2016.
 */
public class ExcuseCategoriesList  {

    private Long id;
    private String categoryName;
    private String categoryDescription;

    public ExcuseCategoriesList() {
    }

    public ExcuseCategoriesList(Long id, String categoryName, String categoryDescription) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
