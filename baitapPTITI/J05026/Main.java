/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05026;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static String chuanHoaoa(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "" ;
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase();
        }
        return ss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n ; i++)
        {
            arr.add(new GiangVien(i , sc.nextLine() , sc.nextLine()));
        }
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String s = chuanHoaoa(sc.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
            for(GiangVien x : arr)
            {
                if(x.getBoMonString().equals(s))
                {
                    System.out.println(x);
                }
            }
            
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem
