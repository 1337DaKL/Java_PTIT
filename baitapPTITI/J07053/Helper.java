/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07053;

/**
 *
 * @author luong
 */
public class Helper {
    public static String chuanHoaTen(String s)
    {
        String ss = "";
        String[] a = s.trim().split("\\s+");
        for(int i = 0 ; i < a.length ; i++)
        {
            if(i != a.length - 1) ss = ss + a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
            else  ss = ss + a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() ;
        }
        return ss;
    }
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
    public static int tinhTuoi(String s)
    {
        int namSinh = Integer.parseInt(s.substring(6));
        return 2021 - namSinh;
    }
    public static double tinhDiemThuong(double diemLiThuyet ,double diemThucHanh)
    {
        if(diemLiThuyet >= 8 && diemThucHanh >= 8) return 1;
        if(diemLiThuyet >= 7.5 && diemThucHanh >= 7.5) return 0.5;
        return 0;
    }
    public static String xepLoai(double diem)
    {
        if(diem < 5) return "Truot";
        if(diem == 5 || diem ==6) return "Trung binh";
        if(diem == 7) return "Kha";
        if(diem == 8) return "Gioi";
        return "Xuat sac";
    }
}
