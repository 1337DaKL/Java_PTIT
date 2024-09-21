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
import java.lang.*;
import java.math.*;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- > 0)
        {
            BigInteger a = sc.nextBigInteger() , b = sc.nextBigInteger();
            int lenga = a.toString().length();
            int lengb = b.toString().length();
            BigInteger c = a.subtract(b).abs();
            System.out.println(c.toString().length() < Math.max(lenga, lengb) ? "0" + c : c);
        }
    }
}
