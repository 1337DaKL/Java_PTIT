/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06001;

/**
 *
 * @author daklp
 */
public class SanPham {
    private String maSanPham , tenSanPham;
    private long donGiaLoai1 , donGiaLoai2;

    public SanPham(String maSanPham, String tenSanPham, long donGiaLoai1, long donGiaLoai2) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGiaLoai1 = donGiaLoai1;
        this.donGiaLoai2 = donGiaLoai2;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public long getDonGiaLoai1() {
        return donGiaLoai1;
    }

    public long getDonGiaLoai2() {
        return donGiaLoai2;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setDonGiaLoai1(long donGiaLoai1) {
        this.donGiaLoai1 = donGiaLoai1;
    }

    public void setDonGiaLoai2(long donGiaLoai2) {
        this.donGiaLoai2 = donGiaLoai2;
    }
    
}
