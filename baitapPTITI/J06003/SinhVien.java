/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06003;

/**
 *
 * @author daklp
 */
public class SinhVien {
    private String maSinhVien , tenSinhVien , soDienThoai;
    private int nhom;
    public SinhVien(String maSinhVien , String tenSinhVien , String soDienThoai , int nhom)
    {
        this.maSinhVien = maSinhVien ;
        this.tenSinhVien = tenSinhVien;
        this.soDienThoai = soDienThoai;
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.soDienThoai ;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getNhom() {
        return nhom;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }
    
}
