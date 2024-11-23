/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06008;

/**
 *
 * @author daklp
 */
public class LopHocPhan {
    private MonHoc monHoc;
    private GiangVien giangVien;
    private double gioHoc;

    public LopHocPhan(GiangVien giangVien, MonHoc monHoc, double gioHoc) {
        this.monHoc = monHoc;
        this.giangVien = giangVien;
        this.gioHoc = gioHoc;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public double getGioHoc() {
        return gioHoc;
    }

    @Override
    public String toString() {
        return this.monHoc.getTenMonHoc() + " " + this.gioHoc;
    }
    
}
