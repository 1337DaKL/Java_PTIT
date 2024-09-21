/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;
public class J03024 {
    public static String check(String s)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!Character.isDigit(s.charAt(i))) return "INVALID";
        }
        if(s.charAt(0) == '0') return "INVALID";
        int demc = 0 , deml = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if((s.charAt(i) - '0') %  2 == 0) demc++;
            else deml ++;
        }
        if(((demc > deml) && (s.length() % 2 == 0)) ||((deml > demc) && (s.length() % 2 == 1) )) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
