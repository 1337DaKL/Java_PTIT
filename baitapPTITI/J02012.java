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
public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        for(int i = 0;i < n;i++) arr[i] = sc.nextInt();
        for(int i = 0;i < n;i++){
            System.out.print("Buoc " + (i) + ": ");
            int tmp = arr[i];
            for(int j = i - 1;j >= 0;j--){
                if(arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }               
            }
            for(int j = 0;j < i + 1;j++) System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
}
