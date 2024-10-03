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
public class J07030 {
    public static int [] a = new int[1000000];
    public static void sang()
    {
        Arrays.fill(a, 1);
        a[0] = 0 ;
        a[1] = 0;
        for(int i = 2 ; i <= 100 ; i++)
        {
            if(a[i] == 1)
            {
                for(int j = i * i ; j < 1000000 ; j += i)
                {
                    a[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException ,ClassNotFoundException {
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        sang();
        ArrayList<Integer> arr1 = (ArrayList<Integer>) file1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) file2.readObject();
        Collections.sort(arr2);
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for(Integer x : arr1)
        {
            if(a[x] > 0)
            {
                int index = Collections.binarySearch(arr2, 1000000 - x);
                if(index > -1 && a[arr2.get(index)] > 0)
                {
                    map.put(x, 1000000 - x);
                }
            }
        }
        Set<Map.Entry<Integer , Integer>> entrys = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrys)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
