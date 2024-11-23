/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06005;

/**
 *
 * @author daklp
 */
public class HoaDon {
    private KhachHang khachHang;
    private MatHang matHang;
    private String maHoaDon ;
    private long soLuong , thanhTien;

    public HoaDon(int i,KhachHang khachHang, MatHang matHang, long soLuong) {
        this.maHoaDon = "HD" + String.format("%03d", i);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = this.soLuong * this.matHang.getGiaBan();
    }

    @Override
    public String toString() {
        return this.maHoaDon + " " + this.khachHang.getTenKhachHang() + " " + this.khachHang.getDiaChi() + " " + this.matHang.getTenMatHang() + " " + this.matHang.getDonVi() + " " + this.matHang.getGiaMua() + " " + this.matHang.getGiaBan() + " " + this.soLuong + " " + this.thanhTien;
    }
    
}
