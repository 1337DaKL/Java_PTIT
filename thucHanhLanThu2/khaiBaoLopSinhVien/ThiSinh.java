/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.khaiBaoLopSinhVien;

/**
 *
 * @author luong
 */
public class ThiSinh {
    private String tenSinhVien , ngaySinh;
    private double diem1 , diem2 , diem3 , tongdiem;

    public ThiSinh(String tenSinhVien, String ngaySinh, double diem1, double diem2, double diem3) {
        this.tenSinhVien = tenSinhVien;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongdiem = diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return this.tenSinhVien + " " + this.ngaySinh + " " + String.format("%.01f", this.tongdiem);
    }
    
}
