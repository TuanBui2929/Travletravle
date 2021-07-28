package com.example.travletravle.nameclass;
import android.text.Editable;
public class User {
    String email;
    String sdt;
    String ten;
    String mk;
    public User(){
    }
    public User(String email, String sdt, String ten, String mk) {
        this.email = email;
        this.sdt = sdt;
        this.ten = ten;
        this.mk = mk;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMk() {
        return mk;
    }
    public void setMk(String mk) {
        this.mk = mk;
    }
}
