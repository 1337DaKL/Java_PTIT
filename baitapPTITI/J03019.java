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
public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //Cách 1
//        Stack<Character> st = new Stack<>();
//        for(int i = 0 ; i < s.length() - 1 ; i++)
//        {
//            if(st.empty()) st.push(s.charAt(i));
//            else
//            {
//                if(st.peek() < s.charAt(i))
//                {
//                    while(!st.empty() && st.peek() < s.charAt(i)) st.pop();
//                    st.push(s.charAt(i));
//                }
//                else   st.push(s.charAt(i));
//                
//            }
//        }
//        st.push(s.charAt(s.length() - 1));
//        String ss = "";
//        while(!st.empty()) ss += st.pop();
//        StringBuilder sb = new StringBuilder(ss);
//        System.out.println(sb.reverse().toString());
//    }
//Cách 2
        int pos = 0;
        while(pos < s.length())
        {
            char max = s.charAt(pos);
            for(int i = pos + 1 ; i < s.length() ; i++)
            {
                if(max < s.charAt(i)) max = s.charAt(i);
            }
            int pos_last = 0;
            for(int i = pos ; i < s.length() ; i++)
            {
                if(max == s.charAt(i))
                {
                    System.out.print(max);
                    pos_last = i;
                }
            }
            pos = pos_last + 1;
        }
    }
}
