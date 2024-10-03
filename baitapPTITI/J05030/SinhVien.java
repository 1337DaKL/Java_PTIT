/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05030;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVienString;
    private String tenSinhVienString;
    private String lopString;
    private double diem1;
    private double diem2;
    private double diem3;
    public SinhVien(String ma , String ten , String lop , double diem1 , double  diem2 , double diem3)
    {
        this.maSinhVienString = ma;
        this.tenSinhVienString = ten;
        this.lopString = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3 ;
    }

    @Override
    public String toString() {
        return this.maSinhVienString + " " + this.tenSinhVienString + " " + this.lopString + " " + this.diem1 + " " + this.diem2 + " " + this.diem3;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return this.maSinhVienString.compareTo(b.maSinhVienString);
    }
}
