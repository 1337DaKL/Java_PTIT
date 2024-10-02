/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05028;

/**
 *
 * @author luong
 */
public class DoangNghiep implements Comparable<DoangNghiep>{
    private String maDoanhNghiepString;
    private String tenDoanhNghieString;
    private int soSinhVien;
    public DoangNghiep(String ma , String ten , int so)
    {
        this.maDoanhNghiepString = ma;
        this.tenDoanhNghieString = ten;
        this.soSinhVien = so;
    }

    @Override
    public String toString() {
        return this.maDoanhNghiepString + " " + this.tenDoanhNghieString + " " + this.soSinhVien;
    }
    
    @Override
    public int compareTo(DoangNghiep b)
    {
        if(this.soSinhVien == b.soSinhVien)
        {
            return this.maDoanhNghiepString.compareTo(b.maDoanhNghiepString);
        }
        return b.soSinhVien - this.soSinhVien;
    }
}
