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
public class J07031 {
    public static boolean  checkNt(int n)
    {
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args)throws FileNotFoundException, IOException , ClassNotFoundException {
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) file1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) file2.readObject();
        HashSet<Integer> set1 = new HashSet<>(arr1);
        HashSet<Integer> set2 = new HashSet<>(arr2);
        Map<Integer, Integer> map = new TreeMap<>();
        for(Integer x : arr1)
        {
            if(checkNt(x) && set1.contains(1000000 - x) && checkNt(1000000 - x) && !set2.contains(x) && !set2.contains(1000000 - x))
            {
                map.put(x, 1000000 - x);
            }
        }
        Set<Map.Entry<Integer , Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrys)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
