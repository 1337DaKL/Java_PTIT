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
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0)
        {
            String[] a = sc.nextLine().split("\\s");
            String[] b = sc.nextLine().split("\\s");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            for(String x : b)
            {
                set2.add(x);
            }
            for(String x : a)
            {
                set1.add(x);
            }
            for(String x : set1)
            {
                if(!set2.contains(x)) System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
