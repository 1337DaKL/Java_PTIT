/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05007;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            NhanVien a = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(a);
        }
        Collections.sort(arr , new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                int ngayA = Integer.parseInt(o1.getNgaySinhString().substring(0 , 2));
                int thangA = Integer.parseInt(o1.getNgaySinhString().substring(3 , 5));
                int namA = Integer.parseInt(o1.getNgaySinhString().substring(6));
                int ngayB = Integer.parseInt(o2.getNgaySinhString().substring(0 , 2));
                int thangB = Integer.parseInt(o2.getNgaySinhString().substring(3 , 5));
                int namB = Integer.parseInt(o2.getNgaySinhString().substring(6));
                if(namA == namB)
                {
                    if(thangA == thangB)
                    {
                        return ngayA - ngayB;
                    }
                    return  thangA - thangB;
                }
                return namA - namB;
            }
            
        });
        for(NhanVien it : arr)
        {
            System.out.println(it);
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011
