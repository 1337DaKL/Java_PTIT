/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07055;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++)
        {
            arr.add(new SinhVien(i + 1 , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
