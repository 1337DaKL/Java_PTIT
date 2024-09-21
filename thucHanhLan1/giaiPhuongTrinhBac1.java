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
public class giaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat(), y = sc.nextFloat();
        if(x == 0 && y != 0)
        {
            System.out.println("VN");
        }
        else if((x == 0 && y == 0)) System.out.println("VSN");
        else
        {
            System.out.printf("%.2f" , -y/x);
        }
    }
}
