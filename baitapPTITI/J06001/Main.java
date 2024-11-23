/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06001;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String , SanPham> map = new HashMap<>();
        while(n -- > 0)
        {
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            map.put(x.getMaSanPham(), x);
        }
        ArrayList<HoaDon> arr = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= m ; i++)
        {
            String[] a =sc.nextLine().trim().split("\\s+");
            String ma = a[0];
            long soLuong = Long.parseLong(a[1]);
            arr.add(new HoaDon(i, map.get(ma.substring(0 , 2)), ma, soLuong));
        }
        Collections.sort(arr);
        for(HoaDon x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105
