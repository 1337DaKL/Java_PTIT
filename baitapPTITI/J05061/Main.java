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
