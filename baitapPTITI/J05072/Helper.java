/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05072;

/**
 *
 * @author luong
 */
public class Helper {
   
    public static boolean kiemTraNoiMang(String ma)
    {
        if(ma.charAt(0) == '0') return false;
        return true;
    }
    public static long giaCuoc(TinhThanh tinhThanh , String thoiGianBatDau , String thoiGianKetThuc)
    {
        int giobd = Integer.parseInt(thoiGianBatDau.substring(0 , 2));
        int phutbd = Integer.parseInt(thoiGianBatDau.substring(3));
        int giokt = Integer.parseInt(thoiGianKetThuc.substring(0 , 2));
        int phutkt = Integer.parseInt(thoiGianKetThuc.substring(3));
        int thoiGianGoi = (giokt * 60 + phutkt) - (giobd * 60 + phutbd);
        if(tinhThanh.getMaVung().equals("NM")) return (long)Math.round(thoiGianGoi / 3) * tinhThanh.getGiaCuoc();
        return thoiGianGoi * tinhThanh.getGiaCuoc();
    }
    public static long tinhSoPhutGoi(TinhThanh tinhThanh , String thoiGianBatDau , String thoiGianKetThuc)
    {
        int giobd = Integer.parseInt(thoiGianBatDau.substring(0 , 2));
        int phutbd = Integer.parseInt(thoiGianBatDau.substring(3));
        int giokt = Integer.parseInt(thoiGianKetThuc.substring(0 , 2));
        int phutkt = Integer.parseInt(thoiGianKetThuc.substring(3));
        int thoiGianGoi = (giokt * 60 + phutkt) - (giobd * 60 + phutbd);
        if(tinhThanh.getMaVung().equals("NM")) return (long)Math.round(thoiGianGoi / 3) ;
        return thoiGianGoi ;
    }
}
