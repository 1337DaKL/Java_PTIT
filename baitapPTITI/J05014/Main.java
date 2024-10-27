/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05014;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new GiaoVien(i , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(GiaoVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0