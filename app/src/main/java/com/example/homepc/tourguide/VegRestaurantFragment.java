package com.example.homepc.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class VegRestaurantFragment extends Fragment {


    public VegRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create a list of restaurant objects
        final ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        list.add(new Restaurant(getText(R.string.veg_murugan).toString(), getText(R.string.murugan_location).toString(), getText(R.string.murugan_timings).toString(), getText(R.string.murugan_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_saravana).toString(), getText(R.string.saravana_location).toString(), getText(R.string.saravana_timings).toString(), getText(R.string.saravana_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_sabarees).toString(), getText(R.string.sabarees_location).toString(), getText(R.string.sabarees_timings).toString(), getText(R.string.sabarees_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_modern).toString(), getText(R.string.modern_location).toString(), getText(R.string.modern_timings).toString(), getText(R.string.modern_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_bhojan).toString(), getText(R.string.bhojan_location).toString(), getText(R.string.bhojan_timings).toString(), getText(R.string.bhojan_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_annapoorna).toString(), getText(R.string.annapoorna_location).toString(), getText(R.string.annapoorna_timings).toString(), getText(R.string.annapoorna_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_temple).toString(), getText(R.string.temple_location).toString(), getText(R.string.temple_timings).toString(), getText(R.string.temple_special).toString()));
        list.add(new Restaurant(getText(R.string.veg_shriram).toString(), getText(R.string.shriram_location).toString(), getText(R.string.shriram_timings).toString(), getText(R.string.shriram_special).toString()));
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called restaurantList, which is declared in the
        // restaurant_list.xml file.
        ListView listView = rootView.findViewById(R.id.restaurantList);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each restaurant in the list of restaurants.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name restaurantAdapter.
        listView.setAdapter(restaurantAdapter);

        return rootView;
    }

}
