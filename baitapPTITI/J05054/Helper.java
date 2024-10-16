/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05054;

/**
 *
 * @author luong
 */
public class Helper {
    public static String xepHang(double diemTrungBinh)
    {
        if(diemTrungBinh < 5) return "Yeu";
        if(diemTrungBinh < 7) return "Trung Binh";
        if(diemTrungBinh < 9) return "Kha";
        return "Gioi";
    }
}
