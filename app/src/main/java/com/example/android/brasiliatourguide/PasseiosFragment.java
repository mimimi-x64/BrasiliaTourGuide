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
public class PasseiosFragment extends Fragment {


    public PasseiosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        /** Create a list */
        ArrayList<LocalList> passeios = new ArrayList <>();

        /** Fill the list */
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));
        passeios.add(new LocalList(R.drawable.ic_pool, getString(R.string.passeio_1), getString(R.string.local_1)));
        passeios.add(new LocalList(R.drawable.ic_beach_access, getString(R.string.passeio_2), getString(R.string.local_2)));



        /** Set Adapter */
        ListAdapter passeiosAdapter = new ListAdapter(getActivity(), passeios);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(passeiosAdapter);

        return rootView;
    }

}
