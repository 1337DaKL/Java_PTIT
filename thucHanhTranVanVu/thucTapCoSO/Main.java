/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhTranVanVu.thucTapCoSO;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        while(n-- > 0)
        {
            sinhVien.add(new SinhVien(sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
         sc = new Scanner(new File("DETAI.in"));
         int m = Integer.parseInt(sc.nextLine());
         ArrayList<DeTai> deTai = new ArrayList<>();
         for(int i = 1 ; i <= m ; i++)
         {
             deTai.add(new DeTai(i , sc.nextLine() , sc.nextLine()));
         }
        
         sc = new Scanner(new File("NHIEMVU.in"));
         ArrayList<NhiemVu> nhiemVu = new ArrayList<>();
         int test = Integer.parseInt(sc.nextLine());
         while(test-- > 0)
         {
             String[] arr = sc.nextLine().trim().split("\\s+");
             String maSinhVien = arr[0];
             int iSInhVien = 0;
             for(int i = 0 ; i < sinhVien.size() ; i++)
             {
                 if(maSinhVien.equals(sinhVien.get(i).getMaSinhVien()))
                 {
                     iSInhVien = i;
                 }
             }
             String maDeTai = arr[1];
             int iDeTai = 0;
             for(int i = 0 ; i < deTai.size() ; i++)
             {
                if(maDeTai.equals(deTai.get(i).getMaDeTaiString()))
                {
                    iDeTai = i;
                }
             }
             nhiemVu.add(new NhiemVu(sinhVien.get(iSInhVien) , deTai.get(iDeTai)));
         }
         Collections.sort(nhiemVu);
         for(NhiemVu x : nhiemVu)
         {
             System.out.println(x);
         }
    }

}
