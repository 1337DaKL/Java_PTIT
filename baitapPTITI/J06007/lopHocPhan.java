/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06007;

/**
 *
 * @author daklp
 */
public class lopHocPhan {
    private GiaoVien giaoVien;
    private MonHoc monHoc;
    private double gioChuan;

    public lopHocPhan(GiaoVien giaoVien, MonHoc monHoc, double gioChuan) {
        this.giaoVien = giaoVien;
        this.monHoc = monHoc;
        this.gioChuan = gioChuan;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    
}
