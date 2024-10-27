/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07060;

/**
 *
 * @author daklp
 */
public class MonThi {
    private String maMon , tenMon , hinhThucThi;

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public MonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }
    
}
