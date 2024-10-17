/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05074;

/**
 *
 * @author luong
 */
public class DiemDanh {
    private SinhVien sinhVien;
    private String maSinhVienDiemDanh , duLieuDiemDanh , dieuKienThi;
    private int diemDiemDanh;

    public DiemDanh(String maSinhVienDiemDanh ,String duLieuDiemDanh , SinhVien sinhVien )
    {
        this.maSinhVienDiemDanh = maSinhVienDiemDanh ;
        this.duLieuDiemDanh = duLieuDiemDanh;
        this.sinhVien = sinhVien;
        this.diemDiemDanh = Helper.tinhDiem(duLieuDiemDanh);
        this.dieuKienThi = Helper.trangThaiDieuKienThi(diemDiemDanh);
    }

    @Override
    public String toString() {
        return this.sinhVien + " " + this.diemDiemDanh + " " + this.dieuKienThi;
    }
    
    
}
