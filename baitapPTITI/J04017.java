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
class Matrix
{
    private int n;
    private int m;
    private int[][] a ;
    protected Matrix(int n , int m)
    {
        this.n = n ;
        this.m = m;
        this.a = new int[n][m];
    }
    protected void nextMatrix(Scanner sc)
    {
        for(int i =0  ; i < this.n ; i++)
        {
            for(int j = 0 ; j < this.m ; j++)
            {
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    protected Matrix trans()
    {
        Matrix b = new Matrix(this.m, this.n);
        for(int i = 0 ; i < this.n ; i++)
        {
            for(int j = 0 ; j < this. m ; j++)
            {
                b.a[j][i] = this.a[i][j];            
            }
        }
        return b;
    }
    protected Matrix mul(Matrix b)
    {
        Matrix kq = new Matrix(this.n, b.m);
        for(int i = 0 ; i < this.n ; i++)
        {
            for(int j = 0 ; j < b.m ; j++)
            {
                int tmp = 0;
                for(int k = 0 ; k < this.m ; k++)
                {
                    tmp = tmp + (this.a[i][k] * b.a[k][j]);
                }
                kq.a[i][j] = tmp;
            }
        }
        return kq;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ; i < this.n ; i ++)
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
public class J04017 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                 int n = sc.nextInt(), m = sc.nextInt();
                 Matrix a = new Matrix(n,m);
                 a.nextMatrix(sc);
                 Matrix b = a.trans();
                 System.out.println(a.mul(b));
            }
        }
}
