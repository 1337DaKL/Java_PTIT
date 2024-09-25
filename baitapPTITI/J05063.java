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

class DaThuc {
    private String s;

    protected DaThuc(String s) {
        this.s = s;
    }

    protected DaThuc cong(DaThuc b) {
        // Tách các hạng tử của đa thức hiện tại
        String[] x = this.s.split(" \\+ ");
        String[] y = b.s.split(" \\+ ");

        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        // Xử lý đa thức thứ nhất
        for (String term : x) {
            String[] parts = term.split("\\*x\\^");
            Integer heSo = Integer.parseInt(parts[0]);
            Integer soMu = Integer.parseInt(parts[1]);
            map.put(soMu, map.getOrDefault(soMu, 0) + heSo);
        }

        // Xử lý đa thức thứ hai
        for (String term : y) {
            String[] parts = term.split("\\*x\\^");
            Integer heSo = Integer.parseInt(parts[0]);
            Integer soMu = Integer.parseInt(parts[1]);
            map.put(soMu, map.getOrDefault(soMu, 0) + heSo);
        }

        // Tạo chuỗi kết quả
        StringBuilder ss = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                ss.append(entry.getValue()).append("*x^").append(entry.getKey()).append(" + ");
            }
        }

        // Loại bỏ dấu " + " thừa ở cuối
        if (ss.length() > 0) {
            ss.setLength(ss.length() - 3);
        }

        return new DaThuc(ss.toString());
    }

    @Override
    public String toString() {
        return s;
    }
}

public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
