/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07014;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file1 = new File("DATA1.in");
        File file2 = new File("DATA2.in");
        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        TreeSet<String> map1 = new TreeSet<>();
        TreeSet<String> map2 = new TreeSet<>();
        while(sc1.hasNextLine())
        {
            String[] s = sc1.nextLine().trim().split("\\s+");
            for(int i = 0 ; i < s.length ; i++)
            {
                map1.add(s[i].toLowerCase());
            }
        }
        while(sc2.hasNextLine())
        {
            String[] s = sc2.nextLine().trim().split("\\s+");
            for(int i = 0 ; i < s.length ; i++)
            {
                map2.add(s[i].toLowerCase());
            }
        }
        TreeSet<String> hop = new TreeSet<>();
        for(String x : map1)
        {
            hop.add(x);
        }
        for(String x : map2)
        {
            hop.add(x);
        }
        for(String x : hop)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        TreeSet<String> giao = new TreeSet();
        for(String x : map1)
        {
            if(map2.contains(x))
            {
                giao.add(x);
            }
        }
        for(String x : giao)
        {
            System.out.print(x + " ");
        }
    }
}
