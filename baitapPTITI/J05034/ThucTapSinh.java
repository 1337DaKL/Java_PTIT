/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05034;

/**
 *
 * @author luong
 */
public class ThucTapSinh implements Comparable<ThucTapSinh>{
    private int soThuTu;
    private String maSinhVienString;
    private String hoVaTenString;
    private String lopString;
    private String emailString;
    private String tenDoanhNgiepString;
    public ThucTapSinh(int i , String ma , String ho , String lop , String email , String ten)
    {
        this.soThuTu = i;
        this.maSinhVienString = ma;
        this.hoVaTenString = ho;
        this.lopString = lop;
        this.emailString = email;
        this.tenDoanhNgiepString = ten;
    }

    @Override
    public String toString() {
        return this.soThuTu + " " + this.maSinhVienString + " " + this.hoVaTenString + " " + this.lopString + " " + this.emailString + " " + this.tenDoanhNgiepString;
    }
    @Override
    public int compareTo(ThucTapSinh b)
    {
        return this.hoVaTenString.compareTo(b.hoVaTenString);
    }

    public String getTenDoanhNgiepString() {
        return tenDoanhNgiepString;
    }
}
