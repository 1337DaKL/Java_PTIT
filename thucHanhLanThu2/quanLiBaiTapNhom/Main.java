/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.quanLiBaiTapNhom;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt() , m = sc.nextInt();
        sc.nextLine();
        while(n -- > 0)
        {
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i = 1 ; i <= m ; i++)
        {
            String tenBaiTap = sc.nextLine();
            for(SinhVien x : arr)
            {
                if(Integer.toString(i).equals(x.getSoThuTuNhom()))
                {
                    x.setBaiTap(tenBaiTap);
                }
            }
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
