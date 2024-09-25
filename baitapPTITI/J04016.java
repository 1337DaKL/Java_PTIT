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
class Matrix{
    private int n;
    private int m;
    private int [][] a ;
    protected Matrix(int a , int b)
    {
        this.n = a;
        this.m = b;
    }
    protected void nextMatrix(Scanner sc)
    {
        this.a = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    protected Matrix mul(Matrix b)
    {
        Matrix kq = new Matrix(this.n, b.m);
        kq.a = new int[this.n][b.m];
        for(int i = 0 ; i < this.n ; i++)
        {
            for(int j = 0 ; j < b.m ; j++)
            {
                int tmp = 0;
                for(int k = 0 ; k < this.m ; k++)
                {
                    tmp += (this.a[i][k] * b.a[k][j]);
                }
                kq.a[i][j] = tmp;
            }
        }
        return kq;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ; i < this.n ; i++)
        {
            for(int j = 0 ; j < this.m ; j++)
            {
                s = s + this.a[i][j] + " ";
            }
            s = s + "\n";
        }
        return s;
    }
    
}
public class J04016 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
           Matrix a = new Matrix(n,m);
           a.nextMatrix(sc);
           Matrix b = new Matrix(m,p);
           b.nextMatrix(sc);
           System.out.println(a.mul(b));
       }
}
