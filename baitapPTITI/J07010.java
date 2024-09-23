/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class J07010 {
    public static String chuanHoa(String s)
    {
        if(s.charAt(2) != '/') s = "0" + s;
        if(s.charAt(5) != '/')
        {
            StringBuilder ss = new StringBuilder(s);
            ss.insert(3, "0");
            s = ss.toString();
        }
        return s;
    }
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("SV.in");
        Scanner scanner = new Scanner(file);
        int test = scanner.nextInt();
        scanner.nextLine();
        int cnt =  1;
        while(test-- > 0)
        {
            String msv = String.valueOf(cnt);
            while(msv.length() < 3)
            {
                msv = "0" + msv;
            }
            msv = "B20DCCN" + msv;
            cnt++;
            String name = scanner.nextLine();
            String classPTIT = scanner.nextLine();
            String day = scanner.nextLine();
            String gpa = scanner.nextLine();
            System.out.print(msv + " " + name + " " + classPTIT + " " + chuanHoa(day) + " ");
            System.out.printf("%.2f" , Double.valueOf(gpa));
            System.out.println("");
        }
    }
}
