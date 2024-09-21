/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            int demc = 0 , deml = 0;
            for(int i = 0; i < a.length; i++) {
                if (!a[i].isEmpty()) {  // Kiểm tra nếu chuỗi không rỗng
                    int x = Integer.parseInt(a[i]);
                    if(x % 2 == 0) demc++;  // Đếm số chẵn
                    else deml++;  // Đếm số lẻ
                }
            }
            // Kiểm tra theo điều kiện
            if((a.length % 2 == 0 && demc > deml) || (a.length % 2 == 1 && deml > demc)) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}
