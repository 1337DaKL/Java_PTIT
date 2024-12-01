/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07033;

/**
 *
 * @author daklp
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien ,tenSinhVien , lop , email;
    public SinhVien(String maSinhVien , String tenSinhVien , String lop , String email)
    {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = Helper.chuanHoaTen(tenSinhVien);
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.lop + " " + this.email;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return this.maSinhVien.compareTo(b.maSinhVien);
    }
}
