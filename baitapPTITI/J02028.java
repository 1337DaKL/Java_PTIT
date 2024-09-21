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
public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextLong();
            }
            
            long tong = a[0];
            boolean check = true;
            int j = 0;
            for(int i = 1 ; i < n ; i++)
            {
                tong += a[i];
                if(tong == k)
                {
                    System.out.println("YES");
                    check = false;
                    break;
                }
                while(tong > k && j < i)
                {
                    tong -= a[j];
                    j++;
                    if(tong == k)
                    {
                        System.out.println("YES");
                        check = false;
                        break;
                    }
                }
                if(check == false)
                {
                    break;
                }
            }
            if(check)
            {
                System.out.println("NO");
            }
        }
    }
}
