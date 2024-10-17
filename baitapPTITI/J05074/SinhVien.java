/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05074;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maSinhVien , tenSinhVien , lop ;

    public SinhVien(String maSinhVien, String tenSinhVien, String lop) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.lop;
    }
    
}
