/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05078;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String , PhongBan> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            PhongBan phongBan = new PhongBan(sc.nextLine());
            map.put(phongBan.getMaPhong(), phongBan);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(m -- > 0)
        {
            String ma = sc.nextLine();
            PhongBan x = map.get(ma.substring(3 , 5));
            arr.add(new NhanVien(x, ma, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        String maPhongBan = sc.nextLine();
        System.out.println("Bang luong phong "+ map.get(maPhongBan).getTenPhong() + ":");
        for(NhanVien x : arr)
        {
            
            if(maPhongBan.equals(x.getMaNhanVien().substring(3 , 5)))
            {
                System.out.println(x);
            }
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
//KH
