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
public class HoteisFragment extends Fragment {

    public HoteisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        /** Create a list */
        ArrayList<GuideList> hoteis = new ArrayList <>();

        /** Fill the list*/
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));
        hoteis.add(new GuideList(R.drawable.ic_business, getString(R.string.hotel_1), getString(R.string.praça_1)));
        hoteis.add(new GuideList(R.drawable.ic_account_balance, getString(R.string.hotel_2), getString(R.string.praça_2)));

        /** Set Adapter*/
        ListAdapter hotelAdapter = new ListAdapter(getActivity(), hoteis);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(hotelAdapter);

        return rootView;
    }
}
