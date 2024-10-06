/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05035;


/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien>{
    private int soThuTu;
    private String maSinhVienString;
    private String hoVaTenString;
    private  String lopString;
    private String emailString;
    private String doanhNgiepString;
    public SinhVien(int i  , String ma , String ho , String lop , String email , String dn)
    {
        this.soThuTu = i;
        this.maSinhVienString = ma;
        this.hoVaTenString = ho;
        this.lopString = lop;
        this.emailString = email;
        this.doanhNgiepString = dn;
    }

    @Override
    public String toString() {
        return this.soThuTu + " " + this.maSinhVienString + " " + this.hoVaTenString + " " + this.lopString + " " + this.emailString + " " + this.doanhNgiepString;
    }
    
    @Override
    public int compareTo(SinhVien b)
    {
        return this.maSinhVienString.compareTo(b.maSinhVienString);
    }

    public String getDoanhNgiepString() {
        return doanhNgiepString;
    }
    
}
