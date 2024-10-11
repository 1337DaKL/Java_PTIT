/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05052;

/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhTienGiamGia(long donGia ,long soLuong , String loai)
    {
        
        if(loai.equals("1")) return donGia * soLuong / 2;
        return donGia * soLuong  * 30 / 100;
    }
}
