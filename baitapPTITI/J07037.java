/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
class DoanhNgiep{
    private String maDoanhNgiepString;
    private String tenDoanhNghiepString;
    private long soSinhVien;
    protected DoanhNgiep(String ma , String ten , long sv)
    {
        this.maDoanhNgiepString = ma;
        this.tenDoanhNghiepString = ten;
        this.soSinhVien = sv;
    }
    protected String getMaDoanhNgiep()
    {
        return this.maDoanhNgiepString;
    }

    @Override
    public String toString() {
        return this.maDoanhNgiepString + " " + this.tenDoanhNghiepString + " " + this.soSinhVien;
    }
    
}
public class J07037 {
    public static void main(String[] args)  throws  FileNotFoundException{
        File file = new File("DN.in");
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        sc.nextLine();
        TreeMap<String , DoanhNgiep> map = new TreeMap<>();
        while(t -- > 0)
        {
            DoanhNgiep a = new DoanhNgiep(sc.nextLine() , sc.nextLine() , Long.parseLong(sc.nextLine()));
            map.put(a.getMaDoanhNgiep(), a);
        }
        Set<Map.Entry<String, DoanhNgiep>> entrys = map.entrySet();
        for(Map.Entry<String , DoanhNgiep> x : entrys)
        {
            System.out.println(x.getValue());
        }
    }
}
