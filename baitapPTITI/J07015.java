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
public class J07015 {
    public static int[] a = new int[10000];
    public static void sangSoNguyenTo()
    {
        Arrays.fill(a, 1);
        a[0] = 0;
        a[1] = 0;
        for(int i = 2 ; i <= 100 ; i++)
        {
            if(a[i] == 1)
            {
                for(int j = i * i ; j < 10000 ; j += i)
                {
                    a[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException , ClassNotFoundException{
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        sangSoNguyenTo();
        List<Integer> arr = (List<Integer>) file.readObject();
        int[] aa = new int[10000];
        for(Integer it : arr)
        {
            aa[it] += a[it];
        }
        for(int i = 2 ; i <10000 ; i++)
        {
            if(aa[i] > 0 )
            {
                System.out.println(i + " " + aa[i]);
            }
        }
    }
}
