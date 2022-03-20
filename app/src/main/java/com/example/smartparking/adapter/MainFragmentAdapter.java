package com.example.smartparking.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.smartparking.fragment.BookFragment;
import com.example.smartparking.fragment.MeFragment;
import com.example.smartparking.fragment.ParkFragment;

public class MainFragmentAdapter extends FragmentPagerAdapter {

    public MainFragmentAdapter(FragmentManager fm){
        super(fm);
    }

    public Fragment getItem(int i){
        Fragment fragment = null;
        switch(i){
            case 0:
                fragment = new ParkFragment();
                break;
            case 1:
                fragment = new BookFragment();
                break;
            case 2:
                fragment = new MeFragment();
                break;
        }
        return fragment;
    }

    public int getCount(){
        return 3;
    }
}
