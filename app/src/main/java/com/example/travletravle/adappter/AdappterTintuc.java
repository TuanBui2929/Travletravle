package com.example.travletravle.adappter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.travletravle.R;
import com.example.travletravle.fragment.TinTucFragment;
import com.example.travletravle.nameclass.LeHoi;
import com.example.travletravle.nameclass.TinTuc;

import java.util.ArrayList;

public class AdappterTintuc extends BaseAdapter {
    int layout;
    ArrayList<TinTuc> hinhAnhArrayList;
  Context context;
    LayoutInflater inflater;


    public AdappterTintuc(int layout, ArrayList<TinTuc> hinhAnhArrayList, Context context) {
        this.layout = layout;
        this.hinhAnhArrayList = hinhAnhArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hinhAnhArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class  Viewholder{



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView hinhanh;
        TextView ten;
        TextView ngay;


            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


                convertView = inflater.inflate(layout, null);

            hinhanh = (ImageView) convertView.findViewById(R.id.imagetintuc);
            ten=(TextView) convertView.findViewById(R.id.txttieudetintuc);
            ngay=(TextView) convertView.findViewById(R.id.txtngaytintuc);



        TinTuc tinTuc = hinhAnhArrayList.get(position);
      hinhanh.setImageResource(tinTuc.getImage());
        ten.setText(tinTuc.getTennbai());
        ngay.setText(tinTuc.getNgay());

        return convertView;
    }
}
