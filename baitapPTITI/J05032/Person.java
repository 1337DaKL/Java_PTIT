/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05032;

/**
 *
 * @author luong
 */
public class Person implements Comparable<Person>{
    private String tenString;
    private int ngay;
    private int thang;
    private int nam;
    public Person(String ten , String ns)
    {
        this.tenString = ten;
        this.ngay = Integer.parseInt(ns.substring(0 , 2));
        this.thang = Integer.parseInt(ns.substring(3 , 5));
        this.nam = Integer.parseInt(ns.substring(6));
    }

    @Override
    public String toString() {
        return this.tenString;
    }
    @Override
    public int compareTo(Person b)
    {
        if(this.nam == b.nam)
        {
            if(this.thang == b.thang)
            {
                return this.ngay - b.ngay;
            }
            return this.thang - b.thang;
        }
        return this.nam - b.nam;
    }
}
