/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05072;

/**
 *
 * @author luong
 */
public class CuocGoi {
    private String thueBaoGoiDen , thoiGianBatDau , thoiGianKetThuc , tinhThanhPho;
    private long soPhutGoi , giaCuocPhaiTra;
    private TinhThanh tinhThanh;

    public CuocGoi(String thueBaoGoiDen, String thoiGianBatDau, String thoiGianKetThuc , TinhThanh tinhThanh) {
        this.thueBaoGoiDen = thueBaoGoiDen;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.tinhThanh = tinhThanh;
        this.giaCuocPhaiTra = Helper.giaCuoc(this.tinhThanh, this.thoiGianBatDau, this.thoiGianKetThuc);
        this.soPhutGoi = Helper.tinhSoPhutGoi(tinhThanh, thoiGianBatDau, thoiGianKetThuc);
    }

    @Override
    public String toString() {
        return this.thueBaoGoiDen + " " + this.tinhThanh.getTenTinh() + " " + this.soPhutGoi + " " + this.giaCuocPhaiTra;
    }
    
}
