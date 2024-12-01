/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daklp
 */
public class SinhVien implements Serializable{
    private String maSinhVien , tenSinhVien , lop;
    private Date ngaySinh;
    private double gpa;
    public SinhVien(int i , String tenSinhVien , String lop , String ngaySinh , double gpa) throws ParseException
    {
        this.maSinhVien = "B20DCCN" + String.format("%03d", i);
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = fm.parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.tenSinhVien + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.02f", this.gpa);
    }
    
}
