/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05051;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhHeSo(String loaiSuDung)
    {
        if(loaiSuDung.equals("KD")) return 3;
        if(loaiSuDung.equals("NN")) return 5;
        if(loaiSuDung.equals("TT")) return 4;
        return 2;
    }
    public static double tinhPhuTroi(double chiSoMoi , double chiSoCu , double thanhTien)
    {
        double ok = chiSoMoi - chiSoCu;
        if(ok  < 50) return 0;
        if(ok <= 100) return Math.round(thanhTien * 35 / 100);
        return Math.round(thanhTien);
    }
    
}
