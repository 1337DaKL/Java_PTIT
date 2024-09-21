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
public class J03005 {
    public static String chuanHoa(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- >0)
        {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(int i = 1 ; i < a.length ; i++)
            {
                if(i != a.length - 1)
                {
                    System.out.print(chuanHoa(a[i]) + " ");
                }
                else
                {
                    System.out.print(chuanHoa(a[i]) + ", ");
                }
            }
            System.out.println(a[0].toUpperCase());
        }
    }
}
