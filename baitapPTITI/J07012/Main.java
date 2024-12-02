/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07012;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException  , IOException , ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arrString = (ArrayList<String>) ob.readObject();
        ArrayList<Pair> arr = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String x : arrString)
        {
            String[] a = x.trim().toLowerCase().split("[^0-9a-z]");
            for(String it : a)
            {
                if(it.length() > 0)
                {
                    if(map.containsKey(it))
                    {
                        map.put(it, map.get(it) + 1);
                    }
                    else map.put(it, 1);
                }
            }
        }
        Set<Map.Entry<String , Integer>> entrys = map.entrySet();
        for(Map.Entry<String , Integer> x : entrys)
        {
            Pair it = new Pair(x.getKey(), x.getValue());
            arr.add(it);
        }
        Collections.sort(arr);
        for(Pair x : arr)
        {
            System.out.println(x);
        }
    }
}
