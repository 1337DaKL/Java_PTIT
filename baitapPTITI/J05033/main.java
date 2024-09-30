/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05033;

/**
 *
 * @author luong
 */
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<Time> a = new ArrayList<>();
        for(int i = 0 ; i < test ; i++)
        {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Time tg = new Time(gio, phut, giay);
            a.add(tg);
        }
        Collections.sort(a , new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getGio() == o2.getGio())
                {
                    if(o1.getPhut() == o2.getPhut())
                    {
                        return o1.getGiay() - o2.getGiay();
                    }
                    return o1.getPhut() - o2.getPhut();
                }
                return o1.getGio() - o2.getGio();
            }
        });
        for(Time x : a)
        {
            System.out.println(x);
        }
    }
}
