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
    
    protected double distance(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while (test-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            
            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = c.distance(b);
            
            if (ab + bc <= ac || ab + ac <= bc || bc + ac <= ab) {
                System.out.println("INVALID");
            } else {
                System.out.println(String.format("%.3f", ab + ac + bc));
            }
        }
        sc.close();
    }
}

