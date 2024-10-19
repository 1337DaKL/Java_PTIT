/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05072;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String , TinhThanh> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            TinhThanh x = new TinhThanh(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            map.put(x.getMaVung(), x);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<CuocGoi> arr = new ArrayList<>();
        while(m -- > 0)
        {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String soThueBao = a[0] ;
            String thoiGianGoiDen = a[1];
            String thoiGianKetThuc = a[2];
            int tt = Integer.parseInt(soThueBao.substring(0 , 3));
            String ok = tt + "";
            if(Helper.kiemTraNoiMang(soThueBao))
            {
                arr.add(new CuocGoi(soThueBao , thoiGianGoiDen , thoiGianKetThuc , new TinhThanh("NM" , "Noi mang" , 800)));
            }
            else{
                arr.add(new CuocGoi(soThueBao, thoiGianKetThuc, thoiGianKetThuc, map.get(ok)));
            }
        }
        for(CuocGoi x : arr)
        {
            System.out.println(x);
        }
    }
    
}
//2
//53
//Da Nang
//3000
//64
//Vung Tau
//1000
//3
//064-824531 11:20 11:22
//8293567 09:07 09:15
//053-823532 12:00 12:05
