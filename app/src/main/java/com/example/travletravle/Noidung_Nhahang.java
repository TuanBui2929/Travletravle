package com.example.travletravle;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS;
import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission.LOCATION_HARDWARE;
import static android.Manifest.permission.SEND_SMS;
public class Noidung_Nhahang extends AppCompatActivity {
    ImageButton ig1,ig2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noidung_nhahang);
        TextView nh1, nh2, tennhahang, ngaydangnhahang, nguoidangnhahang;
        ImageView ignhahang1, ignhahang2, ignhahang3;
        ArrayAdapter<String> arrayAdapter;

        tennhahang = findViewById(R.id.tennhahang1);
        ngaydangnhahang = findViewById(R.id.ngaydangnhahang);
        nh1= findViewById(R.id.nhahang1);
        nh2= findViewById(R.id.nhahang2);
        nguoidangnhahang = findViewById(R.id.nguoivietnhahang);
        ignhahang1 = findViewById(R.id.ignhahang1);
        ignhahang2 = findViewById(R.id.ignhahang2);
        ignhahang3 = findViewById(R.id.ignhahang3);
        ig1 = findViewById(R.id.goinhahang);
        ig2 = findViewById(R.id.nhannhahang);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList listnhahang= bundle.getStringArrayList("arraynhahang");
        String string = bundle.getString("nhahang");
        tennhahang.setText(string);
        ngaydangnhahang.setText(bundle.getString("ngaydangnhahang"));
        nh1.setText(bundle.getString("nhahang1"));
        nh2.setText(bundle.getString("nhahang2"));
        nguoidangnhahang.setText(bundle.getString("nguoidangnhahang"));
        ignhahang1.setImageResource(bundle.getInt("ignhahang1"));
        ignhahang2.setImageResource(bundle.getInt("ignhahang2"));
        ignhahang3.setImageResource(bundle.getInt("ignhahang3"));
        arrayAdapter = new ArrayAdapter<String>(Noidung_Nhahang.this,
                android.R.layout.simple_list_item_1,listnhahang);
        nguoidangnhahang.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel: " + nguoidangnhahang.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });
        ig1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel: " + nguoidangnhahang.getText()));
                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });
        ig2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.putExtra("sms_body","Hello...");
                intent1.setData(Uri.parse("sms: " + nguoidangnhahang.getText()));
                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{SEND_SMS}, 1);
                }
            }
        });
        ngaydangnhahang.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.CATEGORY_APP_MAPS);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("map: " + nguoidangnhahang.getText()));
                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        ACCESS_LOCATION_EXTRA_COMMANDS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{ACCESS_COARSE_LOCATION}, 1);
                }
            }
        });

    }
}