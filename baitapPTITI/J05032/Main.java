/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05032;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0)
        {
            String [] a = sc.nextLine().trim().split("\\s+");
            arr.add(new Person(a[0] , a[1]));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(arr.get(0));
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
