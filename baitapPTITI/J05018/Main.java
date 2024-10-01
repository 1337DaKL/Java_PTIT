/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05018;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            String ten = sc.nextLine();
            double diem1 = sc.nextDouble() , diem2 = sc.nextDouble() , diem3 = sc.nextDouble() , diem4 = sc.nextDouble() , diem5 = sc.nextDouble() , diem6 = sc.nextDouble(), diem7 = sc.nextDouble(), diem8 = sc.nextDouble(), diem9 = sc.nextDouble() , diem10 = sc.nextDouble();
            HocSinh a = new HocSinh(i , ten , diem1 , diem2 , diem3 , diem4 , diem5 , diem6 , diem7 , diem8 , diem9 , diem10);
            arr.add(a);
            sc.nextLine();
        }
        Collections.sort(arr , new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh())
                {
                    return 1;
                }
                if(o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) return -1;
                return o1.getMaHocSinhString().compareTo(o2.getMaHocSinhString());
            }
            
        });
        for(HocSinh x : arr)
        {
            System.out.println(x);
        }
    }
}
//5
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Trinh Dac Luong
//9.0 10 7 8 9 9 9 10 10 10