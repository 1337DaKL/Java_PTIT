/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05003;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maSinhVien;
    private String hoVaTenString;
    private String ngaySinhString;
    private String lopString;
    private double gpa;
    public static String chuanHoaNgaySinh(String s)
    {
        if(s.charAt(2) != '/') s = "0" + s;
        if(s.charAt(5) != '/') 
        {
            StringBuilder ss = new StringBuilder(s);
            ss.insert(3, "0");
            s = ss.toString();
        }
        return s;
    }
    public SinhVien()
    {
        this.maSinhVien = "";
        this.hoVaTenString = "";
        this.ngaySinhString = "";
        this.lopString = "";
        this.gpa = 0;
    }
    public SinhVien(int ma , String ten , String lop , String ns , double gpa)
    {
        this.maSinhVien = "B20DCCN" + String.format("%03d", ma);
        this.hoVaTenString = ten;
        this.lopString = lop;
        this.ngaySinhString = chuanHoaNgaySinh(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoVaTenString + " " + this.lopString + " " + this.ngaySinhString + " " +String.format("%.02f", this.gpa);
    }
    
}
