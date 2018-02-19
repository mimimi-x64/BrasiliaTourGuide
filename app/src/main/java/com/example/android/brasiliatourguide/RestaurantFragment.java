package com.example.android.brasiliatourguide;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        /** Create a list */
        ArrayList<LocalList> restaurants = new ArrayList <>();

        /** Fill the list */
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));
        restaurants.add(new LocalList(R.drawable.ic_restaurant_menu, getString(R.string.restaurant_1), getString(R.string.local_1)));
        restaurants.add(new LocalList(R.drawable.ic_room_service, getString(R.string.restaurant_2), getString(R.string.local_2)));


        /** Set Adapter */
        ListAdapter restaurantAdapter = new ListAdapter(getActivity(), restaurants);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(restaurantAdapter);

        return rootView;
    }
}
