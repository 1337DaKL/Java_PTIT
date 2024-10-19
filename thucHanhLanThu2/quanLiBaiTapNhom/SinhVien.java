/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.quanLiBaiTapNhom;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien , hoVaTen , soDienThoai , soThuTuNhom , baiTap;

    public SinhVien(String maSinhVien, String hoVaTen, String soDienThoai, String soThuTuNhom) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.soDienThoai = soDienThoai;
        this.soThuTuNhom = soThuTuNhom;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getSoThuTuNhom() {
        return soThuTuNhom;
    }

    public void setSoThuTuNhom(String soThuTuNhom) {
        this.soThuTuNhom = soThuTuNhom;
    }

    public void setBaiTap(String baiTap) {
        this.baiTap = baiTap;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoVaTen + " " + this.soDienThoai + " " + this.soThuTuNhom + " " + this.baiTap;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return this.maSinhVien.compareTo(b.maSinhVien);
    }
}
