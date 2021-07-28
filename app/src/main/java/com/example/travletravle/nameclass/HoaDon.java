package com.example.travletravle.nameclass;

public class HoaDon {

    int sohoadon;
    String ngay;
    String Tenkhach;
    String sdtkhach;
    String emailkhach;
    String giatour;
    String tentour;



    public HoaDon(int sohoadon, String ngay, String tenkhach, String sdtkhach, String emailkhach, String giatour, String tentour) {
        this.sohoadon = sohoadon;
        this.ngay = ngay;
        Tenkhach = tenkhach;
        this.sdtkhach = sdtkhach;
        this.emailkhach = emailkhach;
        this.giatour = giatour;
        this.tentour = tentour;


    }




    public int getSohoadon() {
        return sohoadon;
    }

    public void setSohoadon(int sohoadon) {
        this.sohoadon = sohoadon;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTenkhach() {
        return Tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        Tenkhach = tenkhach;
    }

    public String getSdtkhach() {
        return sdtkhach;
    }

    public void setSdtkhach(String sdtkhach) {
        this.sdtkhach = sdtkhach;
    }

    public String getEmailkhach() {
        return emailkhach;
    }

    public void setEmailkhach(String emailkhach) {
        this.emailkhach = emailkhach;
    }

    public String getGiatour() {
        return giatour;
    }

    public void setGiatour(String giatour) {
        this.giatour = giatour;
    }

    public String getTentour() {
        return tentour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }


}
