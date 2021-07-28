package com.example.travletravle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class Noidung_Tintuc extends AppCompatActivity {
    TextView tt1, tt2, tentintuc, ngaydangtintuc, nguoidangtintuc;
    ImageView igtintuc1, igtintuc2, igtintuc3;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung_tintuc);

        tentintuc = findViewById(R.id.tentintuc);
        ngaydangtintuc = findViewById(R.id.ngaydangtintuc);
        tt1= findViewById(R.id.tintuc1);
        tt2= findViewById(R.id.tintuc2);
        nguoidangtintuc = findViewById(R.id.nguoiviettintuc);
        igtintuc1 = findViewById(R.id.igtintuc1);
        igtintuc2 = findViewById(R.id.igtintuc2);
        igtintuc3 = findViewById(R.id.igtintuc3);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList listtintuc= bundle.getStringArrayList("arraytintuc");
        String string = bundle.getString("tintuc");
        tentintuc.setText(string);
        ngaydangtintuc.setText(bundle.getString("ngaydangtintuc"));
        tt1.setText(bundle.getString("tintuc1"));
        tt2.setText(bundle.getString("tintuc2"));
        nguoidangtintuc.setText(bundle.getString("nguoidangtintuc"));
        igtintuc1.setImageResource(bundle.getInt("igtintuc1"));
        igtintuc2.setImageResource(bundle.getInt("igtintuc2"));
        igtintuc3.setImageResource(bundle.getInt("igtintuc3"));
        arrayAdapter = new ArrayAdapter<String>(Noidung_Tintuc.this, android.R.layout.simple_list_item_1,
                listtintuc);

    }
}