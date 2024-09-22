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

public class J03018 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int mod = 0;
            for(int i = 0;i < s.length();i++){
                mod = (mod * 10 + s.charAt(i) - '0') % 4;
            }
            if(mod == 0) System.out.println("4");
            else System.out.println("0");
        }
    }
}
