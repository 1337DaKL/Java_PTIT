/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07048;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Mian {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("SANPHAM.in");
        Scanner sc = new Scanner(file);
        ArrayList<SanPham> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            arr.add(new SanPham(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(SanPham x : arr)
        {
            System.out.println(x);
        }
    }
}
