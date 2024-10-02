/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05018;

/**
 *
 * @author luong
 */
public class HocSinh {
    private String maHocSinhString;
    private  String tenHocSinhString;
    private double diemTrungBinh;
    private String xepLoaiString;
    public HocSinh(int i , String ten , double diem1 ,double diem2 , double diem3 , double diem4 , double diem5 , double diem6 , double diem7 , double diem8 , double diem9 , double diem10 )
    {
        this.maHocSinhString = "HS" + String.format("%02d" , i);
        this.tenHocSinhString = ten;
        this.diemTrungBinh =Math.round((diem1 * 2 + diem2 * 2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10) / 12f *10.0) / 10.0;
        if(this.diemTrungBinh < 5)
        {
            this.xepLoaiString = "YEU";
        }
        else if(this.diemTrungBinh >= 5 && this.diemTrungBinh <= 6.9)
        {
            this.xepLoaiString = "TB";
        }
        else if(this.diemTrungBinh >= 7 && this.diemTrungBinh <= 7.9)
        {
            this.xepLoaiString = "KHA";
        }
        else if(this.diemTrungBinh >= 8 && this.diemTrungBinh <= 8.9)
        {
            this.xepLoaiString = "GIOI";
        }
        else 
        {
            this.xepLoaiString = "XUAT SAC";
        }
    }

    public String getMaHocSinhString() {
        return maHocSinhString;
    }

    @Override
    public String toString() {
        return this.maHocSinhString + " " + this.tenHocSinhString + " " + String.format("%.01f", this.diemTrungBinh) + " " + this.xepLoaiString;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    
    
}
