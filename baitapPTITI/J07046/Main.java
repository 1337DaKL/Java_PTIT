/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07046;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACH.in");
        Scanner sc = new Scanner(file);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
       for(int i = 1 ; i <= test ; i++)
       {
           a.add(new KhachHang(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
       }
       Collections.sort(a);
       for(KhachHang x : a)
       {
           System.out.println(x);
       }
    }
}
