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
public class J07005  {
    public static void main(String[] args) throws FileNotFoundException , IOException{
        DataInputStream data = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[100005];
        for(int i = 0 ; i < 100000 ; i++)
        {
            a[data.readInt()] ++;
        }
        for(int i = 0 ; i < 1000 ; i++)
        {
            if(a[i] > 0) System.out.println( i + " " + a[i]);
        }
        data.close();
    }
}
