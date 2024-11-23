/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07018;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SINHVIEN.in");
        Scanner sc = new Scanner(file);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new SinhVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine())));
            
        }
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
