package com.newakkoff.excuse.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by Фахош on 19.08.2016.
 */
@Generated("org.jsonschema2pojo")
public class Excuse implements Parcelable {

    @SerializedName("excuseTitle")
    @Expose
    private String excuseTitle;
    @SerializedName("excuseContent")
    @Expose
    private String excuseContent;

    public static final Creator<Excuse> CREATOR = new Creator<Excuse>() {
        @Override
        public Excuse createFromParcel(Parcel source) {
            return new Excuse(source);
        }

        @Override
        public Excuse[] newArray(int size) {
            return new Excuse[size];
        }
    };

    public Excuse(Parcel source) {
        setExcuseTitle(source.readString());
        setExcuseContent(source.readString());
    }

    /**
     *
     * @return
     * The excuseTitle
     */
    public String getExcuseTitle() {
        return excuseTitle;
    }

    /**
     *
     * @param excuseTitle
     * The excuseTitle
     */
    public void setExcuseTitle(String excuseTitle) {
        this.excuseTitle = excuseTitle;
    }

    /**
     *
     * @return
     * The excuseContent
     */
    public String getExcuseContent() {
        return excuseContent;
    }

    /**
     *
     * @param excuseContent
     * The excuseContent
     */
    public void setExcuseContent(String excuseContent) {
        this.excuseContent = excuseContent;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(getExcuseTitle());
        dest.writeString(getExcuseContent());
    }
}
