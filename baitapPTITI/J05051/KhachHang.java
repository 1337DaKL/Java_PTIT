/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05051;

/**
 *
 * @author luong
 */
public class KhachHang implements Comparable<KhachHang>{
    private String loaiSuDung , maKhachHang ;
    private double chiSoMoi , chiSoCu , heSo ,thanhTien, phuTroi, tongTienPhaiTra;
    public KhachHang(int i , String loaiSuDung , double chiSoCu , double chiSoMoi)
    {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.heSo = Helper.tinhHeSo(loaiSuDung);
        this.thanhTien = this.heSo * 550 * (this.chiSoMoi - this.chiSoCu);
        this.phuTroi = Helper.tinhPhuTroi(chiSoMoi, chiSoCu, thanhTien);
        this.tongTienPhaiTra = this.phuTroi + this.thanhTien;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + (long)this.heSo + " " +(long)this.thanhTien + " " + (long)this.phuTroi + " " + (long)this.tongTienPhaiTra;
    }
    @Override
    public int compareTo(KhachHang b)
    {
        return Double.compare(b.tongTienPhaiTra, this.tongTienPhaiTra);
    }
}
