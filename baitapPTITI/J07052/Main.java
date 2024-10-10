/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07052;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file = new File("THISINH.in");
        Scanner sc = new Scanner(file);
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            arr.add(new ThiSinh(sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = 0;
        for(int i = 0 ; i < arr.size() ; i++)
        {
            if(i + 1 <= chiTieu ) diemChuan = arr.get(i).getDiemChuan();
            else break;
        }
        System.out.println(String.format("%.01f", diemChuan));
        for(ThiSinh x : arr)
        {
            if(x.getDiemChuan() < diemChuan) x.setTrangThai("TRUOT");
            else x.setTrangThai("TRUNG TUYEN");
            System.out.println(x);
        }
    }
}
