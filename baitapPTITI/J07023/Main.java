/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07023;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException , ClassNotFoundException , FileNotFoundException {
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ob1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ob2.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();
        for(Integer x : arr1)
        {
            if(Helper.check(x))
            {
                set.add(x);
                if(map1.containsKey(x))
                {
                    map1.put(x, map1.get(x) + 1);
                }
                else map1.put(x, 1);
            }
        }
        for(Integer x : arr2)
        {
            if(Helper.check(x))
            {
                set.add(x);
                if(map2.containsKey(x))
                {
                    map2.put(x, map2.get(x) + 1);
                }
                else map2.put(x, 1);
            }
        }
        for(Integer x : set)
        {
            System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
        }
    }
}
