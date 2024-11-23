/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07047;

/**
 *
 * @author daklp
 */
public class Phong {
    private String kyHieuLoaiPhong , tenLoaiPhong;
    private double donGia , phiPhucVu;

    public Phong(String kyHieuLoaiPhong, String tenLoaiPhong, double donGia, double phiPhucVu) {
        this.kyHieuLoaiPhong = kyHieuLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.donGia = donGia;
        this.phiPhucVu = phiPhucVu;
    }

    public String getKyHieuLoaiPhong() {
        return kyHieuLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }
    
}
