package com.example.homepc.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Home pc on 12/29/2017.
 */

public class TopSightAdapter extends ArrayAdapter<TopSight> {


    /**
     * Create a new {@link TopSightAdapter} object.
     *
     * @param context      is the current context (i.e. Activity) that the adapter is being created in.
     * @param topSightList is the list of {@link TopSight}s to be displayed.
     */

    public TopSightAdapter(Activity context, ArrayList<TopSight> topSightList) {
        super(context, 0, topSightList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.topsight_list_item, parent, false);
        }


        // Get the {@link TopSight} object located at this position in the list
        final TopSight currentTopSight = getItem(position);

        // Find the TextView in the topsight_list_item.xml with the ID top_title
        TextView titleTextView = listItemView.findViewById(R.id.top_title);
        // Get the title from the current TopSight object and
        // set this text on the top_title TextView
        titleTextView.setText(currentTopSight.getmTitle());

        // Find the TextView in the topsight_list_item.xml with the ID top_desc
        TextView descTextView = listItemView.findViewById(R.id.top_desc);
        // Get the description from the current TopSight object and
        // set this text on the top_desc TextView
        descTextView.setText(currentTopSight.getmDesc());

        // Find the TextView in the topsight_list_item.xml with the ID top_location
        TextView locTextView = listItemView.findViewById(R.id.top_location);
        // Get the location from the current TopSight object and
        // set this text on the top_location TextView
        locTextView.setText(currentTopSight.getmLocation());

        // Find the ImageView in the topsight_list_item.xml with the ID top_image
        ImageView topSightView = listItemView.findViewById(R.id.top_image);

        // Display the provided image based on the resource ID
        topSightView.setImageResource(currentTopSight.getmImageResourceId());

        // Return the whole topsight list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
