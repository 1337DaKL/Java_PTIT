/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05047;

/**
 *
 * @author luong
 */
public class MatHang implements Comparable<MatHang>{
    private String tenHang , maMatHang ;
    private long soLuong, donGia, phanTramChietKhau , tienChieuKhau , thanhTien;
    public MatHang(String maMatHang, String tenMatHang, long soLuong, long donGia)
    {
        this.maMatHang = maMatHang;
        this.tenHang = tenMatHang;
        this.phanTramChietKhau = Helper.tinhPhanTramChietKhau(soLuong);
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChieuKhau = this.donGia * this.soLuong * this.phanTramChietKhau / 100;
        this.thanhTien = this.soLuong * this.donGia - this.tienChieuKhau;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenHang + " " + this.tienChieuKhau + " " + this.thanhTien;
    }
    @Override
    public int compareTo(MatHang b)
    {
        return Long.compare(b.tienChieuKhau , this.tienChieuKhau);
    }
}
