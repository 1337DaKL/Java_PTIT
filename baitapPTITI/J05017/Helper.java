/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05017;

/**
 *
 * @author daklp
 */
public class Helper {
    public static double tinhTongSoTien(double soDien)
    {
        double tong = 0;
        if(soDien >= 0 && soDien <= 50)
        {
            tong = Math.round(soDien * 100 + soDien * 100 * 2 / 100);
        }
        else if(soDien >= 51 && soDien <= 100)
        {
            tong = 50 * 100 ;
            tong = tong + (soDien - 50) * 150 ;
            tong = Math.round(tong + tong * 3 / 100);
        }
        else
        {
            tong = 50 * 100  + 50 * 150;
            tong = tong + (soDien - 100) * 200 ;
            tong = Math.round(tong + tong * 5 / 100);
        }
        return tong;
    }
}
