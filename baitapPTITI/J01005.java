/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.Scanner; 
import java.text.DecimalFormat;

public class J01005 {
    private static final DecimalFormat df = new DecimalFormat("0.000000");
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1;i <= n - 1;i++){
                System.out.print(df.format(h*Math.sqrt((double)i/n)) + " ");
            }
            System.out.println();
            t--;
        }
    }
}

