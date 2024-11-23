/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05019;

/**
 *
 * @author daklp
 */
public class Helper {
    public static double tinhSoPhut(String batDau , String ketThuc)
    {
        double bd = Double.parseDouble(batDau.substring(0 , 2)) * 60 + Double.parseDouble(batDau.substring(3 , 5));
        double kt = Double.parseDouble(ketThuc.substring(0 , 2)) * 60 + Double.parseDouble(ketThuc.substring(3 , 5));
        return  kt - bd;
    }
}
