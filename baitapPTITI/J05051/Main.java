/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05051;

/**
 *
 * @author luong
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> arrayList= new ArrayList<>();
        int n= Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= n ; i++)
        {
            arrayList.add(new KhachHang(i , sc.nextLine() , Double.parseDouble(sc.nextLine()) , Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arrayList);
        for(KhachHang x : arrayList)
        {
            System.out.println(x);
        }
    }
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700
