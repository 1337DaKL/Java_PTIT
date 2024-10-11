/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05048;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        while(n -- > 0)
        {
            arr.add(new MatHang(sc.nextLine() , Double.parseDouble(sc.nextLine())));
        }
        for(MatHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582