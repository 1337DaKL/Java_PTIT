/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05073;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HangHoa> arr = new ArrayList<>();
        while(n -- > 0)
        {
            arr.add(new HangHoa(sc.next() , sc.nextDouble() , sc.nextLong()));
        }
        for(HangHoa x : arr)
        {
            System.out.println(x);
        }
    }
}
//2
//TTVC 400 300
//CCAK 200 200