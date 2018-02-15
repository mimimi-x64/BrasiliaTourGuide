package com.example.android.brasiliatourguide;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HospitaisFragment extends Fragment {

    public HospitaisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        /** Create a list */
        ArrayList<GuideList> hospitais = new ArrayList <>();

        /** Fill the list */
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));
        hospitais.add(new GuideList(R.drawable.ic_local_hospital, getString(R.string.hosp_1), getString(R.string.local_1)));
        hospitais.add(new GuideList(R.drawable.ic_local_pharmacy, getString(R.string.hosp_2), getString(R.string.local_2)));

        /** Set Adapter */
        ListAdapter hospitaisAdapter = new ListAdapter(getActivity(), hospitais);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(hospitaisAdapter);

        return rootView;
    }
}
