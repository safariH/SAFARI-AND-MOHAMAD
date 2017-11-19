package com.example.hilary.happytimesapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by HILARY on 11/18/2017.
 */

class FragmentsTabAdapter extends FragmentPagerAdapter {
    public FragmentsTabAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                About first=new About();
                return first;
            case 1:
                Events second=new Events();
                return second;
            case 2:
                Services third=new Services();
                return third;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:

                return "Tab1";
            case 1:

                return "tab2";
            case 2:

                return "Tab3";
        }
        return super.getPageTitle(position);
    }
}
