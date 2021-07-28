package com.example.travletravle.adappter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.travletravle.fragment.MonAnFragment;
import com.example.travletravle.fragment.NhaHangFragment;

public class PagerAdappter extends FragmentPagerAdapter {

    private int numoftab;
    public PagerAdappter(@NonNull FragmentManager fm,int numoftab) {
        super(fm);
        this.numoftab =numoftab;

    }

    @NonNull


    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new MonAnFragment();
            case 1: return new NhaHangFragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return numoftab ;
    }
}
