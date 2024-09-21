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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            String ketQua = "";
            for(int i = 0 ; i < a.length ; i++)
            {
                StringBuilder str = new StringBuilder(a[i]);
                System.out.print(str.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
