/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05067;

/**
 *
 * @author luong
 */
public class DonHang {
    private String maDonHang  , hangSanXuat;
    private double soLuong , donGia , thue , thanhTien , tongGiaTri;
    public DonHang(String maDonHang , double soLuong)
    {
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
        this.donGia = Helper.tinhDonGia(maDonHang);
        this.tongGiaTri = this.donGia * this.soLuong;
        this.thue = Helper.tinhThue(this.maDonHang, this.tongGiaTri);
        this.thanhTien = this.tongGiaTri + this.thue;
        this.hangSanXuat = Helper.hangSanXuat(maDonHang);
    }

    @Override
    public String toString() {
        return this.maDonHang + " " + this.hangSanXuat + " " + (long)this.donGia + " " + (long)this.thue + " " + (long)this.thanhTien;
    }
    
}
