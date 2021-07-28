package com.example.travletravle.adappter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.R;
import com.example.travletravle.nameclass.Diemden;

import java.util.ArrayList;
public class AdappterDiemden extends BaseAdapter {
    int layout;
    ArrayList<Diemden> hinhAnhs;
    Context context;
    public AdappterDiemden(int layout, ArrayList<Diemden> hinhAnhs, Context context) {
        this.layout = layout;
        this.hinhAnhs = hinhAnhs;
        this.context = context; }
    @Override
    public int getCount() {
        return hinhAnhs.size();
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class Viewholder {
        ImageView hinhanh;
        TextView ten;
        TextView diachi;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder;
        if (convertView == null) {
            holder = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.hinhanh = (ImageView) convertView.findViewById(R.id.imagediemden);
            holder.ten = (TextView) convertView.findViewById(R.id.txttieudediemden);
            holder.diachi = (TextView) convertView.findViewById(R.id.txtnoidungdiachi);
            convertView.setTag(holder);
        } else {
            holder = (Viewholder) convertView.getTag();
        }
        Diemden diemden = hinhAnhs.get(position);
        holder.hinhanh.setImageResource(diemden.getImage());
        holder.ten.setText(diemden.getTen());
        holder.diachi.setText(diemden.getdiachi());
        return convertView;
    }
}
