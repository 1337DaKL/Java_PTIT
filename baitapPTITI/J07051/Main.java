/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07051;

/**
 *
 * @author daklp
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException, ParseException {
        File  file = new File("KHACHHANG.in");
        Scanner sc = new Scanner(file);
        ArrayList<KhachHang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new KhachHang(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , Long.parseLong(sc.nextLine())));
        }
        Collections.sort(arr);
        for(KhachHang x : arr)
        {
            System.out.println(x);
        }
    }
}
