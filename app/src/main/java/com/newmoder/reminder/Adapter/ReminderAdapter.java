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

public class ReminderAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] headingArray;
    private final String[] previewArray;
    private final String[] timeArray;

    public ReminderAdapter(Activity context, String[] heading, String[] preview, String[] timeArray) {
        super(context, R.layout.list_item_reminder, heading);
        this.context = context;
        this.headingArray = heading;
        this.previewArray = preview;
        this.timeArray = timeArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.list_item_reminder, parent, false);

        TextView heading = (TextView) convertView.findViewById(R.id.list_item_reminder_heading);
        TextView preview = (TextView) convertView.findViewById(R.id.list_item_reminder_preview);
        TextView time = (TextView) convertView.findViewById(R.id.list_item_reminder_time);

        heading.setText(headingArray[position]);
        preview.setText(previewArray[position]);
        time.setText(timeArray[position]);

        return convertView;
    }
}
