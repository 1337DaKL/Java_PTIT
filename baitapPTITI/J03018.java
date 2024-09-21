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

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger three = new BigInteger("3");
            BigInteger four = new BigInteger("4");
            BigInteger five = new BigInteger("5");

            BigInteger tong = BigInteger.ONE.add(BigInteger.TWO.pow(n.intValue()));
            tong = tong.add(three.pow(n.intValue()));
            tong = tong.add(four.pow(n.intValue()));

            System.out.println(tong.mod(five));
        }
    }
}
