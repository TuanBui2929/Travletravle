package com.example.travletravle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.travletravle.nameclass.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;
public class Dangnhap extends AppCompatActivity {
    EditText email;
    EditText matkhau;
    TextView noaccount;
    Button bntdangnhap;
    FirebaseAuth firebaseAuth;
    ArrayList<User> posts = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        email = (EditText) findViewById(R.id.edtemaildangnhap);
        matkhau= findViewById(R.id.edtpassworddangnhap);
        bntdangnhap= findViewById(R.id.bntdanhnhap);
        noaccount =(TextView) findViewById(R.id.txtchuacotaikhoan);
        firebaseAuth = FirebaseAuth.getInstance();
        noaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dangnhap.this,Dangki.class);
                startActivity(intent);
            }
        });
        bntdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("")||matkhau.getText().toString().equals("")){
                    if(email.getText().toString().equals("")&&matkhau.getText().toString().equals("")){
                      //  Toast.makeText(Dangnhap.this, "abc", Toast.LENGTH_LONG).show();
                        AlertDialog.Builder alert = new AlertDialog.Builder(Dangnhap.this);
                        alert.setTitle("Thong bao");
                        alert.setMessage("NHap day du thong tin");
                        alert.setPositiveButton("Thoat", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        alert.show();
                    }
                    else {
                        if(email.getText().toString().equals("")){
                          //  Toast.makeText(Dangnhap.this, "Vui Lòng Nhập Email", Toast.LENGTH_LONG).show();
                            AlertDialog.Builder alert = new AlertDialog.Builder(Dangnhap.this);
                            alert.setTitle("Thong bao");
                            alert.setMessage("Vui Lòng Nhập Email");
                            alert.setPositiveButton("Thoat", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            alert.show();
                        }
                        else{
                         //   Toast.makeText(Dangnhap.this, "Vui Lòng Nhập Mật Khẩu", Toast.LENGTH_LONG).show();
                            AlertDialog.Builder alert = new AlertDialog.Builder(Dangnhap.this);
                            alert.setTitle("Thong bao");
                            alert.setMessage("Vui Lòng Nhập Mật Khẩu");
                            alert.setPositiveButton("Thoat", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            alert.show();
                        }

                    }

                }
                else {
                    firebaseAuth.signInWithEmailAndPassword(email.getText().toString(),
                            matkhau.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Bundle bundle = new Bundle();
                                bundle.putString("email",email.getText().toString());
                                bundle.putString("matkhau",matkhau.getText().toString());
                                Intent intent = new Intent(Dangnhap.this,MainActivity.class);
                                intent.putExtras(bundle);

                                startActivity(intent);
                            }
                            else {
                                //Toast.makeText(Dangnhap.this, "Đăng Nhâp Thất Bại", Toast.LENGTH_LONG).show();
                                AlertDialog.Builder alert = new AlertDialog.Builder(Dangnhap.this);
                                alert.setTitle("Thong bao");
                                alert.setMessage("Đăng Nhâp Thất Bại");
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
        });

    }
}