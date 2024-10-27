/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07060;

/**
 *
 * @author daklp
 */
public class LichThi implements Comparable<LichThi>{
    private CaThi caThi;
    private MonThi monThi;
    private String maNhom , soSinhVien;

    public LichThi(CaThi caThi, MonThi monThi, String maNhom, String soSinhVien) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maNhom = maNhom;
        this.soSinhVien = soSinhVien;
    }

    public CaThi getCaThi() {
        return caThi;
    }

    public MonThi getMonThi() {
        return monThi;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getSoSinhVien() {
        return soSinhVien;
    }

    @Override
    public String toString() {
        return this.caThi.getNgayThi() + " " + this.caThi.getGioThi() + " " + this.monThi.getTenMon() + " " + this.maNhom + " " + this.soSinhVien;
    }
    @Override
    public  int compareTo(LichThi b)
    {
        if(this.caThi.getNgayThi().equals(b.caThi.getNgayThi()))
        {
            if(this.caThi.getGioThi().equals(b.caThi.getGioThi()))
            {
                return this.caThi.getMaCaThi().compareTo(b.caThi.getMaCaThi());
            }
            return  this.caThi.getGioThi().compareTo(b.caThi.getGioThi());
        }
        return this.caThi.getNgayThi().compareTo(b.caThi.getNgayThi());
    }
}
