/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05024;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while(test-- > 0)
        {
            arr.add(new SinhVien(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            String nganh = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for(SinhVien x : arr)
            {
                if(x.getNganhString().equals("CONG NGHE THONG TIN") || x.getNganhString().equals("AN TOAN THONG TIN"))
                {
                    if(!x.getLopString().substring(0 , 1).equals("E") && nganh.equals(x.getNganhString()))
                    {
                        System.out.println(x);
                    }
                }
                else
                {
                    if(nganh.equals(x.getNganhString()))
                    {
                        System.out.println(x);
                    }
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
//Ke toan
