package com.example.smartparking.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.smartparking.R;
import com.example.smartparking.databinding.ActivityMainBinding;
import com.example.smartparking.databinding.FragmentServiceBinding;
import com.google.android.material.tabs.TabLayout;

public class BookFragment extends Fragment {
    private FragmentServiceBinding binding;
    private ActivityMainBinding binding1;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentServiceBinding.inflate(inflater,container,false);
        binding1=ActivityMainBinding.inflate(inflater,container,false);

//        View view = inflater.inflate(R.layout.fragment_service,container,false);
//        tabLayout = binding1.tabLayout;

       binding1.tabLayout.setupWithViewPager(binding1.viewPager);

        return binding.getRoot();
    }
}
