/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07073;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws FileNotFoundException , IOException , ClassNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            arr.add(new MonHoc(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        for(MonHoc x : arr)
        {
            if(!x.getHinhThucThucHanh().equals("Truc tiep"))
            {
                System.out.println(x);
            }
        }
    }
}
