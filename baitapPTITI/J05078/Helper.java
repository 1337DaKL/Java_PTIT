/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05078;

/**
 *
 * @author luong
 */
public class Helper {
    public static String layMaPhong(String thongTin)
    {
        String[] ss = thongTin.trim().split("\\s+");
        return ss[0];
    }
    public static String layTenPhong(String thongTin)
    {
        String[] ss = thongTin.trim().split("\\s+");
        String s = "";
        for(int i = 1 ; i < ss.length ; i++)
        {
            s = s + ss[i];
            if(i != ss.length - 1) s += " ";
        }
        return s;
    }
    public static long tinhHeSoLuong(String ma)
    {
        char nhom = ma.charAt(0);
        int soNam = Integer.parseInt(ma.substring(1 , 3));
        if(nhom == 'A')
        {
            if(soNam >= 1 && soNam <= 3) return 10;
            if(soNam >= 4 && soNam <= 8) return 12;
            if(soNam >= 9 && soNam <= 15) return 14;
            return 20;
        }
        if(nhom == 'B')
        {
            if(soNam >= 1 && soNam <= 3) return 10;
            if(soNam >= 4 && soNam <= 8) return 11;
            if(soNam >= 9 && soNam <= 15) return 13;
            return 16;
        }
        if(nhom == 'C')
        {
            if(soNam >= 1 && soNam <= 3) return 9;
            if(soNam >= 4 && soNam <= 8) return 10;
            if(soNam >= 9 && soNam <= 15) return 12;
            return 14;
        }
        if(soNam >= 1 && soNam <= 3) return 8;
        if(soNam >= 4 && soNam <= 8) return 9;
        if(soNam >= 9 && soNam <= 15) return 11;
        return 13;
    }
}
