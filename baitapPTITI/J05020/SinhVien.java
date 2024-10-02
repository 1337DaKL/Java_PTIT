/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05020;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private String masinhVienString;
    private String hoVaTenString;
    private String lopSinhVienString;
    private String emailString;
    public SinhVien(String ma , String ten , String lop , String email)
    {
        this.masinhVienString = ma;
        this.hoVaTenString = ten;
        this.lopSinhVienString = lop;
        this.emailString = email;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        if(this.lopSinhVienString.compareTo(b.lopSinhVienString) == 0)
        {
            return this.masinhVienString.compareTo(b.masinhVienString);
        }
        return this.lopSinhVienString.compareTo(b.lopSinhVienString);
    }

    @Override
    public String toString() {
        return this.masinhVienString + " " + this.hoVaTenString + " " + this.lopSinhVienString + " " + this.emailString;
    }
    
}
