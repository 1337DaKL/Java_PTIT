/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05004;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n ; i++)
        {
            SinhVien a = new SinhVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()));
            System.out.println(a);
        }
    }
}
