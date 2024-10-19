/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.sapXepDonBanQuanAo;


/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhTienGiamGia(long soLuong ,long thanhTien )
    {
        if(soLuong >= 150) return thanhTien * 50 / 100;
        if(soLuong >= 100) return thanhTien * 30 / 100;
        if(soLuong >= 50) return thanhTien * 15 / 100;
        return 0;
    }
    public static long tinhDonGia(String ma , SanPham sanPham)
    {
        if(ma.substring(2 , 3).equals("1")) return sanPham.getDonGialoai1();
        return sanPham.getDonGiaLoai2();
    }
}
