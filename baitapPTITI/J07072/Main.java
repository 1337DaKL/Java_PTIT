/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07072;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class Main  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DANHSACH.in");
        Scanner sc = new Scanner(file);
        ArrayList<HoVaTen> arr = new ArrayList<>();
        while(sc.hasNextLine())
        {
            arr.add(new HoVaTen(sc.nextLine()));
        }
        Collections.sort(arr);
        for(HoVaTen x : arr)
        {
            System.out.println(x);
        }
    }
}
