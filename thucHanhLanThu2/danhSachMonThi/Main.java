/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachMonThi;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        ArrayList<MonThi> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            arr.add(new MonThi(sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        for(MonThi x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//MUL1320
//Nhap mon da phuong tien
//Bai tap lon + Van dap truc tuyen
//BAS1203
//Giai tich 1
//Thi viet + Van dap truc tuyen
