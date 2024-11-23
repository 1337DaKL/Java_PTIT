/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07018;

/**
 *
 * @author daklp
 */
public class Helper {
    public static String chuanHoaTen(String ten)
    {
        String[] a = ten.trim().split("\\s+");
        String ketQua = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            ketQua = ketQua + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1) ketQua += " ";
        }
        return  ketQua;
    }
    public static  String chuanHoaNgaySinh(String ngay)
    {
        if(ngay.charAt(2) != '/') ngay = "0" + ngay;
        if(ngay.charAt(5) != '/')
        {
            StringBuilder ss = new StringBuilder(ngay);
            ss.insert(3,"0");
            ngay = ss.toString();
        }
        return ngay;
    }
}
