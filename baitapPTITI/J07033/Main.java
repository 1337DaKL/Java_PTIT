/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07033;

/**
 *
 * @author daklp
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file = new File("SINHVIEN.in");
        Scanner sc = new Scanner(file);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            arr.add(new SinhVien(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
