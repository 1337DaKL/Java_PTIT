/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05010;

/**
 *
 * @author luong
 */
public class MatHang {
    private int maMatHang;
    private String tenMatHangString;
    private String xepLoaiString;
    private double giaMuaLong;
    private double giaBanLong;
    private double loiNhuan;
    public MatHang(int i , String ten , String loai , double mua , double ban )
    {
        this.maMatHang = i;
        this.tenMatHangString = ten;
        this.xepLoaiString = loai;
        this.giaMuaLong = mua;
        this.giaBanLong = ban;
        this.loiNhuan = ban - mua;
    }
    public double getLoiNhuan()
    {
        return this.loiNhuan;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenMatHangString + " " + this.xepLoaiString + " " + String.format("%.02f", this.loiNhuan);
    }
    
}
