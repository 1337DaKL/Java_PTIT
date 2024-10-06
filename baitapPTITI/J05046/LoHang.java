/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05046;

/**
 *
 * @author luong
 */
public class LoHang {
    private String tenHang , maHang;
    private int soLuong , donGia , tienChietKhau , thanhTien , phanTramChietKhau;
    public LoHang(String ma , String ten , int soLuong , int donGia)
    {
        this.maHang = ma;
        this.tenHang = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        if(soLuong  > 10) this.phanTramChietKhau = 5;
        else if(soLuong >= 8 && soLuong <= 10)
        {
            this.phanTramChietKhau = 2;
            
        }
        else if(soLuong >= 5 && soLuong < 8)
        {
            this.phanTramChietKhau = 1;
        }
        else this.phanTramChietKhau = 0;
        this.tienChietKhau = this.donGia * this.soLuong * this.phanTramChietKhau / 100;
        this.thanhTien = this.soLuong * this.donGia - this.tienChietKhau;
    }

    @Override
    public String toString() {
        return this.maHang + " " + this.tenHang + " " + this.tienChietKhau + " " + this.thanhTien;
    }
    
}
