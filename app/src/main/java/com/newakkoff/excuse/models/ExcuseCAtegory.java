package com.newakkoff.excuse.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

/**
 * Created by Фахош on 19.08.2016.
 */
@Generated("org.jsonschema2pojo")
public class ExcuseCategory implements Parcelable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("categoryDescription")
    @Expose
    private String categoryDescription;
    @SerializedName("allExcuses")
    @Expose
    private List<Excuse> allExcuses;

    public static final Parcelable.Creator<ExcuseCategory> CREATOR = new Creator<ExcuseCategory>() {

        @Override
        public ExcuseCategory createFromParcel(Parcel source) {
            return new ExcuseCategory(source);
        }

        @Override
        public ExcuseCategory[] newArray(int size) {
            return new ExcuseCategory[size];
        }
    };

    public ExcuseCategory(Parcel in) {
        setId(in.readString());
        setCategoryName(in.readString());
        setCategoryDescription(in.readString());
        setAllExcuses(in.createTypedArrayList(Excuse.CREATOR));
    }

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

    /**
     * @return The allExcuses
     */
    public List<Excuse> getAllExcuses() {
        return allExcuses;
    }

    /**
     * @param allExcuses The allExcuses
     */
    public void setAllExcuses(List<Excuse> allExcuses) {
        this.allExcuses = allExcuses;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getId());
        dest.writeString(getCategoryName());
        dest.writeString(getCategoryDescription());
        dest.writeTypedList(getAllExcuses());
     }
}
