package com.example.travletravle;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.travletravle.adappter.PagerTintucAdappter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
public class TinTucActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tin_tuc);
        TabLayout tableLayout = findViewById(R.id.TabTinTuc);
        TabItem doan = findViewById(R.id.tintuc);
        TabItem nhahang = findViewById(R.id.sukien);
        ViewPager viewPager = findViewById(R.id.viewPapertintuc);
        PagerTintucAdappter adappter = new PagerTintucAdappter(getSupportFragmentManager(),tableLayout.getTabCount());
        viewPager.setAdapter(adappter);
        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               viewPager.setCurrentItem(tab.getPosition());
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