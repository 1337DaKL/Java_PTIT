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
public class J03007 {
    public static boolean check(String s)
    {
        for(int i = 0 ; i < s.length() / 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        int tong = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            tong  += (s.charAt(i) - '0');
        }
        if(tong % 10 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
