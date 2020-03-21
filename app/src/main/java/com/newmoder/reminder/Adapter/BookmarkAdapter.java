package com.newmoder.reminder.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.newmoder.reminder.R;

public class BookmarkAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] headingArray;
    private final String[] urlArray;

    public BookmarkAdapter(Activity context, String[] heading, String[] url) {
        super(context, R.layout.list_item_bookmark, heading);
        this.context = context;
        this.headingArray = heading;
        this.urlArray = url;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.list_item_bookmark, parent, false);

        TextView heading = (TextView) convertView.findViewById(R.id.list_item_bookmark_heading);
        TextView url = (TextView) convertView.findViewById(R.id.list_item_bookmark_url);

        heading.setText(headingArray[position]);
        url.setText(urlArray[position]);

        return convertView;
    }
}
