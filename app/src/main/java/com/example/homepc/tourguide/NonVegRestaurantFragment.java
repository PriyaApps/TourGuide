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
public class NonVegRestaurantFragment extends Fragment {


    public NonVegRestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create a list of restaurant objects
        final ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        list.add(new Restaurant(getText(R.string.nv_konar).toString(), getText(R.string.konar_location).toString(), getText(R.string.konar_timings).toString(), getText(R.string.konar_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_chandran).toString(), getText(R.string.chandran_location).toString(), getText(R.string.chandran_timings).toString(), getText(R.string.chandran_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_amma).toString(), getText(R.string.amma_location).toString(), getText(R.string.amma_timings).toString(), getText(R.string.amma_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_kumar).toString(), getText(R.string.kumar_location).toString(), getText(R.string.kumar_timings).toString(), getText(R.string.kumar_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_amsavalli).toString(), getText(R.string.amsavalli_location).toString(), getText(R.string.amsavalli_timings).toString(), getText(R.string.amsavalli_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_janakiram).toString(), getText(R.string.janakiram_location).toString(), getText(R.string.janakiram_timings).toString(), getText(R.string.janakiram_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_anbagam).toString(), getText(R.string.anbagam_location).toString(), getText(R.string.anbagam_timings).toString(), getText(R.string.anbagam_special).toString()));
        list.add(new Restaurant(getText(R.string.nv_ameer).toString(), getText(R.string.ameer_location).toString(), getText(R.string.ameer_timings).toString(), getText(R.string.ameer_special).toString()));

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
