/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05075;

/**
 *
 * @author luong
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        TreeMap<String, SinhVien> map1 = new TreeMap<>();
        TreeMap<String, DiemDanh> map2 = new TreeMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            // Read student information
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map1.put(sinhVien.getMaSinhVen(), sinhVien);
            arr.add(sinhVien.getMaSinhVen());
        }

        for (int i = 1; i <= n; i++) {
            // Read attendance data
            String maSinhVien = sc.next();
            String duLieu = sc.next();
            map2.put(maSinhVien, new DiemDanh(maSinhVien, duLieu, map1.get(maSinhVien)));
        }
        
        sc.nextLine(); // Consume the newline character after the last input
        String mapLop = sc.nextLine(); // Read the class filter input

        // Print attendance records for the specified class
        for (String x : arr) {
            if (map2.containsKey(x) && mapLop.equals(map2.get(x).getMaLop())) {
                System.out.println(map2.get(x));
            }
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}

//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
//D19CQAT02-B
