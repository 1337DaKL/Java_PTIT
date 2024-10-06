/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05044;

/**
 *
 * @author luong
 */
public class NhanVien {
    private String maNhanVienString , hoVaTenString , chucVuString;
    private double luongCoBan , soNgayLuong , phuCap , tamUng , luongConLai , luongThang;
    public NhanVien(int i , String ten , String chucVu , double luongCoBan , double soNgayCong)
    {
        this.maNhanVienString = "NV" + String.format("%02d", i);
        this.hoVaTenString = ten;
        this.chucVuString = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayLuong = soNgayCong;
        this.luongThang = luongCoBan * soNgayCong;
        if(chucVu.equals("GD")) this.phuCap = 500;
        else if(chucVu.equals("PGD")) this.phuCap = 400;
        else if(chucVu.equals("TP")) this.phuCap = 300;
        else if(chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        if(((this.phuCap  + this.luongThang) * 2 / 3) < 25000) this.tamUng = Math.round((this.phuCap + this.luongThang) * 2 / 3 / 1000) * 1000;
        else this.tamUng = 25000;
        
        this.luongConLai = this.luongThang + this.phuCap - this.tamUng;
        
    }

    @Override
    public String toString() {
        return this.maNhanVienString + " " + this.hoVaTenString + " " + (int)this.phuCap + " " + (int)this.luongThang + " " + (int)this.tamUng + " " + (int)this.luongConLai;
    }

    public String getChucVuString() {
        return chucVuString;
    }
    
}
