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
    protected Point(Scanner sc)
    {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    protected  static  Point nextPoint(Scanner sc )
    {
        Point x = new Point(sc);
        return x;
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
class Triangle
{
    private Point aPoint;
    private Point bPoint;
    private Point cPoint;
    protected Triangle(Point a ,Point b , Point c )
    {
        this.aPoint = a;
        this.bPoint = b;
        this.cPoint = c;
    }
    protected boolean valid()
    {
        double ab = Math.sqrt(Math.pow(aPoint.getX() - bPoint.getX(), 2) + Math.pow(aPoint.getY() - bPoint.getY(), 2));
        double ac = Math.sqrt(Math.pow(aPoint.getX() - cPoint.getX(), 2) + Math.pow(aPoint.getY() - cPoint.getY(), 2));
        double bc = Math.sqrt(Math.pow(bPoint.getX() - cPoint.getX(), 2) + Math.pow(bPoint.getY() - cPoint.getY(), 2));
        if(ab + ac <= bc || ab + bc <= ac || ac + bc <= ab) return false;
        else return true;
    }
    protected String getPerimeter()
    {
        double ab = Math.sqrt(Math.pow(aPoint.getX() - bPoint.getX(), 2) + Math.pow(aPoint.getY() - bPoint.getY(), 2));
        double ac = Math.sqrt(Math.pow(aPoint.getX() - cPoint.getX(), 2) + Math.pow(aPoint.getY() - cPoint.getY(), 2));
        double bc = Math.sqrt(Math.pow(bPoint.getX() - cPoint.getX(), 2) + Math.pow(bPoint.getY() - cPoint.getY(), 2));
        return String.format("%.03f", (ab + ac + bc));
    }
}

public class J04019 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- >0){
                Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
                if(!a.valid()){
                    System.out.println("INVALID");
                } else{
                    System.out.println(a.getPerimeter());
                }
            }
        } 
}
