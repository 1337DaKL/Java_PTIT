/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07050;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("MATHANG.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr =new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new MatHang(i , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(MatHang x : arr)
        {
            System.out.println(x);
        }
    }
}
