/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06001;

/**
 *
 * @author daklp
 */
public class HoaDon implements  Comparable<HoaDon>{
    private SanPham sanPham;
    private String maDonHang;
    private long soLuong , tienGiamGia , tongTien , soTienPhaiTra;
    public HoaDon(int i , SanPham sanPham ,String maDonHang, long soLuong)
    {
        this.maDonHang = maDonHang;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.tongTien = Helper.tinhTongSoTien(sanPham, soLuong, maDonHang);
        this.tienGiamGia = Helper.tinhTienGiamGia(tongTien, soLuong);
        this.soTienPhaiTra = this.tongTien - this.tienGiamGia;
        this.maDonHang = maDonHang + "-" + String.format("%03d" , i);
        
    }

    @Override
    public String toString() {
        return this.maDonHang + " " + this.sanPham.getTenSanPham() + " " + this.tienGiamGia + " " + soTienPhaiTra;
    }
    @Override
    public int compareTo(HoaDon b)
    {
        return Long.compare(b.soTienPhaiTra, this.soTienPhaiTra);
    }
    
}
