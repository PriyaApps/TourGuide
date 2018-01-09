package com.example.homepc.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Home pc on 1/3/2018.
 */

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    public RestaurantPagerAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;

    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position is the position of the current fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VegRestaurantFragment();
        } else {
            return new NonVegRestaurantFragment();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * Return the title for the current view.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_veg);
        } else {
            return mContext.getString(R.string.category_nonveg);
        }
    }
}
