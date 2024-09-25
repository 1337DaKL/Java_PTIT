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
class Point
{
    private double x;
    private double y;
    protected Point(double x , double y)
    {
        this.x = x;
        this.y = y;
    }
    protected double khoangCach(Point b)
    {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}
public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0)
        {
            Point x = new Point(sc.nextDouble() , sc.nextDouble());
            Point y = new Point(sc.nextDouble() , sc.nextDouble());
            Point z = new Point(sc.nextDouble() , sc.nextDouble());
            double a = x.khoangCach(y);
            double b = x.khoangCach(z);
            double c = y.khoangCach(z);
            if(a + b <= c || a + c <= b || b + c <= a)
            {
                System.out.println("INVALID");
            }
            else
            {
                double s = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (- a + b + c)) / 4;
                double r = (a * b * c) / (4 * s);
                double sR = Math.PI * Math.pow(r , 2);
                System.out.println(String.format("%.03f", sR));
            }
        }
    }
}
