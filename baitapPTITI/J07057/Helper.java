/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07057;

/**
 *
 * @author luong
 */
public class Helper {
    public static String chuanHoa(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1) ss += " ";
        }
        return ss;
    }
    public static double tinhDiemUuTien(double kv , String danToc)
    {
        double diem = 0;
        if(kv == 1) diem += 1.5;
        if(kv == 2) diem += 1;
        if(!danToc.equals("Kinh")) diem += 1.5;
        return diem;
    }
    public static String trangThai(double diem)
    {
        if(diem >= 20.5) return "Do";
        return "Truot";
    }
}
