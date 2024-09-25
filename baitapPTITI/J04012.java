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
class NhanVien
{
    private String maNhanVien;
    private String hoVaTen;
    private long luongCoBan;
    private long soNgayCong;
    private String chucVu;
    private long luongThang;
    private long tienThuong;
    private long tienPhuCap;
    private long thuNhap;
    protected NhanVien(String ten , long luong , long ngay , String chuc)
    {
        this.maNhanVien = "NV01";
        this.hoVaTen = ten;
        this.luongCoBan = luong;
        this.soNgayCong = ngay;
        this.chucVu = chuc;
        this.luongThang = ngay * luong;
        switch (chuc) {
            case "GD":
                this.tienPhuCap = 250000;
                break;
            case "PGD":
                this.tienPhuCap = 200000;
                break;
            case "TP":
                this.tienPhuCap = 180000;
                break;
            case "NV":
                this.tienPhuCap = 150000;
                break;
            default:
                throw new AssertionError();
        }
        if(ngay >= 25)
        {
            this.tienThuong = luong * ngay * 20 / 100;
        }
        else if(ngay >= 22 && ngay < 25)
        {
            this.tienThuong = luong * ngay * 10 / 100;
        }
        else
        {
            this.tienThuong = 0;
        }
        this.thuNhap = this.luongThang + this.tienPhuCap + this.tienThuong;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.hoVaTen + " " + this.luongThang + " " + this.tienThuong + " " + this.tienPhuCap + " " + this.thuNhap;
    }
    
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        long luong = sc.nextLong();
        long ngay = sc.nextLong();
        sc.nextLine();
        String chuc = sc.nextLine();
        NhanVien a = new NhanVien(ten, luong, ngay, chuc);
        System.out.println(a);
    }
}
