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
class WordSet
{
    private String s;
    protected WordSet(String s)
    {
        this.s = s;
    }
    protected String union(WordSet b)
    {
        this.s = this.s.toLowerCase();
        b.s = b.s.toLowerCase();
        String[] x = this.s.trim().split("\\s+");
        String[] y = b.s.trim().split("\\s+");
        TreeSet<String> kq = new TreeSet<>();
        for(int i  =0 ; i < x.length ; i++)
        {
            kq.add(x[i]);
        }
        for(int i = 0 ; i < y.length ; i++)
        {
            kq.add(y[i]);
        }
        String kqString = "";
        for(String it : kq)
        {
            kqString = kqString + it + " ";
        }
        return kqString;
    }
    protected String intersection(WordSet b)
    {
        this.s = this.s.toLowerCase();
        b.s = b.s.toLowerCase();
        String[] x = this.s.trim().split("\\s+");
        String[] y = b.s.trim().split("\\s+");
        TreeSet<String> xx = new TreeSet<>();
        for(int i = 0 ; i < x.length ; i++)
        {
            xx.add(x[i]);
        }
        TreeSet<String> kq = new TreeSet<>();
        for(int i = 0 ; i < y.length ; i++)
        {
            if(xx.contains(y[i]))
            {
                kq.add(y[i]);
            }
        }
        String kqString = "";
        for(String it : kq)
        {
            kqString = kqString + it + " ";
        }
        return kqString;
    }
}
public class J04022 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            WordSet s1 = new WordSet(in.nextLine());
            WordSet s2 = new WordSet(in.nextLine());
            System.out.println(s1.union(s2));
            System.out.println(s1.intersection(s2));
        } 
}
