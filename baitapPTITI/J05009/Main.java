/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05009;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        double maxo = Double.MIN_VALUE;
        for(int i = 1 ; i <= n ; i++)
        {
            ThiSinh x = new ThiSinh(i , sc.nextLine() , sc.nextLine() , Double.parseDouble(sc.nextLine()) ,Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine()) );
            maxo = Math.max(maxo, x.getDiemTong());
            a.add(x);
        }
        for(ThiSinh it : a)
        {
            if(it.getDiemTong() == maxo)
            {
                System.out.println(it);
            }
        }
    }
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5
