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
public class thuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++)
        {
            Integer x = sc.nextInt();
            if(st.empty()) st.push(x);
            else
            {
                if((x + st.peek()) % 2 == 0) st.pop();
                else
                {
                    st.push(x);
                }
            }
        }
        System.out.println(st.size());
    }
}
