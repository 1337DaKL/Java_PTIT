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
class PhanSo{
    private long tu;
    private long mau;
    protected PhanSo(long tu , long mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    protected long getTu()
    {
        return this.tu;
    }
    protected long getMau()
    {
        return this.mau;
    }
    protected void setTu(long tu)
    {
        this.tu = tu;
    }
    protected void setMau(long mau)
    {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
}
public class J04003 {
    public static long ucln(long a , long b)
    {
        if(b == 0) return a;
        return ucln(b,  a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo a = new PhanSo(tu , mau);
        long ucln = ucln(a.getTu(), a.getMau());
        a.setTu(a.getTu() / ucln);
        a.setMau(a.getMau() / ucln);
        System.out.println(a);
    }
}
