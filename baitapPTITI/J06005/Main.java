/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06005;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, KhachHang> mapKhachHang = new HashMap<>();
        for(int i = 1 ; i <= n ; i++)
        {
            KhachHang khachHang = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapKhachHang.put(khachHang.getMaKhachHang(), khachHang);
        }
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String , MatHang> mapMatHang = new HashMap<>();
        for(int i = 1 ; i <= m ; i++)
        {
            MatHang matHang = new MatHang(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            mapMatHang.put(matHang.getMaMatHang(), matHang);
        }
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> arr = new ArrayList<>();
        for(int i = 1 ; i <= test; i++)
        {
            String maKhachHang = sc.next();
            String maMatHang = sc.next();
            long soLuong = sc.nextLong();
            sc.nextLine();
            arr.add(new HoaDon(i , mapKhachHang.get(maKhachHang) , mapMatHang.get(maMatHang) , soLuong));
        }
        for(HoaDon x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4