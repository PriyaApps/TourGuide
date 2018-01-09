package com.example.homepc.tourguide;

/**
 * Created by Home pc on 1/6/2018.
 */

public class Speciality {


    /**
     * Title of the special thing
     */
    private String mTitle;

    /**
     * Description about the Speciality
     */
    private String mDesc;

    /**
     * Image resource ID for the Speciality
     */
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param title           is the title of the special thing
     * @param desc            is the description about the Speciality
     * @param imageResourceId is the drawable resource ID for the image associated with the Speciality
     */
    public Speciality(String title, String desc, int imageResourceId) {
        mTitle = title;
        mDesc = desc;
        mImageResourceId = imageResourceId;
    }


   //Returns the title of the special thing
    public String getmTitle() {
        return mTitle;
    }

    //Returns the description about the Speciality
    public String getmDesc() {
        return mDesc;
    }

    //Returns the drawable resource ID for the image associated with the Speciality
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
