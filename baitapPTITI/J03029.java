/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class J03029 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while(scanner.hasNextLine())
        {
            System.out.println(chuanHoa(scanner.nextLine().toLowerCase().trim()));
        }
    }
    public static String chuanHoa(String s)
    {
        String[]a = s.split("\\s+");
        String ketQua = a[0].substring(0 , 1).toUpperCase() + a[0].substring(1 , a[0].length()) + " ";
        for(int i = 1 ; i < a.length ; i++)
        {
            if(!a[i].equals(".") && !a[i].equals("!") && !a[i].equals("?"))
            {
                char x = a[i - 1].charAt(a[i - 1].length() - 1 );
                if(x == '.' || x == '!' || x == '?')
                {
                    ketQua = ketQua + a[i].substring(0 , 1).toUpperCase() + a[0].substring(1) + " ";
                }
                else
                {
                    ketQua += (a[i] + " ");
                }
            }
            else
            {
                ketQua = ketQua.substring(0 , ketQua.length() - 1).concat(a[i] + " ");
            }
        }
        if((s.charAt(s.length() - 1) != '.' && s.charAt(s.length() - 1) != '!') && s.charAt(s.length() - 1) != '?') 
            ketQua = ketQua.substring(0 , ketQua.length() - 1).concat(".");
        return ketQua;
    }
}
