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
class Point {

    private double x;
    private double y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected double getX()
    {
        return this.x;
    }
    protected  double  getY()
    {
        return this.y;
    }

}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test -- > 0)
        {
              double x = sc.nextDouble();
              double y = sc.nextDouble();
              double z = sc.nextDouble();
              double t = sc.nextDouble();
              Point a = new Point(x , y);
              Point b = new Point(z, t);
              System.out.printf("%.4f", Math.sqrt(Math.pow(a.getX() - b.getX() , 2) + Math.pow(a.getY() - b.getY(), 2)));
              System.out.println("");
        }
    }
}
