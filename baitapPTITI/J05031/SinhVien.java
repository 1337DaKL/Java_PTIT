/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05031;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVienString;
    private String hoVaTenString;
    private String lopString;
    private double diem1;
    private double diem2;
    private double diem3;
    public SinhVien(String ma , String ten , String lop , double diem1 , double diem2 , double diem3)
    {
        this.maSinhVienString = ma;
        this.hoVaTenString = ten;
        this.lopString = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return this.maSinhVienString + " " + this.hoVaTenString + " " + this.lopString + " " + String.format("%.01f", this.diem1) + " " + String.format("%.01f", this.diem2) + " " + String.format("%.01f", this.diem3);
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return this.hoVaTenString.compareTo(b.hoVaTenString);
    }
    
    
}
