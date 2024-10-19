/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachGiangVienTheoBoMon;

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
        int query = Integer.parseInt(sc.nextLine());
        while(query -- > 0)
        {
            String mon = Helper.vietTat(sc.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON "+ mon +":");
            for(GiangVien x : arr)
            {
                if(x.getBoMonGiangDay().equals(mon))
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
