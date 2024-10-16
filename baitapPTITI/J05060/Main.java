/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05061;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhuHo> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new PhuHo(i , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        for(PhuHo x : arr)
        {
            System.out.println(x);
        }
    }
    
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9