/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05035;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new SinhVien(i , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(arr);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0)
        {
            String ok = sc.nextLine();
            for(SinhVien x : arr)
            {
                if(x.getDoanhNgiepString().equals(ok))
                {
                    System.out.println(x);
                }
            }
        }
    }
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT