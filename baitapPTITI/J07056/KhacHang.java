/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07056;

/**
 *
 * @author daklp
 */
public class KhacHang implements Comparable<KhacHang>{
    private String tenKhachHang , loaiHoGiaDinh , maKhachHang;
    private double chiSoDau , chiSoCuoi , soDien , dinhMuc , tienTrongDinhMuc , tienVuotDinhMuc , thueVAT , soTienPhaiNop;

    public KhacHang(int i , String tenKhachHang, String loaiHoGiaDinh, double chiSoDau, double chiSoCuoi) {
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = Helper.chuanHoaTen(tenKhachHang);
        this.loaiHoGiaDinh = loaiHoGiaDinh;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        this.soDien = this.chiSoCuoi - this.chiSoDau;
        this.dinhMuc = Helper.tinhDinhMuc(loaiHoGiaDinh);
        this.tienTrongDinhMuc = Helper.tinhTienTrongDinhMuc(soDien, dinhMuc);
        this.tienVuotDinhMuc = Helper.tinhTienVuotDinhMuc(soDien, dinhMuc);
        this.thueVAT = Helper.tinhThue(this.tienVuotDinhMuc);
        this.soTienPhaiNop = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.thueVAT;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + (long)this.tienTrongDinhMuc + " " + (long)this.tienVuotDinhMuc + " " + (long)this.thueVAT + " "+ (long)this.soTienPhaiNop;
        
    }
    @Override
    public int compareTo(KhacHang b)
    {
        return Double.compare(b.soTienPhaiNop, this.soTienPhaiNop);
    }
    
}
