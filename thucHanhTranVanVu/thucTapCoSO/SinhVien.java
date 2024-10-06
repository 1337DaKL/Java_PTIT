/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhTranVanVu.thucTapCoSO;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maSinhVien , hoVaTen , soDienThoai , emailString;
    public SinhVien(String ma , String ten , String sdt , String email)
    {
        this.maSinhVien = ma ;
        this.hoVaTen = ten;
        this.soDienThoai = sdt;
        this.emailString = email;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoVaTen + " " + this.soDienThoai + " " + this.emailString ;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    
}
