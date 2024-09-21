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
public class J02016 {
    public static boolean binarySearch(long[] a , int n , long x)
    {
        int l = 0 , r = n - 1;
        while(l <= r)
        {
            int m = (l + r) / 2;
            if(a[m] == x) return true;
            else if(a[m] < x)
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n ; i++)
            {
                long x = sc.nextLong();
                a[i] = (long)Math.pow(x, 2);
            }
            Arrays.sort(a);
            boolean check = true;
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = i + 1 ; j < n ; j++)
                {
                    long x = a[i] + a[j];
                    if(binarySearch(a , n , x)) 
                    {
                        System.out.println("YES");
                        check = false;
                        break;
                    }
                }
                if(!check) break;
            }
            if(check) System.out.println("NO");
        }
    }
}
