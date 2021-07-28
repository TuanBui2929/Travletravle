package com.example.travletravle.nameclass;
import android.widget.ImageView;
public class ImageTour {
    int view;
    String tieude;
    String gia;
    public ImageTour(int view, String tieude, String gia) {
        this.view = view;
        this.tieude = tieude;
        this.gia = gia;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
