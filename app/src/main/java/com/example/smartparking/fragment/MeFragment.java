package com.example.smartparking.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.smartparking.databinding.ActivityMainBinding;
import com.example.smartparking.databinding.FragmentMeBinding;
import com.google.android.material.tabs.TabLayout;

public class MeFragment extends Fragment {

    private ActivityMainBinding binding;
    private FragmentMeBinding binding_me;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding  = ActivityMainBinding.inflate(inflater,container,false);
        binding_me = FragmentMeBinding.inflate(inflater,container,false);

        binding.tabLayout.setupWithViewPager(binding.viewPager);

        return binding_me.getRoot();
    }
}
