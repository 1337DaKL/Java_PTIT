/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author daklp
 */
public class KhachHang implements Comparable<KhachHang>{
   private String maKhachHang  , tenKhachHang , maPhong;
   private Date ngayDen , ngayDi ;
   private long soNgayLuuTru;

    public KhachHang(int i ,String tenKhachHang, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = fm.parse(ngayDen);
        this.ngayDi = fm.parse(ngayDi);
        this.soNgayLuuTru = (int)(TimeUnit.MILLISECONDS.toDays(this.ngayDi.getTime() - this.ngayDen.getTime()));
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.maPhong + " " + soNgayLuuTru;
    }
   @Override 
   public int compareTo(KhachHang b)
   {
       return Long.compare(b.soNgayLuuTru, soNgayLuuTru);
   }
}
