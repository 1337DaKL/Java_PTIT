/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06005;

/**
 *
 * @author daklp
 */
public class MatHang {
    private  String maMatHang , tenMatHang , donVi;
    private long  giaMua , giaBan;

    public MatHang(int i ,String tenMatHang, String donVi, long giaMua, long giaBan) {
        this.maMatHang = "MH" + String.format("%03d", i);
        this.tenMatHang = tenMatHang;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public String getDonVi() {
        return donVi;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
    
}
