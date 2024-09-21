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
public class dayConCoTongNguyenTo {
    public static int n ;
    public static boolean check;
    public static int [] a = new int[100];
    public static void khoiTao()
    {
        for(int i = 1 ; i <= n ; i++)
        {
            a[i] = 0;
        }
    }
    public static void sinh()
    {
        int i = n;
        while(i > 0 && a[i] == 1)
        {
            a[i] = 0;
            i--;
        }
        if(i == 0) check = false;
        else a[i] = 1;
    }
    public static boolean checkSoNguyenTo(int n)
    {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            n = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                b[i] = sc.nextInt();
            }
            check = true;
            khoiTao();
            TreeSet<String> set = new TreeSet<>();
            while(check)
            {
                int tong = 0;
                for(int i = 1 ; i <= n ; i++)
                {
                    if(a[i] == 0)
                    {
                        tong += b[i - 1];
                    }
                }
                if(checkSoNguyenTo(tong))
                {
                    String s = "";
                    for(int i = 1 ; i <= n ; i++)
                    {
                        if(a[i] == 0)
                        {
                            s = s + b[i - 1] + " ";
                        }
                    }
                    set.add(s);
                }
                sinh();
            }
            for(String x : set)
            {
                System.out.println(x);
            }
        }
    }
}
