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
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1 ; i <= n ; i++)
        {
            Integer x = sc.nextInt();
            set.add(x);
        }
        boolean check = true;
        for(int i = 1 ; i <= set.last() ; i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check)
        {
            System.out.print("Excellent!");
        }
    }
}
