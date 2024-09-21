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
public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0)
        {
            String s = sc.next();
            int cnt = 0;
            for(int i = 0 ; i < s.length() ; i++)
            {
                char x = s.charAt(i);
                if(x == 'I')
                {
                    if((i + 1 < s.length()) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                    {
                        cnt -= 1;
                    }
                    else
                    {
                        cnt += 1;
                    }
                }
                else if(x == 'X')
                {
                    if((i + 1 < s.length()) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                    {
                        cnt -= 10;
                    }
                    else
                    {
                        cnt += 10;
                    }
                }
                else if(x == 'C')
                {
                    if((i + 1 < s.length()) && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                    {
                        cnt -= 100;
                    }
                    else
                    {
                        cnt += 100;
                    }
                }
                else if(x == 'L')
                {
                    cnt += 50;
                }
                else if(x == 'V') cnt += 5;
                else if(x == 'D') cnt += 500;
                else cnt += 1000;
            }
            System.out.println(cnt);
        }
    }
}
