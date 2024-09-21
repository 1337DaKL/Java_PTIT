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
public class boiSoChung_uocSoChung {
    public static long ucln(long a , long b)
    {
        if(b == 0) return a;
        return ucln(b, a % b);
    }
    public static long bcnn(long a , long b)
    {
        return (a * b) / ucln(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            long a = sc.nextLong() , b = sc.nextLong();
            System.out.println(bcnn(a , b) + " " + ucln(a, b));
        }
    }
}
