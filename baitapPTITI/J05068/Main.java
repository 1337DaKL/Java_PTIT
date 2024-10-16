/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05068;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0 )
        {
            arr.add(new DonHang(sc.next() , sc.nextDouble()));
        }
        Collections.sort(arr);
        for(DonHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600
