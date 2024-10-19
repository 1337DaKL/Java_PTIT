/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachGiangVienTheoBoMon;

/**
 *
 * @author luong
 */
public class Helper {
    public static String vietTat(String s)
    {
        String ss = "";
        String[] a = s.trim().split("\\s+");
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase();
        }
        return ss;
    }
}
