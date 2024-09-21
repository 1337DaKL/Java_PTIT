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
public class J03008 {
    public static boolean checkSoNguyenTo(int n)
    {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static boolean check(String s)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(!checkSoNguyenTo(s.charAt(i) - '0'))
            {
                return false;
            }
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
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
