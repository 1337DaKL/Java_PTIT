/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author daklp
 */
public class KhachHang implements Comparable<KhachHang>{
    private Phong phong;
    private String maKhachHang , tenKhachHang , maPhong;
    private Date ngayDen , ngayDi ;
    private double soNgayO , soTienPhong , soTienPhucVu , soTienGiamGia , soTienPhaiThanhToan;
    public KhachHang(Phong  phong ,int i , String tenKhachHang , String maPhong , String ngayDen , String ngayDi ) throws ParseException
    {
        this.phong = phong;
        this.maKhachHang = "KH" + String.format("%02d", i);
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = fm.parse(ngayDen);
        this.ngayDi = fm.parse(ngayDi);
        this.soNgayO = (double)(TimeUnit.MILLISECONDS.toDays(this.ngayDi.getTime() - this.ngayDen.getTime()));
        if(soNgayO == 0) soNgayO = 1;
        this.soTienPhong = this.soNgayO * this.phong.getDonGia();
        this.soTienGiamGia = Helper.tinhPhanTramGiamGia(this.soNgayO) * this.soTienPhong;
        this.soTienPhong -= this.soTienGiamGia;
        this.soTienPhucVu = this.soTienPhong * this.phong.getPhiPhucVu();
        this.soTienPhaiThanhToan = this.soTienPhong + this.soTienPhucVu;
    }

    public Phong getPhong() {
        return phong;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public double getSoNgayO() {
        return soNgayO;
    }

    public double getSoTienPhong() {
        return soTienPhong;
    }

    public double getSoTienPhucVu() {
        return soTienPhucVu;
    }

    public double getSoTienGiamGia() {
        return soTienGiamGia;
    }

    public double getSoTienPhaiThanhToan() {
        return soTienPhaiThanhToan;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.maPhong + " " + (long)this.soNgayO + " " + String.format("%.02f", this.soTienPhaiThanhToan);
    }
    @Override
    public int compareTo(KhachHang b)
    {
        return  Double.compare(b.soNgayO, this.soNgayO);
    }
}
