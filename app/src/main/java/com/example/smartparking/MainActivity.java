package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smartparking.adapter.MainFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private final int[] TAB_TITLES = new int[]{R.string.menu_parking,R.string.menu_booking,R.string.menu_me};
    private final int[] TAB_IMAGES = new int[]{R.mipmap.parkingspace,R.mipmap.book,R.mipmap.me};

    ViewPager viewPager;
    TabLayout tabLayout;

    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //注意控件定义和绑定的位置
        viewPager =  findViewById(R.id.view_pager);
        tabLayout =  findViewById(R.id.tab_layout);

        initPager();

        setTabs(tabLayout,getLayoutInflater(),TAB_TITLES,TAB_IMAGES);
    }

    private void setTabs(TabLayout tabLayout, LayoutInflater inflater,int[] tabTitles,int[] tabImages){
        for(int i = 0;i < tabImages.length;i++){

            TabLayout.Tab tab = tabLayout.newTab();
            View view = inflater.inflate(R.layout.item_main_menu,null);

            tab.setCustomView(view);

            TextView textView =(TextView) view.findViewById(R.id.txt_tab);
            textView.setText(tabTitles[i]);

            ImageView imageView = (ImageView) view.findViewById(R.id.img_tab);
            imageView.setImageResource(tabImages[i]);

            tabLayout.addTab(tab);
        }
    }

    private void initPager(){
        adapter = new MainFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(),false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}