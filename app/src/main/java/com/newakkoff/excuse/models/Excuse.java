package com.newakkoff.excuse.models;

/**
 * Created by Фахош on 19.08.2016.
 */
public class Excuse {
    private Long id;
    private String excuseUserName;
    private String excuseMassage;

    public Excuse() {
    }

    public Excuse(Long id, String excuseUserName, String excuseMassage) {
        this.id = id;
        this.excuseUserName = excuseUserName;
        this.excuseMassage = excuseMassage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExcuseUserName() {
        return excuseUserName;
    }

    public void setExcuseUserName(String excuseUserName) {
        this.excuseUserName = excuseUserName;
    }

    public String getExcuseMassage() {
        return excuseMassage;
    }

    public void setExcuseMassage(String excuseMassage) {
        this.excuseMassage = excuseMassage;
    }
}
