/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05069;

/**
 *
 * @author luong
 */
public class TranDau {
    public String maTranDau , tenDoi;
    public long soCoDongVien , doanhThu;
    public TranDau(String maTranDau , long soCongDongVien , CauLacBo doiDau)
    {
        this.maTranDau = maTranDau;
        this.soCoDongVien = soCongDongVien;
        this.tenDoi = doiDau.getTenCauLacBo();
        this.doanhThu = this.soCoDongVien * doiDau.getGiaVe();
    }

    @Override
    public String toString() {
        return this.maTranDau + " " + this.tenDoi + " " + this.doanhThu;
    }
    
}
