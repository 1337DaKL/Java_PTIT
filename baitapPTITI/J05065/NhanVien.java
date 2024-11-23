/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05065;

/**
 *
 * @author daklp
 */
public class NhanVien implements Comparable<NhanVien>{
    private  String chucVu , tenNhanVien;
    private String heSoLuong , soHieu;

    public NhanVien(String chucVu, String tenNhanVien, String heSoLuong, String soHieu) {
        this.chucVu = chucVu;
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
        this.soHieu = soHieu;
    }

    @Override
    public String toString() {
        return this.tenNhanVien + " " + this.chucVu + " " + this.soHieu + " " + this.heSoLuong ;
    }
    @Override
    public int compareTo(NhanVien b)
    {
        if(this.heSoLuong.equals(b.heSoLuong))
        {
            return this.soHieu.compareTo(b.soHieu);
        }
        return b.heSoLuong.compareTo(this.heSoLuong);
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getHeSoLuong() {
        return heSoLuong;
    }

    public String getSoHieu() {
        return soHieu;
    }
}
