package com.example.android.brasiliatourguide;

/**
 * Created by phartmann on 13/02/2018.
 */

public class LocalList {

    /** Encapsulation */
    private int imageItem;
    private String titleItem;
    private String localItem;

    /** Constructors */
    public LocalList( int imageItem, String titleItem, String localItem ) {

        this.imageItem = imageItem;
        this.titleItem = titleItem;
        this.localItem = localItem;
    }

    /** Getters */
    public int getImageItem() {
        return imageItem;
    }

    public String getTitleItem() {
        return titleItem;
    }

    public String getLocalItem() {
        return localItem;
    }
}
