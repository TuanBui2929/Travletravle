package com.example.travletravle.adappter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.travletravle.R;
import com.example.travletravle.nameclass.HinhAnh;
import com.example.travletravle.nameclass.ImageTour;

import java.util.ArrayList;
public class AdappterTour  extends BaseAdapter {
    int layout;
    ArrayList<ImageTour> hinhAnhArrayList;
    Context context;
    public AdappterTour(int layout, ArrayList<ImageTour> hinhAnhArrayList, Context context) {
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
        TextView content;
        TextView giaban;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      Viewholder holder;
        if(convertView==null){
            holder = new Viewholder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.hinhanh = (ImageView) convertView.findViewById(R.id.imagechudetour);
            holder.content=(TextView) convertView.findViewById(R.id.txttieudetour);
            holder.giaban= (TextView) convertView.findViewById(R.id.txtgiaban);
            convertView.setTag(holder);
        }
        else {
            holder = (Viewholder) convertView.getTag();
        }
        ImageTour hinhAnh = hinhAnhArrayList.get(position);
        holder.hinhanh.setImageResource(hinhAnh.getView());
        holder.content.setText(hinhAnh.getTieude());
        holder.giaban.setText( hinhAnh.getGia());
        return convertView;
    }
}
