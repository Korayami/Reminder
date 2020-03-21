package com.newmoder.reminder.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.newmoder.reminder.Adapter.BookmarkAdapter;
import com.newmoder.reminder.Adapter.NoteAdapter;
import com.newmoder.reminder.R;

public class BookmarkListFragment extends Fragment {
    String[] testHeadings = {"Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen", "Wäsche waschen", "Essen kochen", "Zimmer aufräumen"};
    String[] testUrls = {"https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX", "https://api.newmoder.com/request?=XXXXXXXXXXXXXXXXXXXX"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        BookmarkAdapter bookmarkAdapter = new BookmarkAdapter(getActivity(), testHeadings, testUrls);
        ListView list = (ListView) view.findViewById(R.id.fragment_list);
        list.setAdapter(bookmarkAdapter);
    }

}
