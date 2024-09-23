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
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        TreeMap<String , Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for (String a1 : a) {
                try {
                    Integer n = Integer.valueOf(a1);
                } catch (NumberFormatException e) {
                    if(map.containsKey(a1))
                    {
                        map.put(a1, map.get(a1) + 1);
                    }
                    else
                    {
                        map.put(a1, 1);
                    }
                }   
            }
        }
        Set<Map.Entry<String , Integer>> entrys = map.entrySet();
        for(Map.Entry<String , Integer> x : entrys)
        {
            Integer t = x.getValue();
            while(t -- > 0)
            {
                System.out.print(x.getKey() + " ");
            }
        }
    }
}
