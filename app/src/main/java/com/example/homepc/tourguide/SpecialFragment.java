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
public class SpecialFragment extends Fragment {


    public SpecialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.special_list, container, false);

        // Create a list of speciality objects
        final ArrayList<Speciality> list = new ArrayList<Speciality>();
        list.add(new Speciality(getText(R.string.special_one).toString(), getText(R.string.chithirai_desc).toString(), R.drawable.special_chithirai));
        list.add(new Speciality(getText(R.string.special_two).toString(), getText(R.string.jallikattu_desc).toString(), R.drawable.special_jallikattu));
        list.add(new Speciality(getText(R.string.special_three).toString(), getText(R.string.cradle_desc).toString(), R.drawable.special_cradle));
        list.add(new Speciality(getText(R.string.special_four).toString(), getText(R.string.car_desc).toString(), R.drawable.special_car));
        list.add(new Speciality(getText(R.string.special_five).toString(), getText(R.string.float_desc).toString(), R.drawable.special_float));
        list.add(new Speciality(getText(R.string.special_six).toString(), getText(R.string.show_desc).toString(), R.drawable.special_show));
        list.add(new Speciality(getText(R.string.special_seven).toString(), getText(R.string.shop_desc).toString(), R.drawable.special_shop));
        list.add(new Speciality(getText(R.string.special_eight).toString(), getText(R.string.jasmine_desc).toString(), R.drawable.special_jasmine));
        list.add(new Speciality(getText(R.string.special_nine).toString(), getText(R.string.drink_desc).toString(), R.drawable.special_drink));

        SpecialityAdapter listAdapter = new SpecialityAdapter(getActivity(), list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called specialList, which is declared in the
        // special_list.xml file.
        ListView listView = rootView.findViewById(R.id.specialList);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each speciality in the list of Specialities.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name listAdapter.
        listView.setAdapter(listAdapter);

        return rootView;
    }

}
