/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05028;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoangNghiep> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            arr.add(new DoangNghiep(sc.nextLine() , sc.nextLine() , Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(DoangNghiep x : arr)
        {
            System.out.println(x);
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
