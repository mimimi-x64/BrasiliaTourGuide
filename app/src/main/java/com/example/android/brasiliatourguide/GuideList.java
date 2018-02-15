package com.example.android.brasiliatourguide;

/**
 * Created by phartmann on 13/02/2018.
 */

public class GuideList {

    /** Encapsulation */
    private int ImageItem;
    private String titleItem;
    private String localItem;

    /** Constructors */
    public GuideList( String titleItem, String localItem ) {
        this.titleItem = titleItem;
        this.localItem = localItem;
    }

    public GuideList( int imageItem, String titleItem, String localItem ) {

        ImageItem = imageItem;
        this.titleItem = titleItem;
        this.localItem = localItem;
    }

    /** Getters */
    public int getImageItem() {
        return ImageItem;
    }

    public String getTitleItem() {
        return titleItem;
    }

    public String getLocalItem() {
        return localItem;
    }
}
