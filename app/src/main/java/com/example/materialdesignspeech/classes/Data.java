package com.example.materialdesignspeech.classes;

import androidx.annotation.DrawableRes;

public class Data {

    @DrawableRes
    private int imageId;
    private String title;
    private String description;
    private String price;

    public Data(int imageId, String title, String description, String price) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @DrawableRes
    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() { return price; }

    @Override
    public String toString() {
        return "Data{" +
                "imageId=" + imageId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
