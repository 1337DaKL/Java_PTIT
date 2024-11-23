/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07047;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException  , IOException , ClassNotFoundException, ParseException {
        File file1 = new File("DATA.in");
        Scanner sc1 = new Scanner(file1);
        HashMap<String , Phong> map = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        while(n-- > 0)
        {
            Phong x = new Phong(sc1.next(), sc1.next(), sc1.nextDouble(), sc1.nextDouble());
            sc1.nextLine();map.put(x.getKyHieuLoaiPhong(), x);
        }
        int m  = Integer.parseInt(sc1.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i = 1 ; i <= m ; i++)
        {
            String ten = sc1.nextLine();
            String maPhong = sc1.nextLine();
            String ngayDen = sc1.nextLine();
            String ngayDi = sc1.nextLine();
            KhachHang x = new KhachHang(map.get(maPhong.substring(2, 3)), i, ten, maPhong, ngayDen, ngayDi);
            arr.add(x);
        }
        Collections.sort(arr);
        for(KhachHang x : arr)
        {
            System.out.println(x);
        }
    }
}
