/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05029;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        int tets = Integer.parseInt(sc.nextLine());
        while(tets-- > 0)
        {
            arr.add(new DoanhNghiep(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            int a = sc.nextInt() , b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+ a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep x : arr)
            {
                if(x.getSoSinhVien() >= a && x.getSoSinhVien() <= b)
                {
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
