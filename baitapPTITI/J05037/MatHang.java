/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05037;

/**
 *
 * @author luong
 */

public class MatHang implements Comparable<MatHang>{
    private String maMatHangString;
    private String tenMatHangString;
    private String donViTinhString;
    private double donGiaNhap;
    private double soLuong;
    private double phiVanCHuyen;
    private double thanhTien;
    private double giaBan;
    public MatHang(int i , String ten , String dv , double gianhap , double soLuong)
    {
        this.maMatHangString = "MH" + String.format("%02d", i);
        this.tenMatHangString = ten;
        this.donGiaNhap = gianhap;
        this.donViTinhString = dv;
        this.soLuong = soLuong;
        this.phiVanCHuyen = Math.round((gianhap * soLuong) * 5 / 100);
        this.thanhTien = Math.round(gianhap * soLuong + phiVanCHuyen);
        this.giaBan = Math.ceil((this.thanhTien + this.thanhTien * 2 / 100) / soLuong /100) * 100;
    }

    @Override
    public String toString() {
        return this.maMatHangString + " " + this.tenMatHangString +  " " + this.donViTinhString + " " + (long)this.phiVanCHuyen + " " + (long)this.thanhTien + " " + (long)this.giaBan;
    }
    @Override
    public int compareTo(MatHang b)
    {
        return (int)b.giaBan - (int)this.giaBan;
    }
}
