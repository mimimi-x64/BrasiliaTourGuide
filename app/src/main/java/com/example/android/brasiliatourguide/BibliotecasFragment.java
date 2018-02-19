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
public class BibliotecasFragment extends Fragment {

    public BibliotecasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);

        /** Create a list */
        ArrayList<LocalList> bibliotecas = new ArrayList <>();

        /** Fill the list */
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));
        bibliotecas.add(new LocalList(R.drawable.ic_library_books, getString(R.string.biblio_1), getString(R.string.local_1)));
        bibliotecas.add(new LocalList(R.drawable.ic_local_library, getString(R.string.biblio_2), getString(R.string.local_2)));





















        /** Set Adapter */
        ListAdapter bibliotecasAdapter = new ListAdapter(getActivity(), bibliotecas);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(bibliotecasAdapter);

        return rootView;
    }
}
