/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05078;

/**
 *
 * @author luong
 */
public class NhanVien {
    private String maNhanVien , tenNhanVien;
    private long luongCoBan , soNgayCong , heSoLuong , tongLuong;
    private PhongBan phongBan;
    public NhanVien(PhongBan phongBan , String maNhanVien , String tenNhanVien , long luongCoBan , long soNgayLuong)
    {
        this.phongBan = phongBan;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayLuong;
        this.heSoLuong = Helper.tinhHeSoLuong(maNhanVien);
        this.tongLuong = this.soNgayCong * this.luongCoBan * this.heSoLuong;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.tenNhanVien + " " + this.tongLuong + "000";
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public long getSoNgayCong() {
        return soNgayCong;
    }

    public long getHeSoLuong() {
        return heSoLuong;
    }

    public long getTongLuong() {
        return tongLuong;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }
    
}
