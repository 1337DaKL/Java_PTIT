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

public class J07008 {
    public static int n;
    public static int[] a = new int[100];
    public static boolean check = true;

    public static void khoitao() {
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
    }

    public static void sinh() {
        int i = n - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i < 0) {
            check = false;
        } else {
            a[i] = 1;
        }
    }

    public static boolean checkTangDan(String s) {
        String[] c = s.trim().split("\\s+");
        if(c.length < 2) return false;
        for (int i = 1; i < c.length; i++) {
            if (Integer.parseInt(c[i]) <= Integer.parseInt(c[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DAYSO.in");
        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(file);
        n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        khoitao();
        while (check) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    s.append(b[i]).append(" ");
                }
            }
            if (!s.toString().isEmpty() && checkTangDan(s.toString().trim())) {
                set.add(s.toString().trim());
            }
            sinh();
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
