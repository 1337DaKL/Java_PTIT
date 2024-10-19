/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachDoiTuongSinhVien;

/**
 *
 * @author luong
 */
public class Helper {
    public static String chuanHoaNgaySinh(String s)
    {
        if(s.charAt(2) != '/') s = "0" + s;
        if(s.charAt(5) != '/')
        {
            StringBuilder ss = new StringBuilder(s);
            ss.insert(3, "0");
            s = ss.toString();
        }
        return s;
    }
    public static String chuanHOaTen(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            String ok = a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            ss += ok;
            if(i != a.length - 1) ss += " ";
        }
        return ss;
     }
}
