package com.example.travletravle.adappter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.travletravle.fragment.BaiVietFragment;
import com.example.travletravle.fragment.TinTucFragment;

public class PagerTintucAdappter extends FragmentPagerAdapter {
    private int numoftab;
    public PagerTintucAdappter(@NonNull FragmentManager fm, int numoftab) {
        super(fm);
        this.numoftab =numoftab;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        BaiVietFragment baiVietFragment = new BaiVietFragment();
        TinTucFragment tinTucFragment = new TinTucFragment();
        switch(position){
            case 0:
                return new TinTucFragment();
            case 1:
                return new BaiVietFragment();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return 2 ;
    }

}
