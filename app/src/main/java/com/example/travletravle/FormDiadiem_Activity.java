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
public class FormDiadiem_Activity extends AppCompatActivity {
    ImageView ig1, ig2, ig3;
    TextView tieude;
    TextView diachi;
    TextView sodienthoai;
    TextView thongtin1, thongtin2;
    ImageButton iggoi, ignhan;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_diadiem);

        ig1 = findViewById(R.id.igkhachsan);
        tieude = findViewById(R.id.tieudeks);
        diachi= findViewById(R.id.noidungdiachi);
        sodienthoai= findViewById(R.id.noidunghotline);
        thongtin1= findViewById(R.id.thongtinkhachsan1);
        thongtin2 = findViewById(R.id.thongtinkhachsan2);
        ig2 = findViewById(R.id.igkhachsan1);
        ig3 = findViewById(R.id.igkhachsan2);
        iggoi = findViewById(R.id.goidiadiem);
        ignhan = findViewById(R.id.nhantinđiaiem);
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList arrayList= bundle.getStringArrayList("array");
        String string = bundle.getString("title");
        tieude.setText(string);
        diachi.setText(bundle.getString("diachidiemden"));
        sodienthoai.setText(bundle.getString("sodienthoai"));
        thongtin1.setText(bundle.getString("thongtin1"));
        thongtin2.setText(bundle.getString("thongtin2"));

        ig1.setImageResource(bundle.getInt("ig1"));
        ig2.setImageResource(bundle.getInt("ig2"));
        ig3.setImageResource(bundle.getInt("ig3"));
        arrayAdapter = new ArrayAdapter<String>(FormDiadiem_Activity.this, android.R.layout.simple_list_item_1,
                arrayList);
        sodienthoai.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel: " + sodienthoai.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });
        iggoi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel: " + sodienthoai.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });
        ignhan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                intent1.putExtra("sms_body","Hello...");
                intent1.setData(Uri.parse("sms: " + sodienthoai.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{SEND_SMS}, 1);
                }
            }
        });
        diachi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.CATEGORY_APP_MAPS);
                intent1.setData(Uri.parse("map: " + diachi.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        ACCESS_LOCATION_EXTRA_COMMANDS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{LOCATION_HARDWARE}, 1);
                }
            }
        });
    }
}