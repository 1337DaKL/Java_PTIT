/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05016;

/**
 *
 * @author daklp
 */
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr);
        for(KhachHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//3
//Huynh Van Thanh   
//103 
//05/06/2010   
//05/06/2010   
//15
//Le Duc Cong  
//106 
//08/03/2010   
//01/05/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/04/2010   
//21/04/2010   
//96
