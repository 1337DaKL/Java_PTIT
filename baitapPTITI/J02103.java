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
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1 ; t <= test ; t++)
        {
            int n = sc.nextInt() , m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < m ; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] aChuyenVi = new int[m][n];
            for(int i = 0 ; i < m ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    aChuyenVi[i][j] = a[j][i];
                }
            }
            int[][] ketQua = new int[n][n];
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    for(int k = 0 ; k < m ; k++)
                    {
                        ketQua[i][j] += (a[i][k] * aChuyenVi[k][j]);
                    }
                }
            }
            System.out.println("Test " + t + ":");
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    System.out.print(ketQua[i][j] + " ");
                }
                System.out.println();
            }
            
        }
    }
}
