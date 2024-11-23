/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06001;

/**
 *
 * @author daklp
 */
public class Helper {
    public static long tinhTongSoTien(SanPham sanPham , long soLuong , String maDonHang)
    {
        if(maDonHang.substring(2 , 3).equals("1"))
        {
            return sanPham.getDonGiaLoai1() * soLuong;
        }
        return  sanPham.getDonGiaLoai2() * soLuong;
    }
    public static long tinhTienGiamGia(long tongTien , long soLuong)
    {
        if(soLuong >= 150) return tongTien / 2;
        if(soLuong >= 100) return tongTien * 3 / 10;
        if(soLuong >= 50) return tongTien * 15 / 100;
        return 0;
    }
}
