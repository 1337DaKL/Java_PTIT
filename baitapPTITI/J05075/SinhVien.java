/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05075;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maSinhVen , tenSinhVien , lop;

    public SinhVien(String maSinhVen, String tenSinhVien, String lop) {
        this.maSinhVen = maSinhVen;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
    }

    public String getMaSinhVen() {
        return maSinhVen;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSinhVen(String maSinhVen) {
        this.maSinhVen = maSinhVen;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return this.maSinhVen + " " + this.tenSinhVien + " " + this.lop;
    }
    
}
