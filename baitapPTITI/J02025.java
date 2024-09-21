/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class J02025 {
    public static int[] b = new int[100];
    public static int n;
    public static boolean check = true;
    public static boolean checkSoNguyenTo(Integer n)
    {
        for(Integer i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void khoiTao()
    {
        for(int i = 0 ; i < n ; i++)
        {
            b[i] = 0;
        }
    }
    public static void sinh()
    {
        int i = n - 1;
        while(i >= 0 && b[i] == 1)
        {
            b[i] = 0;
            i--;
        }
        if(i < 0) check = false;
        else
        {
            b[i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            n = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a , new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }            
            });
            check = true;
            khoiTao();
            while(check)
            {
                Integer tong = 0 ;
                for(int i = 0 ; i < n ; i++)
                {
                    if(b[i] == 1)
                    {
                        tong += a[i];
                    }
                }
                if(checkSoNguyenTo(tong))
                {
                    for(int i = 0 ; i < n ; i++)
                    {
                        if(b[i] == 1)
                        {
                            System.out.print(a[i] + " ");
                        }
                    }
                    System.out.println();
                }
                sinh();
            }
        }
    }
}
