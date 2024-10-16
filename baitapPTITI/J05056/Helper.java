/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05056;

/**
 *
 * @author luong
 */
public class Helper {
    public static int tinhTuoi(String ngaySinh)
    {
        String namSinh = ngaySinh.substring(6);
        return 2021 - Integer.parseInt(namSinh);
    }
    public static String tinhUuTien(String ngaySinh)
    {
        int tuoi = tinhTuoi(ngaySinh);
        if(tuoi < 18) return "00:00:00";
        if(tuoi < 25) return "00:00:01";
        if(tuoi < 32) return "00:00:02";
        return "00:00:03";
    }
    public static int chuyenThoiGianVeSoGiay(String s)
    {
        String gio = s.substring(0 , 2);
        String phut = s.substring(3 , 5);
        String giay = s.substring(6);
        return Integer.parseInt(gio) * 60 * 60 + Integer.parseInt(phut) * 60 + Integer.parseInt(giay);
    }
    public static String chuyenSoGiayVeThoiGian(int n)
    {
        int gio = n / (60 * 60);
        n = n % (60 * 60);
        int phut = n / 60;
        n = n % 60;
        int giay = n;
        return String.format("%02d", gio) + ":" + String.format("%02d", phut) + ":" + String.format("%02d", giay);
    }
    public static String tinhThanhTichThucTe(String thoiGianXuatPhat , String thoiGianVeDich)
    {
        return chuyenSoGiayVeThoiGian(chuyenThoiGianVeSoGiay(thoiGianVeDich) - chuyenThoiGianVeSoGiay(thoiGianXuatPhat));
    }
    public static String tinhThanhTichXepHang(String thanhTichThucTe , String uuTien)
    {
        return chuyenSoGiayVeThoiGian(chuyenThoiGianVeSoGiay(thanhTichThucTe) - chuyenThoiGianVeSoGiay(uuTien));
    }
}
