package com.example.vs00481543.phonecallrecorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment pageFragment=new FragmentClass();

        Bundle  bundle=new Bundle();
        bundle.putInt("number",position+1);
        pageFragment.setArguments(bundle);
            return pageFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
