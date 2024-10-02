/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05021;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhString;
    private String tenSinhVienString;
    private String maLopString;
    private String emailString;
    public SinhVien(String ma , String ten , String lop , String email)
    {
        this.maSinhString = ma;
        this.tenSinhVienString = ten;
        this.maLopString = lop;
        this.emailString = email;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return this.maSinhString.compareTo(b.maSinhString);
    }

    @Override
    public String toString() {
        return this.maSinhString + " " + this.tenSinhVienString + " " + this.maLopString + " " + this.emailString;
    }
    
}
