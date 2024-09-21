/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.math.BigInteger;
import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            BigInteger zeno = new BigInteger("0");
            if(a.mod(b).equals(zeno)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
