/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05014;

/**
 *
 * @author daklp
 */
public class Helper {
    public static double tinhDiemUuTien(String ma){
        int x = Integer.parseInt(ma.substring(1 , 2));
        if(x == 1) return  2;
        if(x == 2) return  1.5;
        if(x == 3) return  1;
        return 0;
    }
    public static String xetTrungTuyen(double tongDiem)
    {
        if(tongDiem >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }
    public static String monHoc(String ma){
        char x = ma.charAt(0);
        if(x == 'A') return "TOAN";
        if(x == 'B') return  "LY";
        return "HOA";
    }
}
