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
public class J03020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); 
        while(sc.hasNextLine()) {
            String x = sc.nextLine().trim();
            if(x.isEmpty()) break;  // Dừng khi nhập vào dòng trống
            String[] a = x.split("\\s+");
            for(String xx : a) {
                if(check(xx)) {
                    map.put(xx, map.getOrDefault(xx, 0) + 1);  // Tối ưu bằng getOrDefault
                }
            }
        }
        int maxo = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            maxo = Math.max(maxo, entry.getKey().length());
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().length() == maxo) {
                System.out.println(entry.getKey() + " " + entry.getValue() + " ");
            }
        }
    }

    public static boolean check(String s) {
        if (s.length() <= 1) return true;  // Chuỗi rỗng hoặc một ký tự là đối xứng
        for(int i = 0; i <= s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}

