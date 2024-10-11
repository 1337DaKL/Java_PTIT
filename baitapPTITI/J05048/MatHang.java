/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05048;

/**
 *
 * @author luong
 */
public class MatHang {
    private String maMatHang ;
    private double soLuongNhap , soLuongXuat , donGia , tien , phanTramThue , thue;
    public MatHang(String ma , double soLuongNhap)
    {
        this.maMatHang = ma;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = Helper.tinhSoLuongXuatHang(ma, soLuongNhap);
        this.donGia = Helper.tinhDonGia(ma);
        this.tien = this.soLuongXuat * this.donGia;
        this.phanTramThue = Helper.tinhPhanTramThue(ma);
        this.thue = this.phanTramThue * this.tien / 100;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + (long)this.soLuongNhap + " " + (long)this.soLuongXuat + " " + (long)this.donGia + " " + (long)this.tien + " " + (long)this.thue;
    }
    
}
