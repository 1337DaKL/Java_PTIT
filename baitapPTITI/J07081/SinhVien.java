/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07081;

/**
 *
 * @author daklp
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien , tenSinhVien , soDienThoai , email;

    public SinhVien(String maSinhVien, String tenSinhVien, String soDienThoai, String email) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.soDienThoai + " " + this.email;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        String[] tena = this.tenSinhVien.trim().split("\\s+");
        String[] tenb = b.tenSinhVien.trim().split("\\s+");
        String dema = "";
        String demb = "";
        for(int i = 1 ; i < tena.length - 1 ; i++)
        {
            dema = dema + tena[i];
        }
        for(int i = 1 ; i < tenb.length - 1 ; i++)
        {
            demb = demb + tenb[i];
        }
        if(tena[tena.length - 1].equals(tenb[tenb.length - 1]))
        {
            if(tena[0].equals(tenb[0]))
            {
                if(dema.equals(demb))
                {
                    return this.maSinhVien.compareTo(b.maSinhVien);
                }
                return dema.compareTo(demb);
            }
            return tena[0].compareTo(tenb[0]);
        }
        return tena[tena.length - 1].compareTo(tenb[tenb.length - 1]);
    }
}
