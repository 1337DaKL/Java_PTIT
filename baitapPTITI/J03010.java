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
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        HashMap<String , Integer> map = new HashMap<>();
        while(test-- > 0)
        {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String dem = "";
            for(int i = 0 ; i < a.length - 1 ; i++)
            {
                dem += a[i].toLowerCase().charAt(0);
            }
            String ketQua = a[a.length - 1].toLowerCase() + dem ;
            if(map.containsKey(ketQua))
            {
                map.put(ketQua, map.get(ketQua) + 1);
                ketQua = ketQua + map.get(ketQua);
            }
            else
            {
                map.put(ketQua, 1);
            }
            System.out.println(ketQua + "@ptit.edu.vn");
        }
    }
}
