package com.example.travletravle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.travletravle.adappter.AdappterSlider;
import com.example.travletravle.adappter.PagerAdappter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class AmThucActivity extends AppCompatActivity {
    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int[] image={ R.drawable.nh11, R.drawable.laubo1, R.drawable.nh71, R.drawable.banhcan1,};
        setContentView(R.layout.activity_am_thuc);
        TabLayout tableLayout = findViewById(R.id.TabAmthuwc);
        TabItem doan = findViewById(R.id.MonAn);
        TabItem nhahang = findViewById(R.id.NhaHang);
        ViewPager viewPager = findViewById(R.id.viewPaperAmthuc);
        PagerAdappter adappter = new PagerAdappter(getSupportFragmentManager(),tableLayout.getTabCount());
        viewPager.setAdapter(adappter);
        sliderView= findViewById(R.id.slideramthuc);
        AdappterSlider adappterSlider = new AdappterSlider(image);
        sliderView.setSliderAdapter(adappterSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
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