package com.example.travletravle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travletravle.nameclass.hoadonks;
import com.example.travletravle.nameclass.KhachHang;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ThongTinNguoiDungDatKSActivity extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    Button bnthuy;
    Button bntxacnhan;
    EditText txttenkh;
    EditText txtsodtkh;
    EditText txtemailkh;


    long mahoadon=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_nguoi_dung_datks);
        firebaseDatabase = FirebaseDatabase.getInstance();
        reference=firebaseDatabase.getReference("hoadonks");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    mahoadon=(snapshot.getChildrenCount());
                } }
            @Override
            public void onCancelled(@NonNull DatabaseError error) { }});
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngay=simpleDateFormat.format(calendar.getTime());
        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();
        String tenks=bundle.getString("tenks");
        String giaks=bundle.getString("giaks");
        int hinh=bundle.getInt("hinh");
        bnthuy= findViewById(R.id.bnthuy);
        bntxacnhan= findViewById(R.id.bntxacnhan);
        txttenkh= findViewById(R.id.edtnhaptenkhachhang);
        txtsodtkh= findViewById(R.id.edtnhapsodienthoaikhachhang);
        txtemailkh= findViewById(R.id.edtnhapemailkhachhang);


        bnthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bntxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenkh = txttenkh.getText().toString();
                String sdt = txtsodtkh.getText().toString();
                String email = txtemailkh.getText().toString();

                if (tenkh.length() > 0 && sdt.length() > 0 && email.length() > 0) {

                    hoadonks hoadonks  = new hoadonks( (int) mahoadon + 1, ngay, tenkh, sdt, email,
                            bundle.getString("giaks"), bundle.getString("tenks"));
                    reference.child(String.valueOf(mahoadon + 1)).setValue(hoadonks);

                    Intent intent1 = new Intent(ThongTinNguoiDungDatKSActivity.this, chi_tiet_hoa_don_ks.class);
                    Bundle bundle1 = new Bundle();
                    bundle1.putInt("shd", (int) (mahoadon + 1));
                    bundle1.putString("tenks", tenks);
//                    bundle1.putString("ksdiachi",sodt);
                    bundle1.putInt("hinh", hinh);
                    bundle1.putString("tenkh", tenkh);
                    bundle1.putString("giaks",giaks);
                    bundle1.putString("sdt", sdt);
                    bundle1.putString("email", email);



                    intent1.putExtras(bundle1);
                    startActivity(intent1);
                    finish();

                } else {

                    AlertDialog.Builder alert = new AlertDialog.Builder(ThongTinNguoiDungDatKSActivity.this);
                    alert.setTitle("Thong bao");
                    alert.setMessage("Nhập Đầy đủ thông tin");
                    alert.setPositiveButton("Thoat", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.show();
                }

            }
        });



    }
}