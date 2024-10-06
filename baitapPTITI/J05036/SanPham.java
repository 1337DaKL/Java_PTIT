/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05036;

/**
 *
 * @author luong
 */
public class SanPham {
   private String maString;
   private String tenHangString;
   private String donViString;
   private double donGiaNhap;
   private double soLuong;
   private double phiVanCHuyen;
   private double thanhTien;
   private double giaBan;
   public SanPham(int i , String ten , String donvi , double gianhap , double soluong )
   {
       this.maString = "MH" + String.format("%02d", i);
       this.tenHangString = ten;
       this.donViString =donvi;
       this.donGiaNhap = gianhap;
       this.soLuong = soluong;
       this.phiVanCHuyen = Math.round((gianhap * soluong )* 5 / 100);
       this.thanhTien = Math.round(gianhap * soluong + this.phiVanCHuyen);
       this.giaBan = Math.round(this.thanhTien  + this.thanhTien * 2 / 100);
   }

    @Override
    public String toString() {
        return this.maString + " " + this.tenHangString + " " + this.donViString + " " + (long)this.phiVanCHuyen + " " + (long)this.thanhTien + " " + (long)this.giaBan;
    }
   
}
