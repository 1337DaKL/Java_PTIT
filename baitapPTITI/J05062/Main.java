/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05062;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            String ten = sc.nextLine();
            String[] a = sc.nextLine().trim().split("\\s+");
            arr.add(new SinhVien(ten , Double.parseDouble(a[0]) , Double.parseDouble(a[1])));
        }
        ArrayList<SinhVien> arr2 = new ArrayList<>();
        for(SinhVien x : arr)
        {
            arr2.add(x);
        }
        Collections.sort(arr2);
        for(SinhVien x : arr2)
        {
            String hocBong = Helper.tinhHocBong(x.getDiemTrungBinh(), x.getDiemRenLuyen());
            if(hocBong.equals("KHONG"))
            {
                x.setHocBong(hocBong);
            }
            else
            {
                if(m != 0)
                {
                    m--;
                    x.setHocBong(hocBong);
                }
                else
                {
                    x.setHocBong("KHONG");
                }
            }
        }
        HashMap<String , String> map =new HashMap<>();
        for(SinhVien x : arr2)
        {
            map.put(x.getTenSinhVien(), x.getHocBong());
        }
        for(SinhVien x : arr)
        {
            x.setHocBong(map.get(x.getTenSinhVien()));
        }
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//3 2
//Nguyen Van Nam
//3.59 75
//Tran Hong Ngoc
//3.61 90
//Do Van An
//3.22 90
