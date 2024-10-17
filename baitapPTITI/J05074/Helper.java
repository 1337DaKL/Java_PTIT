/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05074;

/**
 *
 * @author luong
 */
public class Helper {
    public static int tinhDiem(String duLieu)
    {
        int tong = 10;
        for(int i = 0 ; i < duLieu.length() ; i++)
        {
            if(duLieu.charAt(i) == 'm') tong -= 1;
            else if(duLieu.charAt(i) == 'v') tong -= 2;
        }
        if(tong < 0) return 0;
        return tong;
    }
    public static String trangThaiDieuKienThi(int diemDiemDanh)
    {
        if(diemDiemDanh == 0) return "KDDK";
        return "";
    }
}
