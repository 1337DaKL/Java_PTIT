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
public class J03028 {
    public static String rotate(String s)
    {
        int tong = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            tong += (s.charAt(i) - 'A');
        }
        int mod = tong % 26;
        String ketQua = "";
        for(int i = 0 ; i < s.length() ; i++)
        {
            int x = s.charAt(i) - 'A' + mod;
            ketQua += (char)(65 + x % 26);
        }
        return ketQua;
    }
    public static String merge(String s)
    {
        String part1 = rotate(s.substring(0 , s.length() / 2));
        String part2 = rotate(s.substring(s.length()/2));
        String ketQua1 = "";
        for(int i = 0 ; i < part1.length() ; i++)
        {
            int x = part1.charAt(i) - 'A' + (part2.charAt(i) - 'A');
            ketQua1 += (char)(65 + x % 26);
        }
        return ketQua1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            System.out.println(merge(s));
        }
    }
}
