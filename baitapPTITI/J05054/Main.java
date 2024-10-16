/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05054;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> arr = new ArrayList<>();
        TreeMap<String , HocSinh> map = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arr.add(new HocSinh(i , sc.nextLine() , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr);
        int dem = 2;
        arr.get(0).setXepHang(1);
        for(int i = 1 ; i < arr.size() ; i++)
        {
            if(arr.get(i).getDiemTrungBinh() == arr.get(i - 1).getDiemTrungBinh()) arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
            else
            {
                arr.get(i).setXepHang(dem);
            }
            dem++;
        }
        for(HocSinh x : arr)
        {
            map.put(x.getMaHocSinh(), x);
        }
        Set<Map.Entry<String , HocSinh>> entrys = map.entrySet();
        for(Map.Entry<String , HocSinh> x : entrys)
        {
            System.out.println(x.getValue());
        }
    }
}
//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
