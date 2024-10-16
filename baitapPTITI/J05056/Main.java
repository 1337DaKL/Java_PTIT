/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05056;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VanDongVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++){
            arr.add(new VanDongVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        arr.get(0).setXepHang(1);
        int dem = 2;
        for(int i = 1 ; i < arr.size() ; i++)
        {
            if(arr.get(i).getSoGiayThanhTich() == arr.get(i - 1).getSoGiayThanhTich()) arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
            else arr.get(i).setXepHang(dem);
            dem++;
        }
        for(VanDongVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
