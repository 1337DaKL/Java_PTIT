/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.GUI;

/**
 *
 * @author daklp
 */
import java.io.Serializable;

public class SanPham implements Serializable {
    private static int sma = 1000;
    private int maSP;
    private String tenSP;
    private double donGia;

    public SanPham(String tenSP, double donGia) {
        this.maSP = sma++;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maSP + " - " + tenSP + " - " + donGia;
    }
}
