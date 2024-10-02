/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05023;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(n-- > 0)
        {
            arr.add(new SinhVien(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String ma = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + ma + ":");
            for(SinhVien x : arr)
            {
                if(ma.substring(2).equals(x.getLopString().substring(1 , 3)))
                {
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015