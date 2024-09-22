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
import java.io.*;
import java.math.BigInteger;
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s = sc.next();
        while(s.length() > 1)
        {
            BigInteger s1 = new BigInteger(s.substring(0 , s.length() / 2));
            BigInteger s2 = new BigInteger(s.substring(s.length() / 2));
            BigInteger ss = s1.add(s2);
            s = ss.toString();
            System.out.println(s);
        }
    }
}
