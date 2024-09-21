/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(st.empty()) st.push(s.charAt(i));
            else
            {
                if(st.peek() == s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        if(st.empty()) System.out.println("Empty String");
        else
        {
            String ss = "";
            while(!st.empty())
            {
                ss += st.pop();
            }
            StringBuilder sb = new StringBuilder(ss);
            System.out.println(sb.reverse());
        }
    }
}
