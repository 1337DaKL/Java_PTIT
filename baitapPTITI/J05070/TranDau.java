/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05070;

/**
 *
 * @author luong
 */
public class TranDau implements Comparable<TranDau>{
    private String maTranDau;
    private long soCoDongVien , doanhThu;
    private CauLacBo doiDau;
    public TranDau(String maTranDau , long soSoDongVien , CauLacBo doiDau)
    {
        this.soCoDongVien = soSoDongVien;
        this.maTranDau = maTranDau;
        this.doiDau = doiDau;
        this.doanhThu = (long) (this.doiDau.getGiaVe() * this.soCoDongVien);
    }

    @Override
    public String toString() {
        return this.maTranDau + " " + this.doiDau.getTenCauLacBo() + " " + this.doanhThu;
    }
    @Override
    public int compareTo(TranDau b)
    {
        if(this.doanhThu == b.doanhThu)
        {
            return this.doiDau.getTenCauLacBo().compareTo(b.doiDau.getTenCauLacBo());
        }
        return Long.compare(b.doanhThu, this.doanhThu);
    }
}
