/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) input.readObject();
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
