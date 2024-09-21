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
public class J03006 {
    public static boolean check(String s)
    {
        for(int i = 0 ; i < s.length() ; i++)
        {
            if((s.charAt(i) - '0') % 2 == 1) return false;
        }
        for(int i = 0 ; i <= s.length() / 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
