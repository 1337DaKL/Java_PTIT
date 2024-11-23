/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06006;

/**
 *
 * @author daklp
 */
public class HoaDon implements Comparable<HoaDon>{
    private KhachHang khachHang;
    private MatHang matHang;
    private String maHoaDon ;
    private long soLuong , loiNhuan , thanhTien;

    public HoaDon(KhachHang khachHang, MatHang matHang, int i, long soLuong) {
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.maHoaDon = "HD" + String.format("%03d", i);
        this.soLuong = soLuong;
        this.thanhTien = this.soLuong * this.matHang.getGiaBan();
        this.loiNhuan = this.thanhTien - (this.soLuong * this.matHang.getGiaMua());
    }

    @Override
    public String toString() {
        return this.maHoaDon + " " + this.khachHang.getTenKhachHang() + " " + this.khachHang.getDiaChi() + " " + this.matHang.getTenMatHang() + " " + this.soLuong + " " + this.thanhTien + " " + this.loiNhuan;
    }
    @Override
    public int compareTo(HoaDon b)
    {
        return  Long.compare(b.loiNhuan, this.loiNhuan);
    }
}
