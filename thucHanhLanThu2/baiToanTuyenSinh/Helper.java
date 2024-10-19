/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.baiToanTuyenSinh;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhDiemUuTien(String maThiSinh)
    {
        String ma = maThiSinh.substring(0 , 3);
        if(ma.equals("KV1")) return 0.5;
        if(ma.equals("KV2")) return 1;
        return 2.5;
    }
    public static String xetTrangThai(double tongDiem)
    {
        if(tongDiem >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
}
