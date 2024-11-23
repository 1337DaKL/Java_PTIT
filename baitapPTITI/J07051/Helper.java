/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07051;

/**
 *
 * @author daklp
 */
public class Helper {
    public static long tinhDonGia(String soPhong)
    {
        int tang = Integer.parseInt(soPhong.substring(0 , 1));
        if(tang == 1) return 25;
        if(tang == 2) return 34;
        if(tang == 3 ) return 50;
        if(tang ==4 ) return 80;
        return 0;
    }
    public static  String chuanHoaTen(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ketQua = "";
        for(int i  = 0 ; i < a.length ; i++)
        {
            ketQua = ketQua + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1) ketQua += " ";
        }
        return ketQua;
    }
}
