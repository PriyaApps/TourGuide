package com.example.homepc.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Home pc on 1/2/2018.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    /**
     * Create a new {@link RestaurantAdapter} object.
     *
     * @param context        is the current context (i.e. Activity) that the adapter is being created in.
     * @param restaurantList is the list of {@link Restaurant}s to be displayed.
     */

    public RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurantList) {
        super(context, 0, restaurantList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant_list_item, parent, false);
        }


        // Get the {@link Restaurant} object located at this position in the list
        final Restaurant currentRestaurant = getItem(position);

        // Find the TextView in the restaurant_list_item.xml layout with the ID title_text
        TextView titleTextView = listItemView.findViewById(R.id.title_text);
        // Get the title from the current Restaurant object and
        // set this text on the title_text TextView
        titleTextView.setText(currentRestaurant.getmTitle());


        // Find the TextView in the restaurant_list_item.xml layout with the ID location_text
        TextView locTextView = listItemView.findViewById(R.id.location_text);
        // Get the location from the current Restaurant object and
        // set this text on the location_text TextView
        locTextView.setText(currentRestaurant.getmLocation());

        // Find the TextView in the restaurant_list_item.xml layout with the ID timing_text
        TextView timeTextView = listItemView.findViewById(R.id.timing_text);
        // Get the timing from the current Restaurant object and
        // set this text on the timing_text TextView
        timeTextView.setText(currentRestaurant.getmTimings());

        // Find the TextView in the restaurant_list_item.xml layout with the ID famous_text
        TextView famousTextView = listItemView.findViewById(R.id.famous_text);
        // Get the famous item from the current Restaurant object and
        // set this text on the famous_text TextView
        famousTextView.setText(currentRestaurant.getmItem());


        // Return the whole restaurant list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
