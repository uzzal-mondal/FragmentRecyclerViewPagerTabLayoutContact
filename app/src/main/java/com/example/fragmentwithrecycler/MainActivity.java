package com.example.fragmentwithrecycler;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragmentwithrecycler.Call.FragmentCall;
import com.example.fragmentwithrecycler.Contact.FragmentContact;
import com.example.fragmentwithrecycler.Fav.FragmentFav;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout_id);
        viewPager = findViewById(R.id.viewPager_id);

        //viewpager adapter er akta obj create.
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        //view pager adapter dara fragment gulo add korbo..
       viewPagerAdapter.addFragment(new FragmentCall(),"");
       viewPagerAdapter.addFragment(new FragmentContact(),"");
       viewPagerAdapter.addFragment(new FragmentFav(),"");

       //viewPager ta adapter e set kore dibo.. then tablayout keo set kore dibo.
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        // tablayout for set icon..
        tabLayout.getTabAt(0).setIcon(R.drawable.call_black);
        tabLayout.getTabAt(1).setIcon(R.drawable.group_back);
        tabLayout.getTabAt(2).setIcon(R.drawable.star_black);

        //remove shadow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);





    }
}
