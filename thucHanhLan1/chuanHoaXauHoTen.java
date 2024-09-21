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
public class chuanHoaXauHoTen {
    public static String chuanHoa(String s)
    {
        return s.substring(0 , 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0)
        {
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            for(int i = 0 ; i < a.length ; i++)
            {
                System.out.print(chuanHoa(a[i]) + " ");
            }
            System.out.println("");
        }
    }
}
