/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05052;

/**
 *
 * @author luong
 */
public class DonHang {
    private String tenDonHang , maDonHang , thuTu ;
    private long donGia, soLuong, giamGia , thanhTien;
    public DonHang(String ten , String ma , long donGia ,long soLuong)
    {
        this.tenDonHang = ten;
        this.maDonHang = ma;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thuTu = this.maDonHang.substring(1 , 4);
        this.giamGia = Helper.tinhTienGiamGia(donGia, soLuong, this.maDonHang.substring(4));
        this.thanhTien = (this.soLuong * this.donGia) - this.giamGia;
    }

    @Override
    public String toString() {
        return this.tenDonHang + " " + this.maDonHang + " " + this.maDonHang.substring(1 , 4) + " " + this.giamGia + " " + this.thanhTien;
    }
    
}
