/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07073;

/**
 *
 * @author daklp
 */
public class MonHoc implements  Comparable<MonHoc>{
    private String maMonHoc ,tenMonHoc , hinhThucLyThuyet , hinhThucThucHanh , soTinChi;

    public MonHoc(String maMonHoc, String tenMonHoc,String soTinChi , String hinhThucLyThuyet, String hinhThucThucHanh) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.hinhThucLyThuyet = hinhThucLyThuyet;
        this.hinhThucThucHanh = hinhThucThucHanh;
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return this.maMonHoc + " " + this.tenMonHoc + " " + this.soTinChi + " " + this.hinhThucLyThuyet + " " + this.hinhThucThucHanh;
    }
    @Override
    public int compareTo(MonHoc b)
    {
        return this.maMonHoc.compareTo(b.maMonHoc);
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public String getHinhThucLyThuyet() {
        return hinhThucLyThuyet;
    }

    public String getHinhThucThucHanh() {
        return hinhThucThucHanh;
    }

    public String getSoTinChi() {
        return soTinChi;
    }
    
}
