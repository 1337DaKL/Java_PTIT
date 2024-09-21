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
public class kiemTraSoFibonacci {
    public static long[] fibo = new long[100];
    public static void f()
    {
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i < 100 ; i++ )
        {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f();
        int test = sc.nextInt();
        while(test -- > 0)
        {
            long n = sc.nextLong();
            boolean ok = true;
            for(int i = 0 ; i < 100 ; i++)
            {
                if(n == fibo[i])
                {
                    System.out.println("YES");
                    ok = false;
                    break;
                }
            }
            if(ok)
            {
                System.out.println("NO");
            }
        }
    }
}
