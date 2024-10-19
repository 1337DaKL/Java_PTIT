/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachGiangVienTheoBoMon;

/**
 *
 * @author luong
 */
public class GiangVien {
    private String maGiangVien ,tenGiangVien , boMonGiangDay;

    public GiangVien(int maGiangVien, String tenGiangVien, String boMonGiangDay) {
        this.maGiangVien = "GV" + String.format("%02d", maGiangVien);
        this.tenGiangVien = tenGiangVien;
        this.boMonGiangDay = Helper.vietTat(boMonGiangDay);
    }

    @Override
    public String toString() {
        return this.maGiangVien + " " + this.tenGiangVien + " " + this.boMonGiangDay;
    }

    public String getBoMonGiangDay() {
        return boMonGiangDay;
    }
    
}
