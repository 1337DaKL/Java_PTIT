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
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        TreeSet<Long> setKetQua = new TreeSet<>();
        for(int i= 0 ; i < n ; i++ )
        {
            Long x = sc.nextLong();
            setKetQua.add(x);
        }
        for(int i= 0 ; i < m ; i++ )
        {
            Long x = sc.nextLong();
            setKetQua.add(x);
        }
        for(Long x : setKetQua)
        {
            System.out.print(x + " ");
        }
    }
}
