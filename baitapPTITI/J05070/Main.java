/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05070;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<TranDau> arr = new ArrayList<>();
        TreeMap<String , CauLacBo> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            CauLacBo x = new CauLacBo(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            map.put(x.getMaCauLacBo(), x);
        }
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String maTranDau = sc.next();
            long soCoDongVien = sc.nextLong();
            arr.add(new TranDau(maTranDau , soCoDongVien , map.get(maTranDau.substring(1, 3))));
        }
        Collections.sort(arr);
        for(TranDau x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
