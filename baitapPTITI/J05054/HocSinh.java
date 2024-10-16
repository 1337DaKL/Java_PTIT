/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05054;

/**
 *
 * @author luong
 */
public class HocSinh implements Comparable<HocSinh>{
    private String tenHocSinh , maHocSinh , xepLoai  ;
    private double diemTrungBinh;
    private int xepHang;
    public HocSinh(int i , String tenHocSinh , double diemTrungBinh)
    {
        this.tenHocSinh = tenHocSinh;
        this.diemTrungBinh = diemTrungBinh;
        this.maHocSinh = "HS" + String.format("%02d", i);
        this.xepLoai = Helper.xepHang(diemTrungBinh);
    }

    @Override
    public String toString() {
        return this.maHocSinh + " " + this.tenHocSinh + " " +String.format("%.01f", this.diemTrungBinh) + " " + this.xepLoai + " " + this.xepHang;
    }
    @Override
    public int compareTo(HocSinh b)
    {
        if(this.diemTrungBinh == b.diemTrungBinh) return this.maHocSinh.compareTo(b.maHocSinh);
        return Double.compare(b.diemTrungBinh, this.diemTrungBinh);
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public int getXepHang() {
        return xepHang;
    }

    

    public String getMaHocSinh() {
        return maHocSinh;
    }
    
}
