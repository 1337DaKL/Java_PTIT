/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07057;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException {
        File file = new File("THISINH.in");
        Scanner sc = new Scanner(file);
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new ThiSinh(i , sc.nextLine() ,Double.parseDouble(sc.nextLine()) , sc.nextLine() , Double.parseDouble(sc.nextLine()) ));
        }
        Collections.sort(arr);
        for(ThiSinh x : arr)
        {
            System.out.println(x);
        }
    }
}
