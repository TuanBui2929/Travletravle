package com.example.travletravle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourItemActivity extends AppCompatActivity {
    ImageView imageView;
    TextView tieude;
    Button bntmua;
    TextView thoigian;
    TextView giatour;
    TextView gioithieutour;
    ListView listView;

    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_item);

        imageView = findViewById(R.id.imageitemtour);
        tieude = findViewById(R.id.txttieudeitemtourrr);
        bntmua = findViewById(R.id.bntitemdattour);
        thoigian= findViewById(R.id.valuethoigian);
        giatour= findViewById(R.id.valuegiatour);
        gioithieutour= findViewById(R.id.itemgioithieutour);
        listView = findViewById(R.id.listviewlichtrinhtour);

        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        thoigian.setText(bundle.getString("thoigian"));
        giatour.setText(bundle.getString("giatour"));
        imageView.setImageResource(bundle.getInt("image"));
        ArrayList arrayList= bundle.getStringArrayList("array");
        String string = bundle.getString("title");
        tieude.setText(string);
        gioithieutour.setText(bundle.getString("gioithieu"));
        arrayAdapter = new ArrayAdapter<String>(TourItemActivity.this, android.R.layout.simple_list_item_1,
                arrayList);
        listView.setAdapter(arrayAdapter);



        bntmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(TourItemActivity.this,ThongTinNguoiDungActivity.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("gia",bundle.getString("giatour"));
                bundle1.putString("ten",bundle.getString("title"));
                bundle1.putInt("hinh",bundle.getInt("image"));
                intent1.putExtras(bundle1);
                startActivity(intent1);
                finish();

            }
        });


    }
}