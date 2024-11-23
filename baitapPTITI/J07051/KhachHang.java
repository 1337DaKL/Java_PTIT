/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author daklp
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maKhachHang , tenKhachHang , soPhong;
    private Date ngayNhanPhong , ngayTraPhong ;
    private long soTienPhatSinh , soNgayThue , tongTien;
    public KhachHang(int i , String tenKhachHang , String soPhong , String ngayNhanPhong , String ngayTraPhong , long tienPhatSinh) throws ParseException
    {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = Helper.chuanHoaTen(tenKhachHang);
        this.soPhong = soPhong.trim();
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayNhanPhong = fm.parse(ngayNhanPhong);
        this.ngayTraPhong = fm.parse(ngayTraPhong);
        this.soTienPhatSinh = tienPhatSinh;
        this.soNgayThue = (long)(TimeUnit.MILLISECONDS.toDays(this.ngayTraPhong.getTime() - this.ngayNhanPhong.getTime())) + 1;
        this.tongTien = this.soNgayThue * Helper.tinhDonGia(soPhong) + this.soTienPhatSinh;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.soPhong + " " + this.soNgayThue + " " + this.tongTien;
    }
    @Override
    public int compareTo(KhachHang b)
    {
        return (int)(b.tongTien -  this.tongTien);
    }
}
