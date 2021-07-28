package com.example.travletravle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.travletravle.R;

import java.util.ArrayList;

public class Noidung_Amthuc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung_amthuc);
        TextView at1, at2, tenamthuc, ngaydang, nguoidangamthuc, amthucdiachi, diachiamthuc;
        ImageView igamthuc1, igamthuc2, igamthuc3;
        ArrayAdapter<String> arrayAdapter;
            tenamthuc = findViewById(R.id.tenamthuc);
            ngaydang = findViewById(R.id.ngaydang);
            at1= findViewById(R.id.amthuc1);
            at2= findViewById(R.id.amthuc2);
            nguoidangamthuc = findViewById(R.id.nguoivietamthuc);
            igamthuc1 = findViewById(R.id.igamthuc1);
            igamthuc2 = findViewById(R.id.igamthuc2);
            igamthuc3 = findViewById(R.id.igamthuc3);
            amthucdiachi = findViewById(R.id.amthucdiachi);
            Intent intent=getIntent();
            Bundle bundle= intent.getExtras();
            ArrayList listamthuc= bundle.getStringArrayList("arrayamthuc");
            String string = bundle.getString("amthuc");
            tenamthuc.setText(string);
            ngaydang.setText(bundle.getString("ngaydang"));
            at1.setText(bundle.getString("amthuc1"));
            at2.setText(bundle.getString("amthuc2"));
            amthucdiachi.setText(bundle.getString("amthucdiachi"));
            nguoidangamthuc.setText(bundle.getString("nguoidangamthuc"));
            igamthuc1.setImageResource(bundle.getInt("igamthuc1"));
            igamthuc2.setImageResource(bundle.getInt("igamthuc2"));
            igamthuc3.setImageResource(bundle.getInt("igamthuc3"));
            arrayAdapter = new ArrayAdapter<String>(Noidung_Amthuc.this, android.R.layout.simple_list_item_1,
                    listamthuc);

        }
}