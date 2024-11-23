/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07071;

/**
 *
 * @author daklp
 */
public class Helper {
    public static boolean check(String ten , String vt)
    {
        String[] a = ten.trim().split("\\s+");
        String ok = "";
        for(int i = 0  ; i < a.length ; i++)
        {
            ok = ok + a[i].substring( 0 , 1).toUpperCase();
            if(i != a.length - 1)
            {
                ok = ok + ".";
            }
        }
        if(ok.length() != vt.length()) return false;
        for(int i = 0 ; i < vt.length() ; i++)
        {
            if(vt.charAt(i) != '*' && vt.charAt(i) != ok.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
