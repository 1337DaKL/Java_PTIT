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
public class lietKeToHop2 {
    public static int n , k ;
    public static boolean check = true;
    public static int[] a = new int[100];
    public static void khoiTao()
    {
        for(int i = 1 ; i <= k ; i++)
        {
            a[i] = i;
        }
    }
    public static void sinh()
    {
        int i = k;
        while(i > 0 && a[i] == n - k + i)
        {
            i--;
        }
        if(i == 0) check = false;
        else
        {
            a[i] ++;
            for(int j = i + 1 ; j <= k ; j++)
            {
                a[j] = a[j - 1] + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        khoiTao();
        int dem = 0;
        while(check)
        {
            for(int i =1 ; i <= k ; i++)
            {
                System.out.print(a[i]);
            }
            System.out.print(" ");
            dem++;
            sinh();
        }
        System.out.println();
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
