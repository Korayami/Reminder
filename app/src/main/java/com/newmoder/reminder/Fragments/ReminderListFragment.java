package com.newmoder.reminder.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.newmoder.reminder.Adapter.ReminderAdapter;
import com.newmoder.reminder.R;

public class ReminderListFragment extends Fragment {
    String[] testHeadings = {"Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen"};
    String[] testPreview = {"Und diesmal alleine", "Für die nächsten 5 Tage", "und entstauben", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen"};
    String[] testTime = {"20:00", "20:00", "20:00", "12:00", "12:00", "12:00", "15:00", "15:00", "16:00"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ReminderAdapter reminderAdapter = new ReminderAdapter(getActivity(), testHeadings, testPreview, testTime);
        ListView list = (ListView) view.findViewById(R.id.fragment_list);
        list.setAdapter(reminderAdapter);
    }

}
