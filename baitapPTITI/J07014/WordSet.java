/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07014;

/**
 *
 * @author daklp
 */
import java.io.*;
import java.util.*;
public class WordSet {
    private TreeSet<String> set;

    public WordSet() {
    }
    public WordSet(String path) throws FileNotFoundException
    {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        this.set = new TreeSet<>();
        while(sc.hasNextLine())
        {
            String[] a = sc.nextLine().toLowerCase().trim().split("\\s+");
            for(String x : a)
            {
                this.set.add(x);
            }
        }
    }

    @Override
    public String toString() {
        String ok = "";
        for(String x : this.set)
        {
            ok = ok + x + " ";
        }
        return  ok;
    }
    public WordSet union(WordSet b)
    {
        WordSet ok = new WordSet();
        ok.set = new TreeSet<>();
        for(String x : this.set)
        {
            ok.set.add(x);
        }
        for(String x : b.set)
        {
            ok.set.add(x);
        }
        return  ok;
    }
    public WordSet intersection(WordSet b)
    {
        WordSet ok = new WordSet();
        ok.set = new TreeSet<>();
        for(String x : this.set)
        {
            if(b.set.contains(x))
            {
                ok.set.add(x);
            }
        }
        return ok;
    }
    
}
