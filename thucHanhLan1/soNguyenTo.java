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
public class soNguyenTo {
    public static boolean check(long n)
    {
        for(long i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            long x = sc.nextLong();
            if(check(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
