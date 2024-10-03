/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07050;

/**
 *
 * @author luong
 */
public class MatHang implements Comparable<MatHang>{
    private String maMatHangString;
    private String tenHangString;
    private String nhomHangString;
    private double giaMua;
    private double giaBan;
    private double loiNhuan;
    public MatHang(int i , String ten , String nhom , double mua , double ban)
    {
        this.maMatHangString = "MH" + String.format("%02d", i);
        this.tenHangString = ten;
        this.nhomHangString = nhom;
        this.giaMua = mua;
        this.giaBan = ban;
        this.loiNhuan = ban - mua;
    }

    @Override
    public String toString() {
        return this.maMatHangString + " " + this.tenHangString + " " + this.nhomHangString + " " + String.format("%.02f", this.loiNhuan);
    }
    @Override
    public int compareTo(MatHang b)
    {
        if(this.loiNhuan < b.loiNhuan) return 1;
        return -1;
    }
}
