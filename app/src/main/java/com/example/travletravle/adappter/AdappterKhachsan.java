package com.example.travletravle.adappter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.R;
import com.example.travletravle.nameclass.Khachsan;

import java.util.ArrayList;
public class AdappterKhachsan extends BaseAdapter {
    int layout;
    ArrayList<Khachsan> hinhAnhArrayList;
    Context context;
    public AdappterKhachsan(int layout, ArrayList<Khachsan> hinhAnhArrayList, Context context) {
        this.layout = layout;
        this.hinhAnhArrayList = hinhAnhArrayList;
        this.context = context; }
        private class  Viewholder{
            ImageView hinhanh;
            TextView ten;
            TextView diachi;
            TextView sdt;}
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
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder;
        if(convertView==null){
            holder = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.hinhanh = (ImageView) convertView.findViewById(R.id.khachsanig1);
            holder.ten=(TextView) convertView.findViewById(R.id.tieudekhachsan);
            holder.diachi=(TextView) convertView.findViewById(R.id.txtnoidungdiachi);
            holder.sdt=(TextView) convertView.findViewById(R.id.hotlinekhachsan);
            convertView.setTag(holder);
        }
        else {
            holder = (Viewholder) convertView.getTag();
        }
        Khachsan khachsan = hinhAnhArrayList.get(position);
        holder.hinhanh.setImageResource(khachsan.getImage());
        holder.ten.setText(khachsan.getTen());
        holder.diachi.setText(khachsan.getDiachi());
        holder.sdt.setText(khachsan.getSdt());
        return convertView;
    }

    }
