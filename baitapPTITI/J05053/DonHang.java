/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05053;


/**
 *
 * @author luong
 */
public class DonHang implements Comparable<DonHang>{
    private String tenDonHang , maDonHang , soThuTu;
    private long donGia , soLuong , giamGia , thanhTien;
    public DonHang(String tenDonHang , String maDonHang , long donGia , long soLuong)
    {
        this.tenDonHang = tenDonHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.soThuTu = this.maDonHang.substring(1 , 4);
        this.giamGia = Helper.tinhGiamGia(maDonHang, soLuong, donGia);
        this.thanhTien = this.donGia * this.soLuong - this.giamGia;
    }

    @Override
    public String toString() {
        return this.tenDonHang + " " + this.maDonHang + " " + this.soThuTu + " " + this.giamGia + " " + this.thanhTien ;
    }
    @Override
    public int compareTo(DonHang b)
    {
        return this.maDonHang.substring(1 , 4).compareTo(b.maDonHang.substring(1 , 4));
    }
}
