/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05068;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhDonGia(String maDonHang)
    {
        String ma = maDonHang.substring(0 , 1);
        if(ma.equals("X")) return 128000;
        if(ma.equals("D")) return 11200;
        return 9700;
    }
    public static double tinhThue(String maDonHang , double tongGiaTri)
    {
        if(maDonHang.substring(3).equals("TN")) return 0;
        String ma = maDonHang.substring(0 , 1);
        if(ma.equals("X")) return tongGiaTri * 3 / 100;
        if(ma.equals("D")) return tongGiaTri * 3.5 / 100;
        return tongGiaTri * 2 / 100;
    }
    public static String hangSanXuat(String maDonHang)
    {
        String ma = maDonHang.substring(3);
        if(ma.equals("BP")) return "British Petro";
        if(ma.equals("ES")) return "Esso";
        if(ma.equals("SH")) return "Shell";
        if(ma.equals("CA")) return "Castrol";
        if(ma.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
}
