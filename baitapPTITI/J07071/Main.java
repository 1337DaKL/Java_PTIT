/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07071;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Ten> arr = new ArrayList<>();
        while(n-- > 0)
        {
            arr.add(new Ten(sc.nextLine()));
        }
        Collections.sort(arr);
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0)
        {
            String vt = sc.nextLine();
            for(Ten x : arr)
            {
                if(Helper.check(x.getTen(),vt ))
                {
                    System.out.println(x);
                }
            }
        }
            
    }
}
