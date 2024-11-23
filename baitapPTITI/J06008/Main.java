/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06008;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , MonHoc> mapMonHoc = new HashMap<>();
        HashMap<String , GiangVien> mapGiangVien = new HashMap<>();
        HashMap<String , Double> mapLopHocPhan = new HashMap<>();
        ArrayList<LopHocPhan> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0)
        {
            MonHoc monHoc = new MonHoc(sc.next(), sc.nextLine().trim());
            mapMonHoc.put(monHoc.getMaMonHoc(), monHoc);
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0)
        {
            GiangVien giangVien = new GiangVien(sc.next(), sc.nextLine().trim());
            mapGiangVien.put(giangVien.getMaGiangVien(), giangVien);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0)
        {
            LopHocPhan lopHocPhan = new LopHocPhan(mapGiangVien.get(sc.next()), mapMonHoc.get(sc.next()), sc.nextDouble());
            sc.nextLine();
            if(mapLopHocPhan.containsKey(lopHocPhan.getGiangVien().getMaGiangVien()))
            {
                mapLopHocPhan.put(lopHocPhan.getGiangVien().getMaGiangVien(), mapLopHocPhan.get(lopHocPhan.getGiangVien().getMaGiangVien()) + lopHocPhan.getGioHoc());
            }
            else
            {
                mapLopHocPhan.put(lopHocPhan.getGiangVien().getMaGiangVien(), lopHocPhan.getGioHoc());
            }
            arr.add(lopHocPhan);
        }
        String maGiangVien = sc.nextLine();
        System.out.println("Giang vien: " + mapGiangVien.get(maGiangVien).getTenGiangVien());
        for(LopHocPhan x : arr)
        {
            if(x.getGiangVien().getMaGiangVien().equals(maGiangVien))
            {
                System.out.println(x);
            }
        }
        System.out.println("Tong: " + String.format("%.02f", mapLopHocPhan.get(maGiangVien)));
    }
}
//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01
