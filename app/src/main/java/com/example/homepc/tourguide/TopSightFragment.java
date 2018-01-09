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
public class TopSightFragment extends Fragment {


    public TopSightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.topsight_list, container, false);

        // Create a list of topSight objects
        final ArrayList<TopSight> list = new ArrayList<TopSight>();
        list.add(new TopSight(getText(R.string.top1_title).toString(), getText(R.string.top1_desc).toString(), getText(R.string.top1_location).toString(), R.drawable.loc_meenakshi_temple));
        list.add(new TopSight(getText(R.string.top2_title).toString(), getText(R.string.top2_desc).toString(), getText(R.string.top2_location).toString(), R.drawable.loc_palace));
        list.add(new TopSight(getText(R.string.top3_title).toString(), getText(R.string.top3_desc).toString(), getText(R.string.top3_location).toString(), R.drawable.loc_azhagar_kovil));
        list.add(new TopSight(getText(R.string.top4_title).toString(), getText(R.string.top4_desc).toString(), getText(R.string.top4_location).toString(), R.drawable.loc_pazhamuthircholai));
        list.add(new TopSight(getText(R.string.top5_title).toString(), getText(R.string.top5_desc).toString(), getText(R.string.top5_location).toString(), R.drawable.loc_1000_pillars));
        list.add(new TopSight(getText(R.string.top6_title).toString(), getText(R.string.top6_desc).toString(), getText(R.string.top6_location).toString(), R.drawable.loc_museum));
        list.add(new TopSight(getText(R.string.top7_title).toString(), getText(R.string.top7_desc).toString(), getText(R.string.top7_location).toString(), R.drawable.loc_adhisayam));
        list.add(new TopSight(getText(R.string.top8_title).toString(), getText(R.string.top8_desc).toString(), getText(R.string.top8_location).toString(), R.drawable.loc_thiruparankundram));
        list.add(new TopSight(getText(R.string.top9_title).toString(), getText(R.string.top9_desc).toString(), getText(R.string.top9_location).toString(), R.drawable.loc_mosque));
        list.add(new TopSight(getText(R.string.top10_title).toString(), getText(R.string.top10_desc).toString(), getText(R.string.top10_location).toString(), R.drawable.loc_cathedral));

        TopSightAdapter listAdapter = new TopSightAdapter(getActivity(), list);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called topSightList, which is declared in the
        // topsight_list.xml file.
        ListView listView = rootView.findViewById(R.id.topSightList);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name listAdapter.
        listView.setAdapter(listAdapter);

        return rootView;
    }
}
