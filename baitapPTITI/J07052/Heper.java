/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07052;

/**
 *
 * @author luong
 */
public class Heper {
    public static double tinhDiemChuan(String s)
    {
        String kv = s.substring(0 , 3);
        if(kv.equals("KV1")) return 0.5;
        if(kv.equals("KV2")) return 1;
        return 2.5;
    }
    public static String chuanHoaTen(String s)
    {
        String ss = "";
        String[] a = s.trim().split("\\s+");
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
        }
        return ss;
    }
}
