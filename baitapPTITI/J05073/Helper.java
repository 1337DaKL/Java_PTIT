/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05073;

/**
 *
 * @author luong
 */
public class Helper {
    public static double tinhThueNhapKhau(String ma , double tienHang)
    {
        char maa = ma.charAt(0);
        if(maa == 'T') return tienHang * 29 / 100;
        if(maa == 'C') return tienHang * 10 / 100;
        if(maa == 'D') return tienHang * 8 / 100;
        return tienHang *   2 / 100;
    }
    public static double tinhPhiVaChuyen(String ma , double tienHang)
    {
        char maa = ma.charAt(0);
        if(maa == 'T') return tienHang * 4 / 100;
        if(maa == 'C') return tienHang * 3 / 100;
        if(maa == 'D') return tienHang * 2.5 / 100;
        return tienHang *   0.5 / 100;
    }
    public static double tinhGiamThue(String ma , double tienThue)
    {
        if(ma.charAt(ma.length() - 1) == 'C') return tienThue * 5 / 100;
        return 0;
    }
    public static double tinhTienBanRa(double tienHang)
    {
        return tienHang + tienHang * 20 / 100;
    }
}
