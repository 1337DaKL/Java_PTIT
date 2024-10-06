/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05041;

/**
 *
 * @author luong
 */
public class NhanVien implements Comparable<NhanVien>{
    private String maNhanVienString , tenNhanVienString , chucVuString;
    private int luongCoBan , soNgayCong , luongThang , tienThuong , phuCap  , thuNhap;
    public NhanVien(int i  , String ten , int luongCoBan , int soNgayCong , String chucVu)
    {
        this.maNhanVienString = "NV" + String.format("%02d", i);
        this.tenNhanVienString = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.luongThang = luongCoBan * soNgayCong;
        if(soNgayCong >= 25) this.tienThuong = this.luongThang / 5;
        else if(soNgayCong >= 22 && soNgayCong < 25) this.tienThuong = this.luongThang / 10;
        else this.tienThuong = 0;
        switch (chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD" :
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
            default:
                throw new AssertionError();
        }
        this.thuNhap = this.luongThang + this.phuCap + this.tienThuong;
    }

    @Override
    public String toString() {
        return this.maNhanVienString + " " + this.tenNhanVienString + " " + this.luongThang + " " + this.tienThuong + " " + this.phuCap + " " + this.thuNhap;
    }
    @Override
    public int compareTo(NhanVien b)
    {
        return b.thuNhap - this.thuNhap;
    }
}
