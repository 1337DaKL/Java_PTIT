/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author daklp
 */
public class Helper {
    public static Integer UCLN(Integer a , Integer b)
    {
        if(b == 0)
        {
            return a;
        }
        return  UCLN(b , a % b);
    }
    public static boolean check(Integer a , Integer b)
    {
        if(UCLN(a , b) == 1) return  true;
        return false;
    }
}
