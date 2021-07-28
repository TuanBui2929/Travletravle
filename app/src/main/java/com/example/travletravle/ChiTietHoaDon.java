package com.example.travletravle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travletravle.nameclass.HoaDon;
import com.google.firebase.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChiTietHoaDon extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;


    TextView txtperson;
    TextView txtphone;
    TextView txtemail;
    TextView tensanpham;
    TextView giasanpham;
    TextView txtngaymua;
    TextView hoadon;
    TextView tongtienthanhtoan;
    Button button;
    long mahoadon=0;
    String hd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_hoa_don);

   

//        firebaseDatabase = FirebaseDatabase.getInstance();
//        reference=firebaseDatabase.getReference("HoaDon");
//
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                if (snapshot.exists()){
//                    mahoadon=(snapshot.getChildrenCount());
//
//
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//
//        });


        txtperson=findViewById(R.id.txtperson);
        txtphone=findViewById(R.id.txtphone);
        txtemail=findViewById(R.id.txtemailhoadon);
        tensanpham=findViewById(R.id.tensanpham);
        giasanpham=findViewById(R.id.giasanpham);
        hoadon=findViewById(R.id.txtctsohoadon);
        tongtienthanhtoan=findViewById(R.id.tongtienthanhtoan);
        txtngaymua = findViewById(R.id.txtngaymua);
        button= findViewById(R.id.bntxacnhandonhang);


        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        txtperson.setText(bundle.getString("tenkh"));
        txtphone.setText(bundle.getString("sdt"));
        txtemail.setText(bundle.getString("email"));
        tensanpham.setText(bundle.getString("tentour"));
        giasanpham.setText(bundle.getString("gia"));
        tongtienthanhtoan.setText(bundle.getString("gia"));
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