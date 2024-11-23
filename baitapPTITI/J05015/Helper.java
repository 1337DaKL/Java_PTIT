/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05015;

/**
 *
 * @author daklp
 */
public class Helper {
    public static  String taoMa(String ten , String donVi)
    {
        String ketqua = "";
        String[] aTen = ten.trim().split("\\s+");
        String[] a = donVi.split("\\s+");
        for(int i = 0 ; i < a.length ; i++)
        {
            ketqua = ketqua + a[i].substring(0 , 1).toUpperCase();
        }
        for(int i = 0 ; i < aTen.length ; i++)
        {
            ketqua = ketqua + aTen[i].substring(0 , 1).toUpperCase();
        }
        return ketqua;
    }
    public static double tinhVanToc(String thoiDiemBatDau)
    {
        
        double thoiGianDenDich = Long.parseLong(thoiDiemBatDau.substring(0 , 1))* 60 + Long.parseLong(thoiDiemBatDau.substring(2 , 4));
        double tongThoiGian = thoiGianDenDich - 360;
        return 120 * 60 / tongThoiGian;
    }
}
