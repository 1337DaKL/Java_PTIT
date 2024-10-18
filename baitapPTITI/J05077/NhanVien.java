/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05077;

/**
 *
 * @author luong
 */
public class NhanVien {
    private PhongBan phongBan;
    private String maNhanVien , tenNhanVien ;
    private long luongCoBan , soNgayCong , heSoNhan , luongThang;
    public NhanVien(PhongBan phongBan , String maNhanVien , String tenNhanVien , long luongCoBan , long soNgayCong)
    {
        this.phongBan = phongBan;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.heSoNhan = Helper.tinhHeSoNhan(maNhanVien);
        this.luongThang = this.luongCoBan * this.soNgayCong * this.heSoNhan;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.tenNhanVien + " " + this.phongBan.getTenPhong()  + this.luongThang + "000";
    }
}
