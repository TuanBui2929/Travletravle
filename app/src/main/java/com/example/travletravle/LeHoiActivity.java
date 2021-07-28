package com.example.travletravle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travletravle.adappter.AdappterSlider;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class LeHoiActivity extends AppCompatActivity {

    ImageView ig1, ig2, ig3;
    TextView tieude, diachi, ngay, noidung1, noidung2, noidung3;
    SliderView sliderView;
    ArrayAdapter<String> arrayAdapter;
    int[] image={ R.drawable.c,
            R.drawable.congchieng,
            R.drawable.festivalhoa,
            R.drawable.lehoitra,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_hoi);
        ig1 =  findViewById(R.id.ig1);
        ig2 =  findViewById(R.id.ig2);
        ig3 =  findViewById(R.id.ig3);
        tieude= findViewById(R.id.lehoitieude);
        diachi=  findViewById(R.id.diachilehoi3);
        ngay=  findViewById(R.id.ngaylehoi3);
        noidung1= findViewById(R.id.noidung1);
        noidung2= findViewById(R.id.noidung2);
        noidung3= findViewById(R.id.noidung3);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList arrayList= bundle.getStringArrayList("array");
        String string = bundle.getString("list");
        tieude.setText(string);
        ngay.setText(bundle.getString("ngay"));
        diachi.setText(bundle.getString("diachi"));

        ig1.setImageResource(bundle.getInt("ig1"));
        ig2.setImageResource(bundle.getInt("ig2"));
        ig3.setImageResource(bundle.getInt("ig3"));

        noidung1.setText(bundle.getString("ns1"));
        noidung2.setText(bundle.getString("ns2"));
        noidung3.setText(bundle.getString("ns3"));
        arrayAdapter = new ArrayAdapter<String>(LeHoiActivity.this, android.R.layout.simple_list_item_1,
                arrayList);

        sliderView= findViewById(R.id.sliderlehoi);
        AdappterSlider adappterSlider = new AdappterSlider(image);
        sliderView.setSliderAdapter(adappterSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

}