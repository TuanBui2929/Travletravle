package com.example.travletravle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Noidung_Baiviet extends AppCompatActivity {
    TextView nd1, nd2, tenbai, ngaydang, nguoidang;
    ImageView igbaiviet1, igbaiviet2, igbaiviet3;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung_baiviet);

        tenbai = findViewById(R.id.tenbaiviet);
        ngaydang = findViewById(R.id.ngaydangbaiviet);
        nd1 = findViewById(R.id.baiviet1);
        nd2 = findViewById(R.id.baiviet2);
        nguoidang = findViewById(R.id.nguoiviet);
        igbaiviet1 = findViewById(R.id.igbaiviet1);
        igbaiviet2 = findViewById(R.id.igbaiviet2);
        igbaiviet3 = findViewById(R.id.igbaiviet3);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList listbaiviet= bundle.getStringArrayList("arraybaiviet");
        String string = bundle.getString("baiviet");
        tenbai.setText(string);
        ngaydang.setText(bundle.getString("ngaydang"));
        nd1.setText(bundle.getString("baiviet1"));
        nd2.setText(bundle.getString("baiviet2"));
        nguoidang.setText(bundle.getString("nguoidang"));
        igbaiviet1.setImageResource(bundle.getInt("igbaiviet1"));
        igbaiviet2.setImageResource(bundle.getInt("igbaiviet2"));
        igbaiviet3.setImageResource(bundle.getInt("igbaiviet3"));
        arrayAdapter = new ArrayAdapter<String>(Noidung_Baiviet.this, android.R.layout.simple_list_item_1,
                listbaiviet);
    }
}