package com.calculator.cashback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.calculator.cashback.Fragments.AllCardsFragment;
import com.calculator.cashback.Fragments.CalculateFragment;

/**
 * Created by kt_ki on 8/8/2017.
 */

public class PagerFragmentAdapter extends FragmentPagerAdapter {
    public PagerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {

            case 0: return CalculateFragment.newInstance("","");
            case 1: return AllCardsFragment.newInstance("SecondFragment", "Instance 1");
            case 2: return CalculateFragment.newInstance("","");
            default: return CalculateFragment.newInstance("","");
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Calculate";
            case 1: return "All Cards";
            case 2: return "Calculate";
            default: return "Calculate";
        }
    }
}