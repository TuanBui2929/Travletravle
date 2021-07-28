package com.example.travletravle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.adappter.AdappterHinhanh;
import com.example.travletravle.nameclass.HinhAnh;
import com.example.travletravle.nameclass.User;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    ImageView imageViewtieude;
    GridView gridView;
    ArrayList<HinhAnh> ImageArrayList ;
    AdappterHinhanh adappterHinhanh;
   Toolbar toolbar;
   NavigationView navigationView;
   DrawerLayout drawerLayout;
   TextView nameheader;
   TextView emailheader;


   

   ArrayList<User> userArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu();
        anhxa();
        setvalueheader();
    }



    void menu(){
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.draw_layout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu_image_foreground);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.login){

                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,Dangnhap.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.lehoi)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,FormLehoi_Activity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.amthuc)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,AmThucActivity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.sukien)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,TinTucActivity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.tour)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,TourActivity.class);
                    startActivity(intent);

                }
                if(item.getItemId()==R.id.logout){
                    finish();
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,Dangnhap.class);
                    startActivity(intent);


                }
                if ((item.getItemId()==R.id.gioithieu)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,GioithieuActivity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.diadiem)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,DiemdenActivity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.khachsan)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this, KhachsanActivity.class);
                    startActivity(intent);

                }
                if ((item.getItemId()==R.id.phanhoi)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this, PhanHoiActivity.class);
                    startActivity(intent);
                }
                if ((item.getItemId()==R.id.dichvu)){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this, Map.class);
                    startActivity(intent);
                }



                return false;
            }
        });

    }



    void anhxa(){
        ImageArrayList = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.gridviewimage);
        ImageArrayList.add(new HinhAnh(R.drawable.gioithieu,"Giới Thiệu"));
        ImageArrayList.add(new HinhAnh(R.drawable.amthuc,"Ẩm Thực"));
        ImageArrayList.add(new HinhAnh(R.drawable.diadiem,"Địa Điểm "));
        ImageArrayList.add(new HinhAnh(R.drawable.dichvu,"Phản Hồi"));
        ImageArrayList.add(new HinhAnh(R.drawable.tienich,"Map"));
        ImageArrayList.add(new HinhAnh(R.drawable.khachsan,"Khách Sạn"));
        ImageArrayList.add(new HinhAnh(R.drawable.lehoi,"Lễ Hội"));
        ImageArrayList.add(new HinhAnh(R.drawable.tour,"Lịch Trình"));
        ImageArrayList.add(new HinhAnh(R.drawable.sukien,"Sự Kiện"));

        adappterHinhanh = new AdappterHinhanh(R.layout.hinhanh,ImageArrayList,MainActivity.this);
        gridView.setAdapter(adappterHinhanh);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,GioithieuActivity.class);
                    startActivity(intent);

                }
                if (position==1){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,AmThucActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,DiemdenActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,PhanHoiActivity.class);
                    startActivity(intent);
                }
                if (position==4){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,Map.class);
                    startActivity(intent);
                }
                if (position==5){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this, KhachsanActivity.class);
                    startActivity(intent);
                }
                if (position==6){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,FormLehoi_Activity.class);
                    startActivity(intent);
                }
                if (position==7){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,TourActivity.class);
                    startActivity(intent);
                }
                if (position==8){
                    Intent intent = new Intent(com.example.travletravle.MainActivity.this,TinTucActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    public void setvalueheader(){

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View hView = navigationView.getHeaderView(0);
        nameheader= (TextView) hView.findViewById(R.id.txtnameheader);
        emailheader = (TextView)hView.findViewById(R.id.txtidemailheader);

        Intent intent= getIntent();
        Bundle bundle= intent.getExtras();
        String email= bundle.getString("email");
        String matkhau= bundle.getString("matkhau");

        userArrayList = new ArrayList<>();
        firebaseDatabase = FirebaseDatabase.getInstance();
        reference=firebaseDatabase.getReference("User");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot ds: snapshot.getChildren()) {
                    if(ds.child("email").getValue().equals(email)){
                        emailheader.setText(ds.child("email").getValue(String.class));
                        nameheader.setText(ds.child("ten").getValue(String.class));

                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }



}