/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05055;

/**
 *
 * @author luong
 */
public class VanDongVien implements Comparable<VanDongVien>{
    private String hoVaTen , ngaySinh , thoiGianXuarPhat , thoiGiandenDich , maVanDongVien , thanhTichThucTe , uuTien , thanhTichXepHang ;
    private int xepHang , soGiayThanhTich;
    public VanDongVien(int i , String hoVaTen , String ngaySinh , String thoiGianXuatPhat , String thoiGianDenDich)
    {
        this.maVanDongVien = "VDV" + String.format("%02d", i);
        this.hoVaTen = hoVaTen ;
        this.ngaySinh = ngaySinh;
        this.thoiGianXuarPhat = thoiGianXuatPhat;
        this.thoiGiandenDich = thoiGianDenDich;
        this.thanhTichThucTe = Helper.tinhThanhTichThucTe(thoiGianXuatPhat, thoiGianDenDich);
        this.uuTien = Helper.tinhThoiGianUuTien(ngaySinh);
        this.thanhTichXepHang = Helper.tinhThanhTichXepHang(this.thanhTichThucTe, this.uuTien);
        this.soGiayThanhTich = Helper.chuyenThoiGianVeSoGiay(thanhTichXepHang);
    }

    public int getSoGiayThanhTich() {
        return soGiayThanhTich;
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getMaVanDongVien() {
        return maVanDongVien;
    }

    @Override
    public String toString() {
        return this.maVanDongVien + " " + this.hoVaTen + " " + this.thanhTichThucTe + " " + this.uuTien + " " + this.thanhTichXepHang + " " + this.xepHang;
    }
    @Override
    public int compareTo(VanDongVien b)
    {
        return this.soGiayThanhTich - b.soGiayThanhTich;
    }
    
}
