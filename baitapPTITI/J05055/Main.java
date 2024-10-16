/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05055;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VanDongVien> arr = new ArrayList<>();
        TreeMap<String , VanDongVien> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new VanDongVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        int dem = 2;
        arr.get(0).setXepHang(1);
        for(int i = 1 ; i < arr.size(); i++)
        {
            if(arr.get(i).getSoGiayThanhTich() == (arr.get(i - 1).getSoGiayThanhTich()))
            {
                arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
            }
            else
            {
                arr.get(i).setXepHang(dem);
            }
            dem++;
        }
        for(VanDongVien x : arr)
        {
            map.put(x.getMaVanDongVien(), x);
        }
        Set<Map.Entry<String , VanDongVien>> entrys = map.entrySet();
        for(Map.Entry<String , VanDongVien> x : entrys)
        {
            System.out.println(x.getValue());
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
