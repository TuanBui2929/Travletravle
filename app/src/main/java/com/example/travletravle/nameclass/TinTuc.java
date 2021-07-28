package com.example.travletravle.nameclass;

public class TinTuc {
    int Image;
    String Tennbai;
    String Ngay;

    public TinTuc(int image, String tennbai, String ngay) {
        Image = image;
        Tennbai = tennbai;
        Ngay = ngay;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTennbai() {
        return Tennbai;
    }

    public void setTennbai(String tennbai) {
        Tennbai = tennbai;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String ngay) {
        Ngay = ngay;
    }
}
