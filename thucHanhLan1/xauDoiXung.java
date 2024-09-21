/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLan1;

/**
 *
 * @author luong
 */
import java.util.*;
public class xauDoiXung {
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
    public static boolean check(String s)
    {
        int dem = 0;
        for(int i = 0 ; i < s.length() / 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) dem ++;
        }
        if(s.length() % 2 == 0)
        {
            if(dem == 1) return true;
        }
        else
        {
            if(dem == 1 || dem == 0) return true;
        }
        return false;
    }
}
