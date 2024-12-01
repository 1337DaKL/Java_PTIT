/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07033;

/**
 *
 * @author daklp
 */
public class Helper {
    public static  String chuanHoaTen(String s)
    {
        String[] arr = s.trim().split("\\s+");
        String ketQua = "";
        for(int i = 0 ; i < arr.length; i++)
        {
            ketQua = ketQua + arr[i].substring(0 , 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            if(i != arr.length - 1)
            {
                ketQua += " ";
            }
        }
        return ketQua;
    }
}
