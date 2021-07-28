package com.example.travletravle;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
import static android.Manifest.permission.SEND_SMS;
public class FormKhachsanActivity extends AppCompatActivity {
    TextView tenks, sdtks, diachiks, noidungks1, noidungks2;
    TextView giaks;
    ImageView ksig1, ksig2, ksig3;
    ArrayAdapter<String> arrayAdapter;
    ImageButton ig1, ig2;
    Button btndatks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_khachsan2);
        ig1 = findViewById(R.id.goi);
        ig2 = findViewById(R.id.nhantin);
        btndatks=findViewById(R.id.bntdatks);
        giaks =findViewById(R.id.ksgia);
        tenks = findViewById(R.id.kstieude);
        sdtks = findViewById(R.id.kshotline);
        diachiks = findViewById(R.id.ksdiachi);
        noidungks1 = findViewById(R.id.ksthongtin1);
        noidungks2 = findViewById(R.id.ksthongtin2);
        ksig1 = findViewById(R.id.igks1);
        ksig2 = findViewById(R.id.igks2);
        ksig3 = findViewById(R.id.igks3);

        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        ArrayList khachsanList= bundle.getStringArrayList("khachsan");
        String string = bundle.getString("tenks");
        tenks.setText(string);
        sdtks.setText(bundle.getString("kssdt"));
        diachiks.setText(bundle.getString("ksdiachi"));
        giaks.setText(bundle.getString("giaks"));
        noidungks1.setText(bundle.getString("ksnd1"));
        noidungks2.setText(bundle.getString("ksnd2"));
        ksig1.setImageResource(bundle.getInt("ksig1"));
        ksig2.setImageResource(bundle.getInt("ksig2"));
        ksig3.setImageResource(bundle.getInt("ksig3"));
        arrayAdapter = new ArrayAdapter<String>(FormKhachsanActivity.this, android.R.layout.simple_list_item_1,
                khachsanList);
        sdtks.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                //intent1.setAction(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel: " + sdtks.getText()));

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
                intent1.setData(Uri.parse("tel: " + sdtks.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                } }
        });
        ig2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_SENDTO);
                intent1.putExtra("sms_body","Hello...");
                intent1.setData(Uri.parse("sms: " + sdtks.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{SEND_SMS}, 1);
                }
            }
        });
        diachiks.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.CATEGORY_APP_MAPS);
                //intent1.putExtra("sms_body","Hello...");
                intent1.setData(Uri.parse("map: " + diachiks.getText()));

                if (ContextCompat.checkSelfPermission(getApplicationContext(),
                        ACCESS_LOCATION_EXTRA_COMMANDS) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent1);
                } else {
                    requestPermissions(new String[]{ACCESS_COARSE_LOCATION}, 1);

                }
            }
        });

        btndatks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(FormKhachsanActivity.this,ThongTinNguoiDungDatKSActivity.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("giaks",bundle.getString("giaks"));
                bundle1.putString("tenks",bundle.getString("tenks"));
                bundle1.putInt("hinh",bundle.getInt("image"));
                intent1.putExtras(bundle1);
                startActivity(intent1);
                finish();
            }
        });

    }

}