/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.danhSachDoiTuongSinhVien;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arrayList= new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            arrayList.add(new SinhVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arrayList);
        for(SinhVien x : arrayList)
        {
            System.out.println(x);
        }
    }
//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
}
