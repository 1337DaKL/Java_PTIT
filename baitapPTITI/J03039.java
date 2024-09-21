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
import java.math.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            BigInteger a = sc.nextBigInteger() , b = sc.nextBigInteger();
            BigInteger c = a.mod(b);
            BigInteger d = b.mod(a);
            BigInteger ok = new BigInteger("0");
            if((c.compareTo(ok) == 0) || d.compareTo(ok) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
