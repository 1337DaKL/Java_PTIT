/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05062;

/**
 *
 * @author daklp
 */
public class Helper {
    public static String tinhHocBong(double diemTrungBinh , double  diemRenLuyen)
    {
        if(diemTrungBinh >= 3.6)
        {
            if(diemRenLuyen >= 90) return "XUATSAC";
            if(diemRenLuyen >= 80) return  "GIOI";
            if(diemRenLuyen >= 70) return "KHA";
            return "KHONG";
        }
        if(diemTrungBinh >= 3.2)
        {
            if(diemRenLuyen >= 80) return "GIOI";
            if(diemRenLuyen >= 70) return "KHA";
            return "KHONG";
        }
        if(diemRenLuyen >= 2.5)
        {
            if(diemRenLuyen >= 70) return  "KHA";
            return "KHONG";
        }
        return  "KHONG";
    }
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
}
