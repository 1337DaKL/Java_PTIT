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
public class J02019 {
    public static boolean check(int n)
    {
        int tong = 1;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                if(i * i != n)
                {
                    tong = tong + i + n / i;
                }
                else
                {
                    tong += i;
                }
            }
        }
        return tong > n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        int dem = 0;
        for(int i = a ; i <= b ; i++)
        {
            if(check(i)) dem++;
        }
        System.out.print(dem);
    }
}
