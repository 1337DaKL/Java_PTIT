/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07056;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws FileNotFoundException , IOException , ClassNotFoundException {
        File file = new File("KHACHHANG.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhacHang> arr = new ArrayList<>();
        for(int i  = 1 ; i <= n ; i++)
        {
            String ten = sc.nextLine();
            String[] a = sc.nextLine().trim().split("\\s+");
            arr.add(new KhacHang(i , ten , a[0] , Double.parseDouble(a[1]) , Double.parseDouble(a[2])));
        }
        Collections.sort(arr);
        for(KhacHang x : arr)
        {
            System.out.println(x);
        }
    }
}
