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

import com.example.travletravle.nameclass.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.text.SpannableString.valueOf;
public class Dangki extends AppCompatActivity {

    DatabaseReference reference;
    Button dangki;
    EditText edtemail,sdt;
    EditText hovaten;
    EditText matkhau;
    FirebaseAuth auth;
    String id;
    public void dangki(){
        auth.createUserWithEmailAndPassword(edtemail.getText().toString(),
        matkhau.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    User user = new User(edtemail.getText().toString(), sdt.getText().toString(),
                    hovaten.getText().toString(), matkhau.getText().toString());
                   reference.child(sdt.getText().toString()).setValue(user);

                    Intent intent = new Intent(Dangki.this, Dangnhap.class);
                    startActivity(intent);
                } else {
                   // Toast.makeText(Dangki.this, "Dang ki that bai", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder alert = new AlertDialog.Builder(Dangki.this);
                    alert.setTitle("Thong bao");
                    alert.setMessage("Dang ki that bai");
                    alert.setPositiveButton("Thoat", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alert.show();
                }
            }
        });
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
        dangki= findViewById(R.id.bntdangki);
        edtemail= findViewById(R.id.emaidangki);
        sdt= findViewById(R.id.sdtdangki);
        hovaten= findViewById(R.id.hovatendangki);
        matkhau= findViewById(R.id.passwordangki);
        auth =FirebaseAuth.getInstance();

        reference=FirebaseDatabase.getInstance().getReference("test");
          dangki.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                if(edtemail.getText().length()>0&&sdt.getText().length()>0&&
                        hovaten.getText().length()>0&&matkhau.getText().length()>=6) {
                        dangki();
                }
                else{
                   // Toast.makeText(Dangki.this, "Vui Lòng Nhập Đầy Đủ Thông Tin", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder alert = new AlertDialog.Builder(Dangki.this);
                    alert.setTitle("Thong bao");
                    alert.setMessage("Vui Lòng Nhập Đầy Đủ Thông Tin");
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