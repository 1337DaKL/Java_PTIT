/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05059;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> arr= new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            arr.add(new ThiSinh(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = 0;
        int dem = 0;
        for(ThiSinh x : arr)
        {
            dem++;
            if(dem == chiTieu)
            {
                diemChuan = x.getDiemXetTuyen();
            }
        }
        System.out.println(String.format("%.01f", diemChuan));
        for(ThiSinh x : arr)
        {
            if(diemChuan <= x.getDiemXetTuyen())
            {
                x.setTrangThai("TRUNG TUYEN");
            }
            else
            {
                x.setTrangThai("TRUOT");
            }
        }
        for(ThiSinh x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV3B123
//Ly Thi Thu Ha
//8
//6.5
//7
//1