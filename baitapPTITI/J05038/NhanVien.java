/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05038;

/**
 *
 * @author luong
 */
public class NhanVien {
    private String hoVaTenString;
    private long luongNgay;
    private long soNgayCong;
    private String chucVuString;
    private long luongThang;
    private long luongThuong;
    private long phuCap;
    private long thucLinh;
    private String maNhanVien;
    public NhanVien(int i , String ten , long luongNgay , long ngayCong , String chucVu)
    {
        this.maNhanVien = "NV" + String.format("%02d", i);
        this.hoVaTenString = ten;
        this.luongNgay = luongNgay;
        this.soNgayCong = ngayCong;
        this.chucVuString = chucVu;
        this.luongThang = luongNgay * ngayCong;
        switch (chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
            default:
                break;
        }
        if(ngayCong >= 25)
        {
            this.luongThuong = this.luongThang /5;
        }
        else if(ngayCong >= 22)
        {
            this.luongThuong = this.luongThang / 10;
        }
        else
        {
            this.luongThuong = 0;
        }
        this.thucLinh = this.luongThang + this.phuCap + this.luongThuong;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.hoVaTenString + " " + this.luongThang + " " + this.luongThuong + " " + this.phuCap + " " + this.thucLinh;
    }

    public long getThucLinh() {
        return this.thucLinh;
    }
    
    
}
