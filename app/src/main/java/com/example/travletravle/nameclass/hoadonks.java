package com.example.travletravle.nameclass;

public class hoadonks {
    int     sohoadon;
    String ngay;
    String Tenkhach;
    String sdtkhach;
    String emailkhach;
    String tenks;
    String giaks;



    public hoadonks(int sohoadon, String ngay, String tenkhach, String sdtkhach, String emailkhach, String tenks, String giaks) {
        this.sohoadon = sohoadon;
        this.ngay = ngay;
        Tenkhach = tenkhach;
        this.sdtkhach = sdtkhach;
        this.emailkhach = emailkhach;
        this.tenks= tenks;
        this.giaks = giaks;
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

    public String getTenks() {
        return tenks;
    }

    public void getTenks(String tenks) { this.tenks = tenks; }

    public String getGiaks() {
        return giaks;
    }

    public void getGiaks(String giaks) { this.giaks = giaks; }
}
