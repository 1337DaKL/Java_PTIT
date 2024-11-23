/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05016;

/**
 *
 * @author daklp
 */
public class Helper {
    public static int tinhDonGia(String maPhong)
    {
        char x = maPhong.charAt(0);
        if(x == '1') return 25;
        if(x == '2') return  34;
        if(x == '3') return 50;
        if(x == '4') return  80;
        return 0;
    }
    
}
