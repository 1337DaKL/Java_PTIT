    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class J07006 {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer , Integer> map = new TreeMap<>();
        ArrayList<Integer> arr = (ArrayList<Integer>) file.readObject();
        for(Integer x : arr)
        {
            if(map.containsKey(x))
            {
                map.put(x, map.get(x) + 1);
            }
            else
            {
                map.put(x, 1);
            }
        }
        Set<Map.Entry<Integer , Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrys)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
