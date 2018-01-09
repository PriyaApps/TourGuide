package com.example.homepc.tourguide;

/**
 * Created by Home pc on 12/29/2017.
 */

public class TopSight {


    /**
     * Name of the TopSight
     */
    private String mTitle;

    /**
     * Description about the TopSight
     */
    private String mDesc;

    /**
     * Location of the TopSight
     */
    private String mLocation;

    /**
     * Image resource ID for the TopSight
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param title           is the name of the Top Sight
     * @param desc            is the description about the Top Sight
     * @param location        is the location of the TopSight
     * @param imageResourceId is the drawable resource ID for the image associated with the Top Sight
     */
    public TopSight(String title, String desc, String location, int imageResourceId) {
        mTitle = title;
        mDesc = desc;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    //Returns the name of the Top Sight
    public String getmTitle() {
        return mTitle;
    }

    //Returns the description about the Top Sight
    public String getmDesc() {
        return mDesc;
    }

    //Returns the drawable resource ID for the image associated with the Top Sight
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    //Returns the location of the TopSight
    public String getmLocation() {
        return mLocation;
    }
}
