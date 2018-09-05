package com.yj;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.yj.widget.YJTabLayout;

public class MainActivity extends AppCompatActivity {

    private String[] strings={"A","B","C","D","E","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YJTabLayout tabLayout = (YJTabLayout) findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return new TestFragment();
            }

            @Override
            public int getCount() {
                return strings.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }
}
