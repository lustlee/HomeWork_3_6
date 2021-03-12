package com.example.homework_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.view_pager);

        setViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void setViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Names");
        adapter.addFragment(new SecondFragment(), "Numbers");
        adapter.addFragment(new ThirdFragment(), "Images");
        viewPager.setAdapter(adapter);
    }
}