/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long tong = 0;
        while(sc.hasNext())
        {
            String s = sc.next();
            try {
                tong += Integer.parseInt(s);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(tong);
    }
}
