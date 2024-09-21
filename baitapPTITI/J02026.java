/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
//1
//
//4 3
//
//3 2 5 4
//2 3 4
//
//2 3 5
//
//2 4 5
//
//3 4 5
import java.util.*;
public class J02026 {
    public static int[] b = new int[100];
    public static int n , k;
    public static boolean check;
    public static void khoiTao()
    {
        for(int i = 1 ; i <= n ; i++)
        {
            b[i]  = i;
        }
    }
    public static void sinh()
    {
        int i = k;
        while(i > 0 && b[i] == n - k + i)
        {
            i--;
        }
        if(i == 0) check = false;
        else
        {
            b[i] ++;
            for(int j = i + 1 ; j <= k ; j++)
            {
                b[j] = b[j - 1] + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            n  = sc.nextInt();
            k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            check = true;
            khoiTao();
            while(check)
            {
                for(int i = 1 ; i <= k ; i++)
                {
                    System.out.print(a[b[i] - 1] + " ");
                }
                System.out.println();
                sinh();
            }
        }
    }
}
