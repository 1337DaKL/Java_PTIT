/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.sapXepDonBanQuanAo;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , SanPham> map = new HashMap<>();
        int n =Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            SanPham sanPham = new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            map.put(sanPham.getMaLoai(), sanPham);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> arr = new ArrayList<>();
        for(int i = 1 ; i <= m ; i++)
        {
            String[] a = sc.nextLine().trim().split("\\s+");
            arr.add(new DonHang(i , a[0] , Long.parseLong(a[1]) , map.get(a[0].substring(0 , 2))));
        }
        Collections.sort(arr);
        for(DonHang x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105