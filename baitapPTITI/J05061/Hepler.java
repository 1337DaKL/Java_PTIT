/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05061;

/**
 *
 * @author luong
 */
public class Hepler {
    public static int tinhTuoi(String ngaySinh)
    {
        int namSinh = Integer.parseInt(ngaySinh.substring(6));
        return 2021 - namSinh;
    }
    public static double tinhDiemThuong(double diemLiThuyet , double diemThucHanh)
    {
        if(diemLiThuyet >= 8 && diemThucHanh >= 8) return 1;
        if(diemLiThuyet >= 7.5 && diemThucHanh >= 7.5) return 0.5;
        return 0;
    }
    public static double tinhDiemTrungBinh(double diemLiThuyet , double diemThucHanh , double diemThuong)
    {
        double tong = (diemLiThuyet + diemThucHanh) / 2 + diemThuong;
        if(tong > 10) return 10;
        return Math.round(tong);
    }
    public static String xepLoai(double diemTong)
    {
        if(diemTong < 5) return "Truot";
        if(diemTong == 5 || diemTong == 6) return "Trung binh";
        if(diemTong == 7) return "Kha";
        if(diemTong == 8) return "Gioi";
        return "Xuat sac";
    }
}
