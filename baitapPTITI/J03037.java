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
public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dem = 0;
        for(int i = 0 ; i < s.length() - 1 ; i += 2)
        {
            if(s.charAt(i) != s.charAt(i + 1)) dem++;
        }
        System.out.println(dem / 2);
    }
}
