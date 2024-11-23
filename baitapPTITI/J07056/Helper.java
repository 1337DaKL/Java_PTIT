/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07056;

/**
 *
 * @author daklp
 */
public class Helper {
    public static String chuanHoaTen(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ok = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            ok = ok + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1)
            {
                ok = ok + " ";
            }
        }
        return  ok;
    }
    public static double tinhDinhMuc( String loai)
    {
        if(loai.equals("A")) return 100;
        if(loai.equals("B")) return 500;
        return 200;
    }
    public static double tinhTienTrongDinhMuc(double soDien , double dinhMuc)
    {
        if(soDien < dinhMuc)
        {
            return soDien * 450;
        }
        return dinhMuc * 450;
    }
    public static double tinhTienVuotDinhMuc(double soDien , double dinhMuc)
    {
        if(soDien > dinhMuc)
        {
            return (soDien - dinhMuc) * 1000;
        }
        return 0;
    }
    public static double tinhThue(double soTienVuotDinhMuc)
    {
        return 5 * soTienVuotDinhMuc / 100;
    }
}
