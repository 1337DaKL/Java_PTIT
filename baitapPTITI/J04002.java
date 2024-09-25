/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import  java.util.*;
class Rectange{
    private  double width;
    private double height;
    private String color;
    protected Rectange()
    {
        this.width = 1;
        this.height = 1;
    }
    protected  Rectange(double rong , double dai ,String mauSac)
    {
        this.width = rong;
        this.height = dai;
        this.color = mauSac;
    }
    protected double getWidth()
    {
        return this.width;
    }
    protected double getHeight()
    {
        return  this.height;
    }
    protected void setWidth(double width)
    {
        this.width = width;
    }
    protected  void setHeight(double height)
    {
        this.height = height;
    }
    protected String getColor()
    {
        return this.color;
    }
    protected void setColor(String color)
    {
        this.color = color;
    }
    protected double findArea()
    {
        return this.height * this.width;
    }
    protected double findPerimeter()
    {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        int rong = (int)this.width;
        int dai = (int)this.height;
        if(this.width <= 0 || this.height <= 0 || rong != this.width || dai != this.height) 
        {
            return "INVALID";
        }
        String chuanHoaString = (this.color).substring(0 , 1).toUpperCase() + (this.color).substring(1).toLowerCase();
        return (int)this.findPerimeter() + " " + (int)this.findArea() + " " + chuanHoaString;
    }
    
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rong = sc.nextDouble();
        double dai = sc.nextDouble();
        String mau = sc.next();
        Rectange hinhChuNhat = new Rectange(rong , dai , mau);
        System.out.println(hinhChuNhat);
    }
}
