/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05081;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            Long mua = Long.parseLong(sc.nextLine());
            Long ban = Long.parseLong(sc.nextLine());
            MatHang x = new MatHang(i, ten, dv, mua, ban);
            a.add(x);
        }
        Collections.sort(a , new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.getLoiNhuanLong().compareTo(o1.getLoiNhuanLong());
            }
            
        });
        for (MatHang it : a) {
            System.out.println(it);
        }
    }
}
