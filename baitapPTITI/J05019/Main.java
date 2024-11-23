/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05019;

/**
 *
 * @author daklp
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = Integer.parseInt(sc.nextLine());
        Map<String , TramDo> map = new LinkedHashMap<>();
        int cnt = 1;
        while(n-- > 0)
        {
            TramDo x = new TramDo(cnt, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            if(map.containsKey(x.getTenTram()))
            {
                TramDo mapx = map.get(x.getTenTram());
                mapx.setTongSoPhut(mapx.getTongSoPhut() + x.getTongSoPhut());
                mapx.setLuongMuaDoDuoc(mapx.getLuongMuaDoDuoc() + x.getLuongMuaDoDuoc());
                map.put(x.getTenTram(), mapx);
            }
            else
            {
                cnt ++;
                map.put(x.getTenTram(), x);
            }
        }
        Set<Map.Entry<String , TramDo>> entrys = map.entrySet();
        for(Map.Entry<String , TramDo> x : entrys)
        {
            System.out.println(x.getValue());
        }
    }
}
//10
//Dong Anh
//07:30
//08:00
//60
//Cau Giay
//07:45
//08:12
//50
//Soc Son
//08:00
//09:15
//78
//Dong Anh
//18:50
//20:00
//88
//Cau Giay
//19:01
//20:00
//77
//Soc Son
//19:06
//20:21
//66
//Dong Anh
//21:00
//21:40
//49
//Cau Giay
//21:50
//22:20
//68
//Dong Anh
//22:15
//23:45
//30
//Cau Giay
//22:50
//23:45
//35
