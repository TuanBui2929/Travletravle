package com.example.travletravle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class chi_tiet_hoa_don_ks extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;


    TextView txtperson;
    TextView txtphone;
    TextView txtemail;
    TextView tenks;
    TextView giakhachsan;
    TextView txtngaymua;
    TextView hoadon;
    TextView tongtienthanhtoan;
    Button button;
    long mahoadon=0;
    String hd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_hoa_don_ks);


        txtperson=findViewById(R.id.txtperson);
        txtphone=findViewById(R.id.txtphone);
        txtemail=findViewById(R.id.txtemailhoadon);
        tenks=findViewById(R.id.tenks);
        giakhachsan=findViewById(R.id.giakhachsan);
        hoadon=findViewById(R.id.txtctsohoadon);
        tongtienthanhtoan=findViewById(R.id.tongtienthanhtoan);
        txtngaymua = findViewById(R.id.txtngaymua);
        button= findViewById(R.id.bntxacnhandonhang);


        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        txtperson.setText(bundle.getString("tenkh"));
        txtphone.setText(bundle.getString("sdt"));
        txtemail.setText(bundle.getString("email"));
        tenks.setText(bundle.getString("tenks"));
        giakhachsan.setText(bundle.getString("giaks"));
        tongtienthanhtoan.setText(bundle.getString("giaks"));
        String x= String.valueOf(bundle.getInt("shd"));
        hoadon.setText(x);

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngay=simpleDateFormat.format(calendar.getTime());
        txtngaymua.setText(ngay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



//                HoaDon hoaDon = new HoaDon((int) mahoadon+1,ngay,bundle.getString("tenkh"),bundle.getString("sdt"),bundle.getString("email"),
//                        bundle.getString("gia"),bundle.getString("tentour"));
//                reference.child(String.valueOf(mahoadon+1)).setValue(hoaDon);
//
//                Toast.makeText(ChiTietHoaDon.this, "Đặt Hàng Thành Công", Toast.LENGTH_LONG).show();
                finish();


            }
        });


    }
}