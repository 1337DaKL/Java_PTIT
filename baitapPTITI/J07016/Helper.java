/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07016;

/**
 *
 * @author daklp
 */
public class Helper {
    public static boolean checkSoNguyenTo(Integer n)
    {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return  false;
        }
        return n > 1;
    }
}
