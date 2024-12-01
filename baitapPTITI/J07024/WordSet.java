/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;
import java.util.*;
/**
 *
 * @author daklp
 */
public class WordSet {
    private TreeSet<String> set;
    public WordSet(){};
    public WordSet(String path) throws FileNotFoundException
    {
        this.set = new TreeSet<>();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String[] arr = sc.nextLine().toLowerCase().trim().split("\\s+");
            for(String x : arr)
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
        return ok;
    }

    public void setSet(TreeSet<String> set) {
        this.set = set;
    }
    public WordSet difference(WordSet b)
    {
        WordSet ketQuaSet = new WordSet();
        TreeSet<String> newSet = new TreeSet<>();
        for(String x : this.set)
        {
            if(!b.set.contains(x))
            {
                newSet.add(x);
            }
        }
        ketQuaSet.setSet(newSet);
        return ketQuaSet;
    }
    
}
