/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI;

/**
 *
 * @author daklp
 */
import java.io.*;
import java.util.*;
public class J07085 {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) ob.readObject();
        for(String x : arr)
        {
            String ok = "";
            for(int i = 0 ; i < x.length() ; i++)
            {
                if(Character.isDigit(x.charAt(i)))
                {
                    ok += x.charAt(i);
                }
            }
            String ketQua = "" ;
            for(int i = 0 ; i < ok.length() ; i++)
            {
                if(ok.charAt(i) == '0')
                {
                    ketQua += "";
                }
                else
                {
                    for(int j = i + 1 ; j < ok.length() ; j++)
                    {
                        ketQua += ok.charAt(j);
                    }
                    break;
                }
            }
            int tong = 0;
            for(int i = 0 ; i < ketQua.length() ; i++)
            {
                tong += (ketQua.charAt(i) - '0');
            }
            System.out.println(ketQua + " " + tong);
        }
    }
    
}
