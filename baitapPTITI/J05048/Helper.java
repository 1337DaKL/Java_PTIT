/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05048;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhSoLuongXuatHang(String ma , double soLuongNhap)
    {
        if(ma.charAt(0) == 'A') return Math.round(soLuongNhap * 60 / 100);
        return Math.round(soLuongNhap * 70 / 100);
    }
    public static double tinhDonGia(String ma)
    {
        if(ma.charAt(ma.length() - 1) == 'Y') return 110000;
        return 135000;
    }
    public static double tinhPhanTramThue(String ma)
    {
        if(ma.charAt(0) == 'A')
        {
            if(ma.charAt(ma.length() - 1) == 'Y') return 8;
            return 11;
        }
        if(ma.charAt(ma.length() - 1) == 'Y') return 17;
        return 22;
    }
}
