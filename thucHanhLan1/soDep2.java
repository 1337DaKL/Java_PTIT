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
public class soDep2 {
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
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        int tong = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            tong = tong + (s.charAt(i) -'0');
        }
        if(tong % 10 != 0) return  false;
        return true;
    }
}
