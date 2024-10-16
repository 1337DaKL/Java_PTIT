/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05064;

/**
 *
 * @author luong
 */
public class GiaoVien {
    private String maNgach, tenGiaoVien;
    private long luongCoBan , bacLuong , phuCap , thuNhap;
    public GiaoVien(String maNgach , String tenGiaoVien , long luongCoBan)
    {
        this.maNgach = maNgach ;
        this.tenGiaoVien = tenGiaoVien;
        this.luongCoBan = luongCoBan;
        this.bacLuong = Helper.tinhHeSoLuong(maNgach);
        this.phuCap = Helper.tinhPhuCap(maNgach);
        this.thuNhap = this.luongCoBan * this.bacLuong + this.phuCap;
    }

    @Override
    public String toString() {
        return this.maNgach + " " + this.tenGiaoVien + " " + this.bacLuong + " " + this.phuCap + " " + this.thuNhap;
    }

    public String getMaNgach() {
        return maNgach;
    }
    
}
