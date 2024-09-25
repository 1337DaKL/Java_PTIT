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
class IntSet{
    private int[] a ;
    protected IntSet(int[] a)
    {
        this.a = a;
    }
    protected IntSet union(IntSet b)
    {
        TreeSet<Integer> kq = new TreeSet<>();
        for(int i = 0 ; i < this.a.length ; i++)
        {
            kq.add(this.a[i]);
        }
        for(int i = 0 ; i < b.a.length ; i++)
        {
            kq.add(b.a[i]);
        }
        int[] kk = new int[kq.size()];
        int j = 0;
        for(Integer x : kq)
        {
            kk[j] = x;
            j++;
        }
        IntSet kqq = new IntSet(kk);
        return kqq;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ; i < this.a.length ; i++)
        {
            s  = s + this.a[i] + " ";
        }
        return s;
    }
    
}
public class J04021 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<m; i++) b[i] = sc.nextInt();
            IntSet s1 = new IntSet(a);
            IntSet s2 = new IntSet(b);
            IntSet s3 = s1.union(s2);
            System.out.println(s3);
        }  
}
