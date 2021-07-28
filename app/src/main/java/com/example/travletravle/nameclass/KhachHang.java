package com.example.travletravle.nameclass;

public class KhachHang {
    private String tenkh;
    private String sdtkh;
    private String emailkh;

    public KhachHang(String tenkh, String sdtkh, String emailkh) {
        this.tenkh = tenkh;
        this.sdtkh = sdtkh;
        this.emailkh = emailkh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdtkh() {
        return sdtkh;
    }

    public void setSdtkh(String sdtkh) {
        this.sdtkh = sdtkh;
    }

    public String getEmailkh() {
        return emailkh;
    }

    public void setEmailkh(String emailkh) {
        this.emailkh = emailkh;
    }
}
