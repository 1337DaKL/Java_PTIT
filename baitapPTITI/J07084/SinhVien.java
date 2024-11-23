/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author daklp
 */
public class SinhVien implements Comparable<SinhVien>{
    private String tenSinhVien;
    private Date thoiGianBatDau , thoiGianKetThuc;
    private long phutOnline;
    public SinhVien(String tenSinhVien , String thoiGianBatDau , String thoiGianKetThuc) throws ParseException
    {
        this.tenSinhVien = tenSinhVien;
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.thoiGianBatDau = fm.parse(thoiGianBatDau);
        this.thoiGianKetThuc = fm.parse(thoiGianKetThuc);
        this.phutOnline = TimeUnit.MILLISECONDS.toMinutes(this.thoiGianKetThuc.getTime() - this.thoiGianBatDau.getTime());
    }

    @Override
    public String toString() {
        return this.tenSinhVien + " " + this.phutOnline;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return (int)(b.phutOnline - this.phutOnline);
    }
}
