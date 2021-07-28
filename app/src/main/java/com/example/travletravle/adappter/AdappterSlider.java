package com.example.travletravle.adappter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.travletravle.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class AdappterSlider extends SliderViewAdapter<AdappterSlider.Holder>
{
    int[] image;

    public AdappterSlider(int[] image) {
        this.image = image;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_slider,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {

        viewHolder.imageview.setImageResource(image[position]);
    }

    @Override
    public int getCount() {
        return image.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder{
        ImageView imageview;
        public Holder(View itemview){
            super(itemview);
            imageview = itemview.findViewById(R.id.imagesviewlider);

        }


    }


}
