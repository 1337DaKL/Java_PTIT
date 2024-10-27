/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07060;

/**
 *
 * @author daklp
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException{
        File file1 = new File("MONTHI.in");
        Scanner sc1 = new Scanner(file1);
        HashMap<String , MonThi> map1 = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        while(n-- > 0)
        {
            MonThi monThi = new MonThi(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            map1.put(monThi.getMaMon(), monThi);
        }
        File file2 = new File("CATHI.in");
        Scanner sc2 = new Scanner(file2);
        HashMap<String , CaThi> map2 = new HashMap<>();
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 1 ; i <= m ; i++)
        {
            CaThi caThi = new CaThi(sc2.nextLine() , sc2.nextLine() , sc2.nextLine() , i);
            map2.put(caThi.getMaCaThi(), caThi);
        }
        File file3 = new File("LICHTHI.in");
        Scanner sc3 = new Scanner(file3);
        ArrayList<LichThi> arr = new ArrayList<>();
        int f = Integer.parseInt(sc3.nextLine());
        while(f-- > 0)
        {
            String[] a = sc3.nextLine().trim().split("\\s+");
             arr.add(new LichThi(map2.get(a[0]), map1.get(a[1]), a[2], a[3]));
        }
        Collections.sort(arr);
        for(LichThi x : arr)
        {
            System.out.println(x);
        }
    }
}
