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

public class CongNhan implements Serializable {
    private static int sma = 1000;
    private int maCN;
    private String hoTen, diaChi, caSanXuat;

    public CongNhan(String hoTen, String diaChi, String caSanXuat) {
        this.maCN = sma++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.caSanXuat = caSanXuat;
    }

    public int getMaCN() {
        return maCN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCaSanXuat() {
        return caSanXuat;
    }

    public void setCaSanXuat(String caSanXuat) {
        this.caSanXuat = caSanXuat;
    }

    @Override
    public String toString() {
        return maCN + " - " + hoTen + " - " + diaChi + " - " + caSanXuat;
    }
}
