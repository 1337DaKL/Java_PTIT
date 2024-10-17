/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05076;

/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhDonGiaXuat(String xepLoai , long donGiaNhap , long soLuongXuat)
    {
        if(xepLoai.equals("A")) return donGiaNhap * soLuongXuat + Math.round(donGiaNhap *soLuongXuat   * 8 / 100);
        if(xepLoai.equals("B")) return donGiaNhap * soLuongXuat + Math.round(donGiaNhap *soLuongXuat   * 5 / 100);
        return donGiaNhap * soLuongXuat + Math.round(donGiaNhap *soLuongXuat   * 2 / 100);
    }
}
