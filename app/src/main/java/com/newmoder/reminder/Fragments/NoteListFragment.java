package com.newmoder.reminder.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.newmoder.reminder.Adapter.NoteAdapter;
import com.newmoder.reminder.R;

public class NoteListFragment extends Fragment {
    String[] testHeadings = {"Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen"};
    String[] testPreview = {"Und diesmal alleine", "Für die nächsten 5 Tage", "und entstauben", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        NoteAdapter noteAdapter = new NoteAdapter(getActivity(), testHeadings, testPreview);
        ListView notesList = (ListView) view.findViewById(R.id.fragment_list);
        notesList.setAdapter(noteAdapter);
    }

}
