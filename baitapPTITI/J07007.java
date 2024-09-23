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
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String[] a = s.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(a));
        }
        for(String x : set)
        {
            System.out.println(x);
        }
    }
}
