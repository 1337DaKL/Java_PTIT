/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07018;

/**
 *
 * @author daklp
 */
public class SinhVien {
    private String maSinhVien , tenSinhVien , ngaySinh , lop ;
    private double gpa;

    public SinhVien(int i ,String tenSinhVien, String lop, String ngaySinh, double gpa) {
        this.maSinhVien = "B20DCCN" + String.format("%03d", i);
        this.tenSinhVien = Helper.chuanHoaTen(tenSinhVien);
        this.ngaySinh = Helper.chuanHoaNgaySinh(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.02f", this.gpa);
    } 
    
}
