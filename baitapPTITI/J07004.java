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
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        TreeMap<Integer , Integer> map = new TreeMap<>();
        while(sc.hasNextInt())
        {
            Integer n = sc.nextInt();
            if(map.containsKey(n))
            {
                map.put(n, map.get(n) + 1);
            }
            else
            {
                map.put(n, 1);
            }
        }
        Set<Map.Entry<Integer , Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrys)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
