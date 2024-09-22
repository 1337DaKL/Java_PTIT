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
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Hello.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
