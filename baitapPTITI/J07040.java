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
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException {
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr1 = (ArrayList<String>) file1.readObject();
        HashSet<String> set = new HashSet<>();
        for(String i : arr1)
        {
            String[] words = i.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(words));
        }
        File file2 = new File("VANBAN.in");
        Scanner sc = new Scanner(file2);
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(int i = 0 ; i < a.length ; i++)
            {
                if(set.contains(a[i].toLowerCase()))
                {
                    System.out.println(a[i].toLowerCase());
                    set.remove(a[i].toLowerCase());
                }
            }
        }
    }
}
