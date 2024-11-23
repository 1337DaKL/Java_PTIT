/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07074;

/**
 *
 * @author daklp
 */
public class LichGiangDay implements Comparable<LichGiangDay>{
    private MonHoc monHoc;
    private String thu , kip , tenGiangVien , phongHoc , maNhom;

    public LichGiangDay(int i , MonHoc monHoc, String thu, String kip, String tenGiangVien, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", i);
        this.monHoc = monHoc;
        this.thu = thu;
        this.kip = kip;
        this.tenGiangVien = tenGiangVien;
        this.phongHoc = phongHoc;
    }

    @Override
    public String toString() {
        return this.maNhom + " " + this.thu + " " + this.kip + " " + this.tenGiangVien + " " + this.phongHoc;
    }
    @Override
    public int compareTo(LichGiangDay b)
    {
        if(this.thu.equals(b.thu))
        {
            if(this.kip.equals(b.kip))
            {
                return this.tenGiangVien.compareTo(b.tenGiangVien);
            }
            return this.kip.compareTo(b.kip);
        }
        return this.thu.compareTo(b.thu);
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public String getThu() {
        return thu;
    }

    public String getKip() {
        return kip;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }
}
