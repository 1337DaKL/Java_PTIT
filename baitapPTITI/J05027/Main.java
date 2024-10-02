/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05027;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new GiangVien(i , sc.nextLine() , sc.nextLine()));
        }
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String searchString = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + searchString + ":");
            for(GiangVien x : arr)
            {
                if(x.getTenGiangVienString().toLowerCase().contains(searchString.toLowerCase()))
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
//aN
