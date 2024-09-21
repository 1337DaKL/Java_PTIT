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
public class J03004 {
    public static String chuanHoa(String s)
    {
        return  s.substring(0 , 1).toUpperCase() +  s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            String[] arrayS = s.trim().split("\\s+");
            for(String x : arrayS)
            {
                System.out.print(chuanHoa(x) + " ");
            }
            System.out.println();
        }
    }
}
