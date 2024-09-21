/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLan1;

/**
 *
 * @author luong
 */
import java.util.*;
public class soLienKe {
    public static boolean check(String s)
    {
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(Math.abs((s.charAt(i) - s.charAt(i - 1))) != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            if(check(s))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
