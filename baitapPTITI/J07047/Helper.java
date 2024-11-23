/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07047;

/**
 *
 * @author daklp
 */
public class Helper {
    public static double tinhPhanTramGiamGia(double soNgayO)
    {
        if(soNgayO < 10) return 0;
        if(soNgayO < 20) return 0.02;
        if(soNgayO <= 30) return 0.04;
        return 0.06;
    }
}
