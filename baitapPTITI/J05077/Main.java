/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05077;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String , PhongBan> map = new HashMap<>();
        for(int i = 1 ; i <= n ; i++)
        {
            String[] a = sc.nextLine().trim().split("\\s+");
            String ss = "";
            for(int j = 1 ; j < a.length ; j++)
            {
                ss = ss + a[j] + " " ;
            }
            PhongBan x = new PhongBan(a[0], ss);
            map.put(x.getMaPhong(), x);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(m-- > 0)
        {
            String maNhanVien = sc.nextLine();
            PhongBan x = map.get(maNhanVien.substring(3));
            arr.add(new NhanVien(x, maNhanVien , sc.nextLine() , Long.parseLong(sc.nextLine()) , Long.parseLong(sc.nextLine())));
            
        }
        for(NhanVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
