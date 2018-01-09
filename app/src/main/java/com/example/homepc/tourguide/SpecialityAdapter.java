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
 * Created by Home pc on 1/6/2018.
 */

public class SpecialityAdapter extends ArrayAdapter<Speciality> {


    /**
     * Create a new {@link SpecialityAdapter} object.
     *
     * @param context        is the current context (i.e. Activity) that the adapter is being created in.
     * @param specialityList is the list of {@link Speciality}s to be displayed.
     */

    public SpecialityAdapter(Activity context, ArrayList<Speciality> specialityList) {
        super(context, 0, specialityList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.special_list_item, parent, false);
        }


        // Get the {@link Speciality} object located at this position in the list
        final Speciality currentSpeciality = getItem(position);

        // Find the TextView in the special_list_item.xml with the ID special_title
        TextView titleTextView = listItemView.findViewById(R.id.special_title);
        // Get the title from the current Speciality object and
        // set this text on the special_title TextView
        titleTextView.setText(currentSpeciality.getmTitle());

        // Find the TextView in the special_list_item.xml with the ID special_desc
        TextView descTextView = listItemView.findViewById(R.id.special_desc);
        // Get the description from the current Speciality object and
        // set this text on the special_desc TextView
        descTextView.setText(currentSpeciality.getmDesc());

        // Find the ImageView in the special_list_item.xml with the ID special_image
        ImageView imageView = listItemView.findViewById(R.id.special_image);

        // Display the provided image based on the resource ID
        imageView.setImageResource(currentSpeciality.getmImageResourceId());

        // Return the whole special list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
