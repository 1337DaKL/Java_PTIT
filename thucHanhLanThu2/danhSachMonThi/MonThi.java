/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachMonThi;

/**
 *
 * @author luong
 */
public class MonThi implements Comparable<MonThi>{
    private String maMon , tenMon , hinhThucThi;

    public MonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    @Override
    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.hinhThucThi;
    }
    @Override
    public int compareTo(MonThi b)
    {
        return this.maMon.compareTo(b.maMon);
    }
}
