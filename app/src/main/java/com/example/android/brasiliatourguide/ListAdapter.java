package com.example.android.brasiliatourguide;

import android.content.Context;
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
 * Created by phartmann on 13/02/2018.
 */

public class ListAdapter extends ArrayAdapter<LocalList> {

    public ListAdapter(Context context, ArrayList<LocalList> localList){
        super(context, 0, localList);

    }

    @NonNull
    @Override
    public View getView( int position, @Nullable View convertView, @NonNull ViewGroup parent ) {
        View listItemView = convertView;
        //Check if the view is being reused, otherwise inflate the view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get an item on given position
        LocalList itemOnCurrentPosition = getItem(position);

        //Set images and text to list on each list
        TextView titleList = (TextView) listItemView.findViewById(R.id.title_list);
        titleList.setText(itemOnCurrentPosition.getTitleItem());

        TextView localList = (TextView) listItemView.findViewById(R.id.local_list);
        localList.setText(itemOnCurrentPosition.getLocalItem());

        ImageView itemImage = (ImageView) listItemView.findViewById(R.id.image_list);
        itemImage.setImageResource(itemOnCurrentPosition.getImageItem());

        return listItemView;
    }
}
