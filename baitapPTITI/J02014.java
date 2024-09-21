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
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int tong = 0;
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextInt();
                tong += a[i];
            }
            tong -= a[0];
            int tongTrai = 0;
            boolean check = true;
            for(int i = 1 ; i < n - 1 ; i++)
            {
                tongTrai += a[i - 1];
                tong -= a[i];
                if(tongTrai == tong)
                {
                    System.out.println(i + 1);
                    check = false;
                    break;
                }
            }
            if(check) System.out.println(-1);
        }
    }
}
