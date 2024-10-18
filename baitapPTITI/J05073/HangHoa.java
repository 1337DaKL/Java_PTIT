/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05073;

/**
 *
 * @author luong
 */
public class HangHoa {
    private String maHang ;
    private double donGia , soLuong , giaBan , thueNhapKhau , phiVanChuyen , giamThue  , tienHang , tongTien;
    public HangHoa(String maHang , double donGia , double soLuong)
    {
        this.maHang = maHang ;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.tienHang = this.donGia * this.soLuong;
        this.thueNhapKhau = Helper.tinhThueNhapKhau(maHang, tienHang);
        this.phiVanChuyen = Helper.tinhPhiVaChuyen(maHang, tienHang);
        this.giamThue = Helper.tinhGiamThue(maHang, thueNhapKhau);
        this.tongTien = this.tienHang + this.thueNhapKhau + this.phiVanChuyen - giamThue;
        this.giaBan = Helper.tinhTienBanRa(this.tongTien);
        
    }

    @Override
    public String toString() {
        return this.maHang + " " + String.format("%.02f", this.giaBan / this.soLuong);
    }
    
}
