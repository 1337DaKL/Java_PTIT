/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05066;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gd = 1 , tp = 3 , pp = 3;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        while(n -- > 0)
        {
            String maNhanVien = sc.next();
            String tenNhanVien = sc.nextLine().trim();
            String kiTuChucVu = maNhanVien.substring(0 ,2);
            String heSoLuong = maNhanVien.substring(2 , 4);
            String soHieu = maNhanVien.substring(4);
            String chucVu;
            if(kiTuChucVu.equals("GD") && gd != 0)
            {
                gd -- ;
                chucVu = "GD";
            }
            else if(kiTuChucVu.equals("TP") && tp != 0)
            {
                tp--;
                chucVu = "TP";
            }
            else if(kiTuChucVu.equals("PP") && pp != 0)
            {
                pp -- ;
                chucVu = "PP";
            }
            else{
                chucVu = "NV";
            }
            arr.add(new NhanVien(chucVu , tenNhanVien , heSoLuong , soHieu));
        }
        Collections.sort(arr);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String check = sc.nextLine().toLowerCase();
            for(NhanVien x : arr)
            {
                if(x.getTenNhanVien().toLowerCase().contains(check))
                {
                    System.out.println(x);
                }
            }
                System.out.println("");
        }
    }
}

//6
//GD08001 Nguyen Kim Loan
//TP05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//PP06002 Phan Trung Tuan
//PP06001 Tran Quoc Huy
//NV04003 Vo Van Lan
//2
//OA
//aN