/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.lopWordset;

import java.util.TreeSet;

/**
 *
 * @author luong
 */
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s)
    {
        this.set = Helper.tinhDoiTuong(s);
    }

    @Override
    public String toString() {
        String ketQua = "";
        for(String x : this.set)
        {
            ketQua += (x + " ");
        }
        return ketQua;
    }
    public WordSet union(WordSet b)
    {
        TreeSet<String> set  =new TreeSet<>();
        for(String x : this.set)
        {
            set.add(x);
        }
        for(String x : b.set)
        {
            set.add(x);
        }
        String ss = "";
        for(String s : set)
        {
            ss += (s + " ");
        }
        return new WordSet(ss);
        
    }
    public WordSet intersection(WordSet b)
    {
        TreeSet<String> set  =new TreeSet<>();
        for(String x : this.set)
        {
            if(b.set.contains(x))
            {
                set.add(x);
            }
        }
        String ss = "";
        for(String s : set)
        {
            ss += (s + " ");
        }
        return new WordSet(ss);
        
    }
}
