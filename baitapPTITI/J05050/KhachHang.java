/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05050;

/**
 *
 * @author luong
 */
public class KhachHang {
    private String loaiSuDung , maKhachHang ;
    private double soMoi , soCu , heSo , thanhTien , phuTroi , tongTienPhaiTra;
    public KhachHang(int i ,String loaiSuDung , double soCu , double soMoi)
    {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.loaiSuDung = loaiSuDung;
        this.soMoi = soMoi;
        this.soCu = soCu;
        this.heSo = Helper.tinhHeSo(loaiSuDung);
        this.thanhTien = (soMoi - soCu) * this.heSo * 550;
        this.phuTroi = Helper.tinhPhuTroi(soMoi, soCu, this.thanhTien);
        this.tongTienPhaiTra = this.phuTroi + this.thanhTien;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + (long)this.heSo + " " + (long)this.thanhTien + " " + (long)this.phuTroi + " " + (long)this.tongTienPhaiTra;
    }
    
}
