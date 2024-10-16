/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05064;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> arr = new ArrayList<>();
        int demHT = 0;
        int demHP = 0;
        while(test-- > 0)
        {
            GiaoVien x = new GiaoVien(sc.nextLine(),sc.nextLine(), Long.parseLong(sc.nextLine()));
            if(x.getMaNgach().substring(0 , 2).equals("HT"))
            {
                if(demHT == 0)
                {
                    arr.add(x);
                    demHT++;
                }
            }
            else if(x.getMaNgach().substring(0 , 2).equals("HP"))
            {
                if(demHP <= 1)
                {
                    arr.add(x);
                    demHP++;
                }
            }
            else
            {
                arr.add(x);
            }
        }
        for(GiaoVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//5
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000
//HT04
//Hoang Thanh Tuan
//1780000
//HT06
//Hoang Thanh Tuan
//1780000