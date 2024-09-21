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
public class J02008 {
    public static long ucln(long a , long b)
    {
        if(b == 0) return a;
        return ucln(b , a % b);
    }
    public static long bcnn(long a , long b)
    {
        return (a * b) / ucln(a , b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[10001];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        for(int i = 3 ; i < 10001 ; i++)
        {
            a[i] = bcnn(a[i - 1] , i);
        }
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int x = sc.nextInt();
            System.out.println(a[x]);
        }
    }
}
