package com.example.imageselector;

import android.graphics.Rect;

public class ImageRecord {
    private Rect rect;
    private String imageInfo;

    public ImageRecord(Rect rect, String imageInfo) {
        this.rect = rect;
        this.imageInfo = imageInfo;
    }

    public Rect getRect() {
        return rect;
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }


    public String getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(String imageInfo) {
        this.imageInfo = imageInfo;
    }

    @Override
    public String toString() {
        return "rect=" + rect +
                ", imageInfo='" + imageInfo + '\'';
    }
}
