/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05074;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String > arr = new ArrayList<>();
        Map<String , SinhVien> map = new LinkedHashMap<String, SinhVien>();
        int n = Integer.parseInt(sc.nextLine());
        Map<String , DiemDanh> map2 = new LinkedHashMap<>();
        for(int i = 1 ; i <= n ; i++)
        {
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(sinhVien.getMaSinhVien(), sinhVien);
            arr.add(sinhVien.getMaSinhVien());
        }
        for(int i = 1 ; i <= n ; i++)
        {
            String maSinhVien = sc.next();
            String duLieu = sc.next();
            map2.put(maSinhVien,new DiemDanh(maSinhVien , duLieu , map.get(maSinhVien)));
        }
        for(String x : arr)
        {
            System.out.println(map2.get(x));
        }
    }
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
