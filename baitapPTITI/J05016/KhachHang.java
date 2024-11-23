/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author daklp
 */
public class KhachHang implements  Comparable<KhachHang>{
    private String maKhachHang , tenKhachHang  , soPhong;
    private int soTienPhatSinh , donGia , soNgayO , thanhTien;
    private Date ngayNhanPhong , ngayTraPhong;

    public KhachHang(int i , String tenKhachHang, String soPhong,String  ngayNhanPhong , String ngayTraPhong ,  int soTienPhatSinh ) throws ParseException {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = tenKhachHang.trim();
        this.soPhong = soPhong;
        SimpleDateFormat fmDate = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhanPhong = fmDate.parse(ngayNhanPhong.trim());
        this.ngayTraPhong = fmDate.parse(ngayTraPhong.trim());
        this.soNgayO = (int)TimeUnit.MILLISECONDS.toDays((this.ngayTraPhong.getTime() - this.ngayNhanPhong.getTime())) + 1;
        this.soTienPhatSinh = soTienPhatSinh;
        this.donGia = Helper.tinhDonGia(this.soPhong);
        this.thanhTien = this.soNgayO * this.donGia + this.soTienPhatSinh;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.soPhong + " " +   this.soNgayO + " " + this.thanhTien; 
    }
    @Override 
    public int compareTo(KhachHang b)
    {
        return Integer.compare(b.thanhTien, this.thanhTien);
    }

}
