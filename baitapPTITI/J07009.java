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
class IntSet{
    private int [] a;
    protected IntSet(int[] a)
    {
        this.a = a;
    }
    protected IntSet intersection(IntSet b)
    {
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int i = 0 ; i < this.a.length ; i++)
        {
            set1.add(this.a[i]);
        }
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i = 0 ; i < b.a.length ; i++)
        {
            if(set1.contains(b.a[i]))
            {
                set2.add(b.a[i]);
            }
        }
        int j = 0;
        int[] kq = new int[set2.size()];
        for(Integer x : set2)
        {
            kq[j] = x;
            j++;
        }
        IntSet kqq = new IntSet(kq);
        return kqq;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ; i < this.a.length ; i++)
        {
            s = s + this.a[i] + " ";
        }
        return s;
    }
    
}
public class J07009 {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<m; i++) b[i] = sc.nextInt();
            IntSet s1 = new IntSet(a);
            IntSet s2 = new IntSet(b);
            IntSet s3 = s1.intersection(s2);
            System.out.println(s3);
        }
}
