package com.newmoder.reminder.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.newmoder.reminder.Fragments.BookmarkListFragment;
import com.newmoder.reminder.Fragments.NoteListFragment;
import com.newmoder.reminder.Fragments.ReminderListFragment;


public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                //Notizen
                fragment = new NoteListFragment();
                break;
            case 1:
                // Erinnerungen
                fragment = new ReminderListFragment();
                break;
            case 2:
                // Lesezeichen
                fragment = new BookmarkListFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String res = "";
        switch (position){
            case 0: res = "Notizen"; break;
            case 1: res = "Erinnerungen"; break;
            case 2: res = "Lesezeichen"; break;
        }
        return res;
    }
}
