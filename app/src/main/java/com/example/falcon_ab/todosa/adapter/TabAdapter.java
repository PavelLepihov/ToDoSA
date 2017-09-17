package com.example.falcon_ab.todosa.adapter;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.falcon_ab.todosa.fragment.CurrentTaskFragment;
import com.example.falcon_ab.todosa.fragment.DoneTaskFragment;

public class TabAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment = new DoneTaskFragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return currentTaskFragment;
            case 1: return doneTaskFragment;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
