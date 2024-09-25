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
class GiaoVien{
    private String maNgach;
    private String tenString;
    private long luongCoBan;
    private long phuCap;
    private long tongThuNhap;
    private String viTri;
    private long heSoLuong;
    
    protected GiaoVien(String ma , String ten , long luong)
    {
        this.maNgach = ma;
        this.tenString = ten;
        this.luongCoBan = luong;
        this.viTri = ma.substring( 0 , 2);
        this.heSoLuong = Long.parseLong(ma.substring(2));
        switch (this.viTri) {
            case "HT":
                this.phuCap = 2000000;
                break;
            case "HP" :
                this.phuCap = 900000;
                break;
            case "GV" :
                this.phuCap = 500000;
                break;
            default:
                break;
        }
        this.tongThuNhap = this.luongCoBan * this.heSoLuong + this.phuCap;
    }

    @Override
    public String toString() {
        return this.maNgach + " " + this.tenString + " " + this.heSoLuong + " " + this.phuCap + " " + this.tongThuNhap;
    }
    
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(a);
    }
}
