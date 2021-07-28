package com.example.travletravle.nameclass;

public class LeHoi {

    int image;
    String ten;
    String ngay;
    String diachi;
    public LeHoi(int image, String ten, String ngay, String diachi) {
        this.image = image;
        this.ten = ten;
        this.ngay = ngay;
        this.diachi = diachi; }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNgay() {
        return ngay;
    }
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
