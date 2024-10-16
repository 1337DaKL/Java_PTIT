/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05056;

/**
 *
 * @author luong
 */
public class VanDongVien implements Comparable<VanDongVien>{
    private String hoVaTen , ngaySinh , thoiGianXuatPhat , thoiGianVeDich , maVanDongVien , thanhTichThucTe , uuTien , thanhTichDeXepHang;
    private int xepHang , soGiayThanhTich;
    public VanDongVien(int i , String hoVaTen , String ngaySinh , String thoiGianXuatPhat , String thoiGianVeDich)
    {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.thoiGianXuatPhat = thoiGianXuatPhat;
        this.thoiGianVeDich = thoiGianVeDich;
        this.maVanDongVien = "VDV" + String.format("%02d", i);
        this.thanhTichThucTe = Helper.tinhThanhTichThucTe(thoiGianXuatPhat, thoiGianVeDich);
        this.uuTien = Helper.tinhUuTien(ngaySinh);
        this.thanhTichDeXepHang = Helper.tinhThanhTichXepHang(thanhTichThucTe, uuTien);
        this.soGiayThanhTich = Helper.chuyenThoiGianVeSoGiay(thanhTichDeXepHang);
    }

    @Override
    public String toString() {
        return this.maVanDongVien + " " + this.hoVaTen + " " + this.thanhTichThucTe + " " + this.uuTien + " " + this.thanhTichDeXepHang + " " + this.xepHang;
    }
    
    @Override
    public int compareTo(VanDongVien b)
    {
        return this.soGiayThanhTich - b.soGiayThanhTich;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public int getXepHang() {
        return xepHang;
    }

    public int getSoGiayThanhTich() {
        return soGiayThanhTich;
    }
    
}
