/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05047;

/**
 *
 * @author luong
 */
public class Helper {
    public static  String layMaMatHang(String s)
         {
             String[] a = s.trim().split("\\s+");
             String ss = "";
             for(int i = 0 ; i < 2 ; i++)
             {
                 ss += a[i].substring(0 , 1).toUpperCase();
             }
             return ss;
         }
    public static long tinhPhanTramChietKhau(long soLuong)
    {
        if(soLuong > 10) return 5;
        if(soLuong >= 8) return 2;
        if(soLuong >= 5 ) return 1;
        return 0;
    }
}
