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
public class J07021 {
    public static String chuanHoa(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ketQua = "";
        for (String a1 : a) {
            ketQua = ketQua + a1.substring(0, 1).toUpperCase() + a1.substring(1).toLowerCase() + " ";
        }
        return ketQua;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            if(s.equals("END")) break;
            System.out.println(chuanHoa(s));
        }
    }
}
