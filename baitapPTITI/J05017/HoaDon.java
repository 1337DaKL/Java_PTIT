/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05017;

/**
 *
 * @author daklp
 */
public class HoaDon implements  Comparable<HoaDon>{
    private String tenKhachHang , maKhachHang;
    private double chiSoCu , chiSoMoi , soDien , soTien;

    public HoaDon(int i , String tenKhachHang, double chiSoCu, double chiSoMoi) {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = tenKhachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soDien = this.chiSoMoi - this.chiSoCu;
        this.soTien = Helper.tinhTongSoTien(soDien);
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + (long)this.soTien;
    }
    @Override
    public int compareTo(HoaDon b)
    {
        return Double.compare(b.soTien, this.soTien);
    }
    
}
