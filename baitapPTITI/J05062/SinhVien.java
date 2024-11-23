/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05062;



/**
 *
 * @author daklp
 */
public class SinhVien implements Comparable<SinhVien>{
    private String tenSinhVien , hocBong;
    double diemTrungBinh , diemRenLuyen;

    public SinhVien(String tenSinhVien, double diemTrungBinh, double diemRenLuyen) {
        this.tenSinhVien = Helper.chuanHoaTen(tenSinhVien);
        this.diemTrungBinh = diemTrungBinh;
        this.diemRenLuyen = diemRenLuyen;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setHocBong(String hocBong) {
        this.hocBong = hocBong;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setDiemRenLuyen(double diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getHocBong() {
        return hocBong;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public double getDiemRenLuyen() {
        return diemRenLuyen;
    }

    @Override
    public String toString() {
        return this.tenSinhVien + ": " + this.hocBong;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return Double.compare(b.diemTrungBinh, this.diemTrungBinh);
    }
    
}
