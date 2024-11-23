/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05019;

/**
 *
 * @author daklp
 */
public class TramDo {
    private String maTram ,tenTram , batDau , ketThuc ;
    private double tongSoPhut, luongMuaDoDuoc;

    public TramDo(int i, String tenTram, String batDau, String ketThuc, double luongMuaDoDuoc) {
        this.maTram = "T" + String.format("%02d", i);
        this.tenTram = tenTram;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.luongMuaDoDuoc = luongMuaDoDuoc;
        this.tongSoPhut = Helper.tinhSoPhut(batDau, ketThuc) / 60;
    }

    @Override
    public String toString() {
        return this.maTram + " " + this.tenTram + " " + String.format("%.02f",this.luongMuaDoDuoc / this.tongSoPhut );
    }

    public void setMaTram(String maTram) {
        this.maTram = maTram;
    }

    public void setTenTram(String tenTram) {
        this.tenTram = tenTram;
    }

    public void setBatDau(String batDau) {
        this.batDau = batDau;
    }

    public void setKetThuc(String ketThuc) {
        this.ketThuc = ketThuc;
    }

    public void setTongSoPhut(double tongSoPhut) {
        this.tongSoPhut = tongSoPhut;
    }

    public void setLuongMuaDoDuoc(double luongMuaDoDuoc) {
        this.luongMuaDoDuoc = luongMuaDoDuoc;
    }

    public String getMaTram() {
        return maTram;
    }

    public String getTenTram() {
        return tenTram;
    }

    public String getBatDau() {
        return batDau;
    }

    public String getKetThuc() {
        return ketThuc;
    }

    public double getTongSoPhut() {
        return tongSoPhut;
    }

    public double getLuongMuaDoDuoc() {
        return luongMuaDoDuoc;
    }
    
}
