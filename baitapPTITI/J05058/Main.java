/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05058;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            arr.add(new ThiSinh(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(ThiSinh x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7