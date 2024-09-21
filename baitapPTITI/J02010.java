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
public class J02010 {
    public static boolean check(int[] a , int n)
    {
        for(int i = 1 ; i < n ; i++)
        {
            if(a[i] < a[i - 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int dem = 1 ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(a[j] < a[i])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    
                }
            }
            System.out.print("Buoc " + dem++ + ": ");
            for(int x : a)
            {
                System.out.print(x + " ");
            }
            System.out.println();
            if(check(a , n)) break;
        }
    }
}
