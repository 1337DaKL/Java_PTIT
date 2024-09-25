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
class SinhVien{
    private String ten;
    private String lop;
    private String ngaySinhString;
    private double gpa;
    protected SinhVien(String name , String lop , String brith , double diem)
    {
        this.ten = name;
        this.lop = lop;
        this.ngaySinhString = brith;
        this.gpa = diem;
    }
    private String chuanHoaNgaySinh(String s)
    {
        if(s.charAt(2) != '/') s = "0" + s;
        if(s.charAt(5) != '/') 
        {
            StringBuilder ss = new StringBuilder(s);
            ss.insert(3, "0");
            s = ss.toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return "B20DCCN001 " + this.ten + " " + this.lop + " " + chuanHoaNgaySinh(this.ngaySinhString) + " " + String.format("%.02f", this.gpa);
    }
    
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println(a);
    }
}
