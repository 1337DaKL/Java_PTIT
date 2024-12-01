/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07075;

/**
 *
 * @author daklp
 */
public class LichGiangDay implements Comparable<LichGiangDay>{
    private String maNhom , ngayGiangDay , kipHoc , tenGiangVien , phongHoc;
    private MonHoc monHoc;

    public LichGiangDay(int i , MonHoc monHoc ,String ngayGiangDay, String kipHoc, String tenGiangVien, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", i);
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGiangVien = tenGiangVien;
        this.phongHoc = phongHoc;
        this.monHoc = monHoc;
    }
    

    @Override
    public String toString() {
        return this.maNhom + " " +this.monHoc.getTenMonHoc() + " " + this.ngayGiangDay + " " + this.kipHoc + " " + this.phongHoc;
    }
    @Override
    public int compareTo(LichGiangDay b)
    {
        if(this.ngayGiangDay.equals(b.ngayGiangDay))
        {
            if(this.kipHoc.equals(b.kipHoc))
            {
                return this.tenGiangVien.compareTo(b.tenGiangVien);
            }
            return this.kipHoc.compareTo(b.kipHoc);
        }
        return this.ngayGiangDay.compareTo(b.ngayGiangDay);
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getNgayGiangDay() {
        return ngayGiangDay;
    }

    public String getKipHoc() {
        return kipHoc;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }
    
}
