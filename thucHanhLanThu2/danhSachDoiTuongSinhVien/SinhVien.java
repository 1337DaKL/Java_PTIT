/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachDoiTuongSinhVien;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien , tenSinhVien , lop , ngaySinh;
    private double gpa;

    public SinhVien(int maSinhVien, String tenSinhVien, String lop, String ngaySinh, double gpa) {
        this.maSinhVien = "B20DCCN" + String.format("%03d", maSinhVien);
        this.tenSinhVien =Helper.chuanHOaTen(tenSinhVien);
        this.lop = lop;
        this.ngaySinh = Helper.chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.02f", this.gpa);
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return Double.compare(b.gpa, this.gpa);
    }
}
