package com.example.travletravle.nameclass;

public class PhanHoi {

    String nguoigui;
    String email;
    String sodienthoai;
    String vande;
    String noidung;
    String hinhanh;

    public PhanHoi(String nguoigui, String email, String sodienthoai, String vande, String noidung, String hinhanh) {
        this.nguoigui = nguoigui;
        this.email = email;
        this.sodienthoai = sodienthoai;
        this.vande = vande;
        this.noidung = noidung;
        this.hinhanh = hinhanh;
    }

    public String getNguoigui() {
        return nguoigui;
    }

    public void setNguoigui(String nguoigui) {
        this.nguoigui = nguoigui;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getVande() {
        return vande;
    }

    public void setVande(String vande) {
        this.vande = vande;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
