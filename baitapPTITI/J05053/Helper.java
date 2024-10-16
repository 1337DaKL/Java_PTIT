/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05053;

/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhGiamGia(String maDonHang , long soLuong , long donGia)
    {
        String ma = maDonHang.substring(4);
        if(ma.equals("1")) return donGia * soLuong / 2;
        return donGia * soLuong * 30 / 100;
    }
}
