/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07054;

/**
 *
 * @author luong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String hoVaTenString , maSinhVienString;
    private double diem1 , diem2 , diem3 , diemTrungBinh;
    private int xepHang;
    public ThiSinh(int i , String ten , double diem1 , double diem2 , double  diem3)
    {
        this.maSinhVienString = "SV" + String.format("%02d", i);
        this.hoVaTenString = Helper.chuanHoaTen(ten);
        this.diem1 = diem1 ;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTrungBinh = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8; 
    }

    @Override
    public String toString() {
        return this.maSinhVienString + " " + this.hoVaTenString + " "  + String.format("%.02f", this.diemTrungBinh) +" " +  this.xepHang;
    }
    @Override
    public int compareTo(ThiSinh b)
    {
        return Double.compare(b.diemTrungBinh, this.diemTrungBinh); 
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
}
