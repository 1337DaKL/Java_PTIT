/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05009;

/**
 *
 * @author luong
 */
public class ThiSinh {
    private int maThiSinh;
    private String tenThiSinhString;
    private String ngaySinhString;
    private double diem1;
    private double diem2;
    private double diem3;
    private double diemTong;
    public ThiSinh(int i , String ten , String ns , double t , double l , double h)
    {
        this.maThiSinh = i;
        this.tenThiSinhString = ten;
        this.ngaySinhString = ns;
        this.diem1 = t;
        this.diem2 = l;
        this.diem3 = h;
        this.diemTong = t + l + h;
    }

    public double getDiemTong() {
        return diemTong;
    }

    @Override
    public String toString() {
        return this.maThiSinh + " " + this.tenThiSinhString + " " + this.ngaySinhString + " " + this.diemTong;
    }
    
}
