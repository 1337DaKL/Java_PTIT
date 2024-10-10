/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07054;

/**
 *
 * @author luong
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws  FileNotFoundException{
        File file = new File("BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList();
        TreeMap<Double , Integer> xepHang = new TreeMap<>();
        for(int i = 1 ; i <= n ; i++)
        {
            ThiSinh thiSinh = new ThiSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(thiSinh);
            if(xepHang.containsKey(thiSinh.getDiemTrungBinh()))
            {
                xepHang.put(thiSinh.getDiemTrungBinh(), xepHang.get(thiSinh.getDiemTrungBinh()) + 1);
            }
            else xepHang.put(thiSinh.getDiemTrungBinh(), 1);
        }
        Collections.sort(arr);
        int dem = 1;  // Vị trí bắt đầu (hạng đầu tiên)
        int cnt = 1;  // Biến đếm số lượng thí sinh có cùng điểm trung bình

        arr.get(0).setXepHang(dem);  // Gán hạng cho thí sinh đầu tiên

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).getDiemTrungBinh() == arr.get(i - 1).getDiemTrungBinh()) {
                // Nếu điểm trung bình bằng nhau, cùng hạng
                arr.get(i).setXepHang(dem);
                cnt++;
            } else {
                // Nếu khác điểm trung bình, tăng hạng lên
                dem += cnt;
                arr.get(i).setXepHang(dem);
                cnt = 1;  // Reset lại biến đếm
            }
        }
        for(ThiSinh x : arr)
        {
            System.out.println(x);
        }
    }
}
