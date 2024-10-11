/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05049;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            arr.add(new MatHang(sc.nextLine() , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        String loai = sc.nextLine();
        for(MatHang x : arr)
        {
            if(x.getMaMatHang().substring(0 , 1).equals(loai))
            {
                System.out.println(x);
            }
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
//B
