package com.contact.yen.recyclerview1.model;

import android.widget.ImageView;

public class ObjectImage {
    private int mImageId;
    private String mName;

    public ObjectImage() {
    }

    public ObjectImage(int mImageId, String mName) {
        this.mImageId = mImageId;
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public ObjectImage(int mImageId) {
        this.mImageId = mImageId;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }
}
