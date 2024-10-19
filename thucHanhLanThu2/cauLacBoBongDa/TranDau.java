/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.cauLacBoBongDa;

/**
 *
 * @author luong
 */
public class TranDau implements Comparable<TranDau>{
    private CauLacBo cauLacBo;
    private String maTranDau;
    private long soCoDongVien , doanhThu;
    public TranDau(CauLacBo cauLacBo  , String maTranDau, long soCoDongVien)
    {
        this.maTranDau = maTranDau;
        this.cauLacBo = cauLacBo;
        this.soCoDongVien = soCoDongVien;
        this.doanhThu = this.soCoDongVien * this.cauLacBo.getGiaVe();
    }

    @Override
    public String toString() {
        return this.maTranDau + " "  + this.cauLacBo.getTenCauLacBo() + " " + this.doanhThu;
    }
    @Override
    public int compareTo(TranDau b)
    {
        if(this.doanhThu == b.doanhThu)
        {
            return this.cauLacBo.getTenCauLacBo().compareTo(b.cauLacBo.getTenCauLacBo());
        }
        return Long.compare(b.doanhThu, this.doanhThu);
    }
}
