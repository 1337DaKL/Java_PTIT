/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05042;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String tenSinhVienString;
    private long soBaiLamDung , soLuotSubmit;
    public SinhVien(String ten , long lam , long nop)
    {
        this.tenSinhVienString  = ten;
        this.soBaiLamDung = lam;
        this.soLuotSubmit = nop;
    }

    @Override
    public String toString() {
        return this.tenSinhVienString + " " + this.soBaiLamDung + " " + this.soLuotSubmit;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        if(this.soBaiLamDung == b.soBaiLamDung)
        {
            if(this.soLuotSubmit == b.soLuotSubmit) return this.tenSinhVienString.compareTo(b.tenSinhVienString);
            return (int)(this.soLuotSubmit - b.soLuotSubmit);
        }
        return (int)(b.soBaiLamDung - this.soBaiLamDung);
    }
}
