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
public class J01020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            int n = sc.nextInt();
            if(n == 0) System.out.println("Impossible");
            else
            {
                HashSet<Character> set = new HashSet<>();
                for(int i = 1 ; i < 100 ; i++)
                {
                    String s = String.valueOf(n * i);
                    for(int j = 0 ; j < s.length() ; j++)
                    {
                        set.add(s.charAt(j));
                    }
                    if(set.size() == 10) 
                    {
                        System.out.println(n * i);
                        break;
                    }
                }
            }
        }
    }
}
