/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07023;

/**
 *
 * @author daklp
 */
public class Helper {
    public static boolean check(Integer n)
    {
        String s = n.toString();
        for(int i = 0 ; i <= s.length() / 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return  false;
        }
        return  n > 1;
    }
}
