/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.khaiBaoNhanVien;

/**
 *
 * @author luong
 */
public class NhanVien {
    private String maNhanVien , tenNhanVien , gioiTinh , ngaySinh , diaChi , masoThue , ngayKiHopDongString;

    public NhanVien( String tenNhanVien, String gioiTinh, String ngaySinh, String diaChi, String masoThue, String ngayKiHopDongString) {
        this.maNhanVien = "00001";
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.masoThue = masoThue;
        this.ngayKiHopDongString = ngayKiHopDongString;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.tenNhanVien + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.masoThue + " " + this.ngayKiHopDongString;
    }
    
}
