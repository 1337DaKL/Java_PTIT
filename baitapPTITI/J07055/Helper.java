/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07055;

/**
 *
 * @author luong
 */
public class Helper {
    public static String chuanHoa(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "";
        for(int i = 0 ; i < a.length ; i ++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1) ss += " ";
        }
        return ss;
    }
    public static String xepLoai(double n)
    {
        if(n >= 8) return "GIOI";
        if(n >= 6.5) return "KHA";
        if(n >= 5) return "TRUNG BINH";
        return "KEM";
    }
}
