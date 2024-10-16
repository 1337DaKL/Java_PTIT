/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05068;

/**
 *
 * @author luong
 */
public class DonHang implements Comparable<DonHang>{
    private String maDonHang , hangSanXuat ;
    private double soLuong , donGia , tongGiaTri , thue , thanhTien;
    public DonHang(String maDonHang , double soLuong)
    {
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
        this.hangSanXuat = Helper.hangSanXuat(maDonHang);
        this.donGia = Helper.tinhDonGia(maDonHang);
        this.tongGiaTri = this.soLuong * this.donGia;
        this.thue = Helper.tinhThue(maDonHang, tongGiaTri);
        this.thanhTien = this.tongGiaTri + this.thue;
    }

    @Override
    public String toString() {
        return this.maDonHang + " " + this.hangSanXuat + " " + (long)this.donGia + " " + (long)this.thue + " " + (long)this.thanhTien;
    }
    @Override
    public int compareTo(DonHang b)
    {
        return Double.compare(b.thanhTien, this.thanhTien);
    }
}
