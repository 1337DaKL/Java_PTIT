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
public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextLong();
            }
            long mino = 100000000+ 1;
            for(long x : a)
            {
                mino = (long)Math.min(mino, x);
            }
            for(int i = 0 ; i < n ; i++)
            {
                if(mino == a[i]) 
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
