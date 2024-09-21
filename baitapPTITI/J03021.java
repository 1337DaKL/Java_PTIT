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
public class J03021 {
    public static boolean check(String s)
    {
        for(int i = 0 ; i <= s.length()/ 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next().toLowerCase();
            String tmp = "";
            for(int i = 0 ; i < s.length() ; i++)
            {
                int x = s.charAt(i);
                if(x == 'a' || x =='b' || x == 'c')
                {
                    tmp += "2";
                }
                if(x == 'g' || x =='h' || x == 'i')
                {
                    tmp += "4";
                }
                if(x == 'd' || x =='e' || x == 'f')
                {
                    tmp += "3";
                }
                if(x == 'j' || x =='k' || x == 'l')
                {
                    tmp += "5";
                }
                if(x == 'm' || x =='n' || x == 'o')
                {
                    tmp += "6";
                }
                if(x == 'p' || x =='q' || x == 'r' || x == 's')
                {
                    tmp += "7";
                }
                if(x == 't' || x =='u' || x == 'v')
                {
                    tmp += "8";
                }
                if(x == 'w' || x =='x' || x == 'y' || x == 'z')
                {
                    tmp += "9";
                }
            }
            if(check(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
