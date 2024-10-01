/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05011;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NguoiChoi> a = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            NguoiChoi x = new NguoiChoi(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a , new Comparator<NguoiChoi>(){
            @Override
            public int compare(NguoiChoi o1, NguoiChoi o2) {
                return o2.getThoiGianCHoi() - o1.getThoiGianCHoi();
            }
            
        });
        for(NguoiChoi it : a)
        {
            System.out.println(it);
        }
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00