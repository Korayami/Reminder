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

public class NoteAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] headingArray;
    private final String[] textArray;

    public NoteAdapter(Activity context, String[] heading, String[] text) {
        super(context, R.layout.list_item_note, heading);
        this.context = context;
        this.headingArray = heading;
        this.textArray = text;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.list_item_note, parent, false);

        TextView heading = (TextView) convertView.findViewById(R.id.list_item_note_heading);
        TextView preview = (TextView) convertView.findViewById(R.id.list_item_note_preview);

        heading.setText(headingArray[position]);
        preview.setText(textArray[position]);

        return convertView;
    }
}
