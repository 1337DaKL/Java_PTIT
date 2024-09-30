/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05004;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maSinhVienString;
    private String hoVaTenString;
    private String maLopString;
    private String ngaySinhString;
    private double gpa;
    public SinhVien()
    {
        this.maSinhVienString = "";
        this.hoVaTenString = "";
        this.maLopString = "";
        this.maLopString = "";
        this.ngaySinhString = "";
        this.gpa = 0;
    }
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
    public static String chuanHoaTen(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
        }
        return ss;
    }
    public SinhVien(int ma , String ten , String lop , String ns ,double gpa)
    {
        this.maSinhVienString = "B20DCCN" + String.format("%03d", ma);
        this.hoVaTenString = chuanHoaTen(ten);
        this.maLopString = lop;
        this.ngaySinhString = chuanHoaNgaySinh(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVienString + " " + this.hoVaTenString + this.maLopString + " " + this.ngaySinhString + " " + String.format("%.02f", this.gpa);
    }
            
}
