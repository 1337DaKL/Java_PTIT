/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05053;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            arr.add(new DonHang(sc.nextLine() , sc.nextLine() , Long.parseLong(sc.nextLine()) , Long.parseLong(sc.nextLine())));
        }
        Collections.sort(arr);
        for(DonHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12
