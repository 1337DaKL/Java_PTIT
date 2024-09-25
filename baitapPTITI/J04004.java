/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;

class PhanSo {
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return this.tu;
    }

    public long getMau() {
        return this.mau;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    public static long ucln(long a, long b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }
    public void rutGon() {
        long ucln = ucln(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
    }


    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong(), mau1 = sc.nextLong();
        long tu2 = sc.nextLong(), mau2 = sc.nextLong();
        PhanSo phanSo1 = new PhanSo(tu1, mau1);
        PhanSo phanSo2 = new PhanSo(tu2, mau2);
        phanSo1.rutGon();
        phanSo2.rutGon();
        long tuKQ = phanSo1.getTu() * phanSo2.getMau() + phanSo1.getMau() * phanSo2.getTu();
        long mauKQ = phanSo1.getMau() * phanSo2.getMau();
        PhanSo ketQua = new PhanSo(tuKQ, mauKQ);
        ketQua.rutGon();
        System.out.println(ketQua);
    }
}
