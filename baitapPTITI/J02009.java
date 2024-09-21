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
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer , Integer> map = new TreeMap<>();
        while(n-- > 0)
        {
            Integer x = sc.nextInt() , y = sc.nextInt();
            if(map.containsKey(x)) y += map.get(x);
            map.put(x, y);
        }
        int cntTimeEnd = 0;
        Set<Map.Entry<Integer , Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer , Integer> x : entrySet)
        {
            if(cntTimeEnd < x.getKey())
            {
                cntTimeEnd = x.getKey() + x.getValue();
            }
            else
            {
                cntTimeEnd += x.getValue();
            }
        }
        System.out.print(cntTimeEnd);
    }
}
