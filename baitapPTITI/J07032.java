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
public class J07032 {
    public static boolean check(int n)
    {
        String s = Integer.toString(n);
        for(int i = 0 ; i < s.length() / 2 ; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            if((s.charAt(i) - '0') % 2 == 0) return false;
        }
        if(s.length() % 2 == 0) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 =(ArrayList<Integer>) file1.readObject();
        ArrayList<Integer> arr2 =(ArrayList<Integer>) file2.readObject();
        HashSet<Integer> set = new HashSet<>(arr2);
        HashSet<Integer> set2 = new HashSet<>(arr1);
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for(Integer x : arr1)
        {
            if(check(x) && set.contains(x))
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
        }
        for(Integer x : arr2)
        {
            if(check(x) && set2.contains(x))
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
        }
        int dem = 0;
        Set<Map.Entry<Integer , Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrys)
        {
            if(dem < 10)
            {
                System.out.println(x.getKey() + " " + x.getValue());
            }
            else break;
            dem++;
        }
    }
}
