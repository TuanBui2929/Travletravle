package com.example.travletravle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.travletravle.nameclass.PhanHoi;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
public class PhanHoiActivity extends AppCompatActivity {
    RadioButton rdokhachhang;
    RadioButton rdonhacc;
    EditText edtemail;
    EditText edtsdt;
    EditText edtvande;
    EditText edtnoidung;
    ImageView imghinh;
    Button bntgui;
    Uri FilePathUri;
    StorageReference storageReference;
    DatabaseReference databaseReference;
    int Image_Request_Code = 7;
    ProgressDialog progressDialog ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phan_hoi);
        rdokhachhang= findViewById(R.id.rbntdukhach);
        rdonhacc=findViewById(R.id.rbntncc);
        edtemail= findViewById(R.id.edt1);
        edtsdt=findViewById(R.id.edt2);
        edtvande=findViewById(R.id.edt3);
        edtnoidung=findViewById(R.id.edit_text);
        imghinh=findViewById(R.id.addimage);
        bntgui= findViewById(R.id.Bntgui);
        storageReference = FirebaseStorage.getInstance().getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference("Image");
        progressDialog = new ProgressDialog(PhanHoiActivity.this);

        imghinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Image"), Image_Request_Code);
            }
        });
        bntgui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdokhachhang.isChecked()||rdonhacc.isChecked())
                {
                    if(edtnoidung.getText()!=null&&edtvande!=null){
                        UploadImage();
                    }
                    else
                    {
                        Toast.makeText(PhanHoiActivity.this, "Vui nhập vấn đề bạn gặp phải",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(PhanHoiActivity.this, "Vui lòng chọn kiểu khách hàng",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Image_Request_Code && resultCode == RESULT_OK && data != null && data.getData() != null) {
            FilePathUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), FilePathUri);
                imghinh.setImageBitmap(bitmap);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    public String GetFileExtension(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri)) ;
    }

    public void UploadImage() {
        if (FilePathUri != null) {
            progressDialog.setTitle("Vui Lòng Đợi...");
            progressDialog.show();
            StorageReference storageReference2 = storageReference.child(System.currentTimeMillis() + "." +
                    GetFileExtension(FilePathUri));
            storageReference2.putFile(FilePathUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                            String nguoigui;
                            String TempImageName = edtnoidung.getText().toString().trim();
                            String email= edtemail.getText().toString().trim();
                            String sdt=edtsdt.getText().toString().trim();
                            String vande=edtvande.getText().toString().trim();
                            if(rdokhachhang.isChecked()){
                                nguoigui="Khách Hàng";
                            }
                            else {
                                nguoigui="Nha Cung Cap";
                            }
                            progressDialog.dismiss();
                            Toast.makeText(getApplicationContext(), "Lưu Phản Ánh Thành Công ",
                                    Toast.LENGTH_LONG).show();
                            @SuppressWarnings("VisibleForTests")
                           PhanHoi imageUploadInfo = new PhanHoi(nguoigui,email,sdt,vande,TempImageName,
                                    taskSnapshot.getUploadSessionUri().toString());
                            String ImageUploadId = databaseReference.push().getKey();
                            databaseReference.child(ImageUploadId).setValue(imageUploadInfo);
                            finish();
                        }
                    });
        }
        else {

            Toast.makeText(PhanHoiActivity.this, "Hãy chọn 1 ảnh minh họa", Toast.LENGTH_LONG).show();

        }
    }



}