/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05064;

/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhPhuCap(String maNgach)
    {
        String chucVu = maNgach.substring(0 , 2);
        if(chucVu.equals("HT")) return 2000000;
        if(chucVu.equals("HP")) return 900000;
        return 500000;
    }
    public static long tinhHeSoLuong(String maNgach)
    {
        return Long.parseLong(maNgach.substring(2));
    }
}
