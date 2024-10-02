/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05029;

/**
 *
 * @author luong
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String maDoanhNghiepString;
    private String tenDOanhNghiepString;
    private int soSinhVien;
    public DoanhNghiep(String ma , String ten , int so)
    {
        this.maDoanhNghiepString = ma;
        this.tenDOanhNghiepString = ten;
        this.soSinhVien = so;
    }

    @Override
    public String toString() {
        return this.maDoanhNghiepString + " " + this.tenDOanhNghiepString + " " + this.soSinhVien;
    }
    @Override
    public int compareTo(DoanhNghiep b)
    {
        if(this.soSinhVien == b.soSinhVien) return this.maDoanhNghiepString.compareTo(b.maDoanhNghiepString);
        return b.soSinhVien - this.soSinhVien;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }
}
