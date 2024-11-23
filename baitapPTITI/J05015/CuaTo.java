/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05015;

/**
 *
 * @author daklp
 */
public class CuaTo implements Comparable<CuaTo>{
    private String tenThiSinh , donVi , thoiDiem , ma;
    private double vanTocTrungBinh;

    public CuaTo(String tenThiSinh, String donVi, String thoiDiem) {
        this.tenThiSinh = tenThiSinh;
        this.donVi = donVi;
        this.thoiDiem = thoiDiem;
        this.ma = Helper.taoMa(this.tenThiSinh , this.donVi);
        this.vanTocTrungBinh = Helper.tinhVanToc(thoiDiem);     
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public String getDonVi() {
        return donVi;
    }

    public String getThoiDiem() {
        return thoiDiem;
    }
    @Override
    public int compareTo(CuaTo b)
    {
        return Double.compare(b.vanTocTrungBinh, this.vanTocTrungBinh);
    }

    @Override
    public String toString() {
        return this.ma + " " + this.tenThiSinh + " " + this.donVi + " " + Math.round(this.vanTocTrungBinh)+ " Km/h";
    }
}
