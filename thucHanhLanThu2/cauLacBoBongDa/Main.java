/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.cauLacBoBongDa;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , CauLacBo> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
        {
            CauLacBo cauLacBo = new CauLacBo(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            map.put(cauLacBo.getMaCauLacBo(), cauLacBo);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau> arr = new ArrayList<>();
        while(m-- > 0)
        {
            String[] a = sc.nextLine().trim().split("\\s+");
            arr.add(new TranDau(map.get(a[0].substring(1 , 3)) ,a[0] , Long.parseLong(a[1])));
        }
        Collections.sort(arr);
        for(TranDau x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
