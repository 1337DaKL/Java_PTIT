/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05076;

/**
 *
 * @author luong
 */
public class ThongKe {
    private MatHang matHang;
    private String maMatHang ;
    private long soLuongNhap , donGiaNhap , soLuongSuat , donGiaXuat , tongGiaTriNhap , tongGiaTriXuat;
    public ThongKe(String maMatHang , long soLuongNhap , long donGiaNhap , long sLuongXuat , MatHang matHang)
    {
        this.maMatHang = maMatHang;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongSuat = sLuongXuat;
        this.matHang = matHang;
        this.tongGiaTriXuat = Helper.tinhDonGiaXuat(this.matHang.getXepLoai(), this.donGiaNhap , this.soLuongSuat);
        this.tongGiaTriNhap = this.donGiaNhap * soLuongNhap;
    }

    @Override
    public String toString() {
        return this.matHang + " " + this.tongGiaTriNhap + " " + this.tongGiaTriXuat;
    }
    
}
