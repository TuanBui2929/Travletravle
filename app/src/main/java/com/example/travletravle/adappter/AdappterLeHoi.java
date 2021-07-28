package com.example.travletravle.adappter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.R;
import com.example.travletravle.nameclass.LeHoi;

import java.util.ArrayList;

public class AdappterLeHoi extends BaseAdapter {

    int layout;
    ArrayList<LeHoi> hinhAnhArrayList;
    Context context;
    public AdappterLeHoi(int layout, ArrayList<LeHoi> hinhAnhArrayList, Context context) {
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
        ImageView hinhanh;
        TextView ten;
        TextView ngay;
        TextView diachi;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder;
        if(convertView==null){
            holder = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.hinhanh = (ImageView) convertView.findViewById(R.id.anhlehoi);
            holder.ten=(TextView) convertView.findViewById(R.id.tieude);
            holder.ngay=(TextView) convertView.findViewById(R.id.ngaylehoi2);
            holder.diachi=(TextView) convertView.findViewById(R.id.diachilehoi2);
            convertView.setTag(holder);
        }
        else {
            holder = (Viewholder) convertView.getTag();
        }
       LeHoi leHoi = hinhAnhArrayList.get(position);
        holder.hinhanh.setImageResource(leHoi.getImage());
        holder.ten.setText(leHoi.getDiachi());
        holder.ngay.setText(leHoi.getNgay());
        holder.diachi.setText(leHoi.getDiachi());
        return convertView;
    }
}
