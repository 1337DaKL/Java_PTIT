
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
import java.lang.*;
import java.math.*;
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Số lượng test case
        while (t-- > 0) {
            // Nhập hai số nguyên lớn
            BigInteger input_1 = sc.nextBigInteger();
            BigInteger input_2 = sc.nextBigInteger();

            // Tìm ước chung lớn nhất (GCD)
            BigInteger gcd = input_1.gcd(input_2);
            
            // Tính bội chung nhỏ nhất (LCM)
            BigInteger lcm = input_1.multiply(input_2).divide(gcd);
            
            // In ra kết quả
            System.out.println(lcm);
        }
    }
    
}
