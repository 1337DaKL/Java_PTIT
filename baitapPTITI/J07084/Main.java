/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07084;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException, ParseException{
        File file = new File("ONLINE.in");
        Scanner sc = new Scanner(file);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int i = Integer.parseInt(sc.nextLine());
        while(i-- >0)
        {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
