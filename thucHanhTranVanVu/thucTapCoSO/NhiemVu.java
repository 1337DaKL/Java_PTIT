/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhTranVanVu.thucTapCoSO;


/**
 *
 * @author luong
 */
public class NhiemVu implements Comparable<NhiemVu>{
    private  SinhVien sinhVien ;
    private DeTai deTai;
    public NhiemVu(SinhVien sv , DeTai deTai)
    {
        this.sinhVien = sv;
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return this.sinhVien + " " + this.deTai;
    }
    
    @Override
    public int compareTo(NhiemVu v)
    {
        return this.deTai.getTenDeTai().compareTo(v.deTai.getTenDeTai());
    }
}
