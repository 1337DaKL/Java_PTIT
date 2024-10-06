/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05042;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            String ten = sc.nextLine();
            long lam = sc.nextLong();
            long nop = sc.nextLong();
            sc.nextLine();
            arr.add(new SinhVien(ten , lam , nop));
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600