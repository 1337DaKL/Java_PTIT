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
public class J03040 {
    public static boolean checkTangChat(String s1 , String s2 , String ss)
    {
        for(int i = 1 ; i < ss.length() ; i++)
        {
            if((ss.charAt(i) - '0') - (ss.charAt(i - 1) -'0') <= 0) return false;
        }
        return true;
    }
    public static boolean  checkBangNhau (String s1 , String s2 , String ss)
    {
        for(int i = 1 ; i < ss.length() ; i++)
        {
            if(ss.charAt(i) != ss.charAt(i - 1)) return false;
        }
        return true;
    }
    public static boolean checkBaHai(String s1 , String s2 , String ss)
    {
        for(int i = 1 ; i < s1.length() ; i++)
        {
            if(s1.charAt(i) != s1.charAt(i - 1)) return false;
        }
        for(int i = 1 ; i < s2.length() ; i++)
        {
            if(s2.charAt(i) != s2.charAt(i - 1)) return false;
        }
        return true;
    }
    public static boolean checkLocPhat(String s1 , String s2 , String ss)
    {
        for(int i = 0 ; i < ss.length() ; i++)
        {
            if(ss.charAt(i) != '6' && ss.charAt(i) != '8') return false;
        }
        return true;
    }
    public static boolean check(String s1 , String s2 , String ss)
    {
        if(checkTangChat(s1, s2, ss) || checkBaHai(s1, s2, ss) || checkBangNhau(s1, s2, ss) || checkLocPhat(s1, s2, ss)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            String s1 = s.substring(5, 8);
            String s2 = s.substring(9 , s.length());
            String ss = s1.concat(s2);
            if(check(s1 , s2 , ss)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
