package com.example.homepc.tourguide;

/**
 * Created by Home pc on 1/2/2018.
 */

public class Restaurant {


    /**
     * Name of the Restaurant
     */
    private String mTitle;

    /**
     * Location of the Restaurant
     */
    private String mLocation;

    /**
     * Working hours of the Restaurant
     */
    private String mTimings;

    /**
     * Famous dishes in the Restaurant
     */
    private String mItem;

    /**
     * Create a new Restaurant object.
     *
     * @param title    is the name of the Restaurant
     * @param location is the location of the Restaurant
     * @param timings  is the working hours of the Restaurant
     * @param item     is the Famous dishes in the Restaurant
     */
    public Restaurant(String title, String location, String timings, String item) {
        mTitle = title;
        mLocation = location;
        mTimings = timings;
        mItem = item;

    }

    //Returns the name of the Restaurant
    public String getmTitle() {
        return mTitle;
    }

    //Returns the location of the Restaurant
    public String getmLocation() {
        return mLocation;
    }

    //Returns the working hours of the Restaurant
    public String getmTimings() {
        return mTimings;
    }

    //Returns the Famous dishes in the Restaurant
    public String getmItem() {
        return mItem;
    }
}
