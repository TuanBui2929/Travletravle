package com.example.travletravle.adappter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.R;
import com.example.travletravle.nameclass.NhahangvaAmthuc;

import java.util.ArrayList;
public class AdappterAmthucnhahang extends BaseAdapter {
    int layout;
    ArrayList<NhahangvaAmthuc> hinhAnhArrayList;
    Context context;
    LayoutInflater inflater;
    public AdappterAmthucnhahang(int layout, ArrayList<NhahangvaAmthuc> hinhAnhArrayList, Context context) {
        this.layout = layout;
        this.hinhAnhArrayList = hinhAnhArrayList;
        this.context = context; }
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
        ImageView hinh;
        TextView ten;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        hinh = (ImageView) convertView.findViewById(R.id.imagenhahang);
        ten = (TextView) convertView.findViewById(R.id.tennhahang);
        NhahangvaAmthuc nhahangvaAmthuc = hinhAnhArrayList.get(position);
        hinh.setImageResource(nhahangvaAmthuc.getHinh());
        ten.setText(nhahangvaAmthuc.getTen());
        return convertView; }}
