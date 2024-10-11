/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05047;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        while(n-- > 0)
        {
            String ten = sc.nextLine();
            String ma = Helper.layMaMatHang(ten);
            if(map.containsKey(ma))
            {
                map.put(ma, map.get(ma) + 1);
            }
            else map.put(ma, 1);
            arr.add(new MatHang(ma + String.format("%02d", map.get(ma)), ten , Long.parseLong(sc.nextLine()) , Long.parseLong(sc.nextLine())));
        }
        Collections.sort(arr);
        for(MatHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000
