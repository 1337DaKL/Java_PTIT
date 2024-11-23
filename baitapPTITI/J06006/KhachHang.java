/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06006;

/**
 *
 * @author daklp
 */
public class KhachHang {
    private String maKhachHang , tenKhachHang , gioiTinh , ngaySinh , diaChi;
    public KhachHang(int i , String tenKhachHang , String gioiTinh , String ngaySinh , String diaChi)
    {
        this.maKhachHang = "KH" + String.format("%03d", i);
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh ;
        this.ngaySinh = ngaySinh ;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
    
}
