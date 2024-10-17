/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05076;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThongKe> arr = new ArrayList<>();
        HashMap<String , MatHang> map1 = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            MatHang matHang = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map1.put(matHang.getMaMatHang(), matHang);
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0)
        {
            String ma = sc.next();
            ThongKe x = new ThongKe(ma, sc.nextLong(), sc.nextLong(), sc.nextLong() , map1.get(ma));
            arr.add(x);
        }
        for(ThongKe x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500