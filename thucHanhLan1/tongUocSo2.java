/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLan1;

/**
 *
 * @author luong
 */
import java.util.*;
public class tongUocSo2 {
    public static int tong(int n)
    {
        int cnt = 1;
        for(int i = 2 ;i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                if(i * i == n)
                {
                    cnt += i;
                }
                else
                {
                    cnt += i;
                    cnt += (n / i);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt() , b = sc.nextInt();
        int dem = 0;
        for(int i = a ; i <= b ; i++)
        {
            if(tong(i) > i) dem++;
        }
        System.out.println(dem);
    }
}
