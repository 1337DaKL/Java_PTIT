/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05059;

/**
 *
 * @author daklp
 */
public class Helper {
    public static double tinhDiemUuTien(String maThiSinh)
    {
        String khuVuc = maThiSinh.substring(0 , 3);
        if(khuVuc.equals("KV1")) return 0.5;
        if(khuVuc.equals("KV2")) return 1;
        return 2.5;
    }
}
