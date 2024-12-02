/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author daklp
 */
import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arr = (ArrayList<Pair>) ob.readObject();
        Collections.sort(arr);
        HashSet<String> set = new HashSet<>();
        for(Pair x : arr)
        {
            if(x.getFirst() < x.getSecond() && Helper.check(x.getFirst(), x.getSecond()) && !set.contains(x.toString()))
            {
                System.out.println(x);
            }
            set.add(x.toString());
        }
    }
}
