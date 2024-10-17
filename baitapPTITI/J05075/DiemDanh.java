/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05075;

/**
 *
 * @author luong
 */
public class DiemDanh {
    private String maSinhVien , duLieu , dieuKien , maLop;
    private SinhVien sinhVien;
    private int diemDiemDanh ;
    public DiemDanh(String maSinhVien , String duLieu , SinhVien sinhVien)
    {
        this.maSinhVien = maSinhVien;
        this.duLieu = duLieu;
        this.sinhVien = sinhVien;
        this.diemDiemDanh = Helper.tinhDiem(duLieu);
        this.dieuKien = Helper.xetDieuKien(this.diemDiemDanh);
        this.maLop = sinhVien.getLop();
    }

    @Override
    public String toString() {
        return this.sinhVien + " " + this.diemDiemDanh + " " + this.dieuKien;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public String getMaLop() {
        return maLop;
    }
    
}
