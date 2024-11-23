/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06007;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String , MonHoc> mapMonHoc = new HashMap<>();
        while(n-- > 0)
        {
            MonHoc monHoc = new MonHoc(sc.next(), sc.nextLine().trim());
            mapMonHoc.put(monHoc.getMaMonHoc(), monHoc);
        }
        HashMap<String , GiaoVien> mapGiaoVien = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0)
        {
            GiaoVien giaoVien = new GiaoVien(sc.next(), sc.nextLine().trim());
            mapGiaoVien.put(giaoVien.getMaGiangVien(), giaoVien);
        }
        int q = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String , Double> map = new LinkedHashMap<>();
        while(q-- > 0)
        {
            lopHocPhan lopHocPhan1 = new lopHocPhan(mapGiaoVien.get(sc.next()), mapMonHoc.get(sc.next()), sc.nextDouble());
            if(map.containsKey(lopHocPhan1.getGiaoVien().getTenGiangVien()))
            {
                map.put(lopHocPhan1.getGiaoVien().getTenGiangVien(), map.get(lopHocPhan1.getGiaoVien().getTenGiangVien()) + lopHocPhan1.getGioChuan());
            }
            else{
                map.put(lopHocPhan1.getGiaoVien().getTenGiangVien(), lopHocPhan1.getGioChuan());
            }
        }
        Set<Map.Entry<String , Double>> entrys = map.entrySet();
        for(Map.Entry<String , Double> x : entrys)
        {
            System.out.println(x.getKey()+ " " + String.format("%.02f",x.getValue()));
        }
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

