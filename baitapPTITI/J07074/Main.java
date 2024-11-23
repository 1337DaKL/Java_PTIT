/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07074;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException {
        File file1 = new File("MONHOC.in");
        File file2 = new File("LICHGD.in");
        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        HashMap<String , MonHoc> map = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        while(n-- > 0)
        {
            MonHoc x = new MonHoc(sc1.nextLine(), sc1.nextLine(), Integer.parseInt(sc1.nextLine()));
            map.put(x.getMaMonHoc(), x);
        }
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<LichGiangDay> arrayList= new ArrayList<>();
        for(int i = 1 ; i <= m ; i++)
        {
            LichGiangDay x = new LichGiangDay(i, map.get(sc2.nextLine()), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine());
            arrayList.add(x);
        }
        Collections.sort(arrayList);
        String test = sc2.nextLine();
        System.out.println("LICH GIANG DAY MON " + map.get(test).getTenMonHoc() + ":");
        for(LichGiangDay x : arrayList)
        {
            if(x.getMonHoc().getMaMonHoc().equals(test))
            {
                System.out.println(x);
            }
        }
    }
}
