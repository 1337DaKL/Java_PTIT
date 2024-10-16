/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05058;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhDiemUuTien(String ma)
    {
        String khuVuc = ma.substring(0, 3);
        if(khuVuc.equals("KV1")) return 0.5;
        if(khuVuc.equals("KV2")) return 1;
        return 2.5;
    }
    public static String trangThaiXetTuyen(double tongDiem)
    {
        if(tongDiem >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
}
