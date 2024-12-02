/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07011;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        int ll = sc.nextInt();
        int maxo = Integer.MIN_VALUE;
        TreeMap<String , Integer> map = new TreeMap<>();
        while(sc.hasNextLine())
        {
            String ok = sc.nextLine().toLowerCase();
            String[] arr = ok.trim().toLowerCase().split("[^0-9a-z]");
            for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i].length() > 0)
                {
                    if(map.containsKey(arr[i]))
                    {
                        map.put(arr[i], map.get(arr[i]) + 1);
                    }
                    else
                    {
                        map.put(arr[i], 1);
                    }
                }
            }
        }
        Set<Map.Entry<String , Integer>> entrys = map.entrySet();
        for(Map.Entry<String , Integer> x : entrys)
        {
            maxo = Math.max(maxo, x.getValue());
        }
        while(maxo > 0)
        {
            for(Map.Entry<String , Integer> x : entrys)
            {
                if(x.getValue() == maxo)
                {
                    System.out.println(x.getKey() + " " + x.getValue());
                }
            }
            maxo--;
        }
    }
}
