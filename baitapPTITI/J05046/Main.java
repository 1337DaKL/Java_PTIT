/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05046;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    private static String layMaMatHang(String s)
    {
        String ss = "";
        String[] a = s.trim().split("\\s+");
        for(int i = 0 ; i < 2 ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase();
        }
        return ss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LoHang> arr = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String ten = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            int donGia = Integer.parseInt(sc.nextLine());
            String ma = layMaMatHang(ten);
            if(map.containsKey(ma))
            {
                map.put(ma, map.get(ma) + 1);
            }
            else map.put(ma, 1);
            arr.add(new LoHang(ma + String.format("%02d", map.get(ma)) , ten , soLuong , donGia));
        }
        for(LoHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000