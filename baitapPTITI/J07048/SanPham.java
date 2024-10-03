/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07048;

/**
 *
 * @author luong
 */
public class SanPham implements Comparable<SanPham>{
    private String maSanPhamString;
    private String tenSanPhamString;
    private int giaBan;
    private int thoiGianBaoHanh;
    public SanPham(String ma , String ten , int gia , int tg)
    {
        this.maSanPhamString = ma;
        this.tenSanPhamString = ten;
        this.giaBan = gia;
        this.thoiGianBaoHanh = tg;
    }

    @Override
    public String toString() {
        return this.maSanPhamString + " " + this.tenSanPhamString + " " + this.giaBan + " " + this.thoiGianBaoHanh;
    }
    @Override
    public int compareTo(SanPham b)
    {
        if(this.giaBan == b.giaBan) return this.maSanPhamString.compareTo(b.maSanPhamString);
        return b.giaBan - this.giaBan;
    }
    
}
