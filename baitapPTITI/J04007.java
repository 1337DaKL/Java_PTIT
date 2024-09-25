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
class NhanVien{
    private String maNhanVien = "00001";
    private String hoVaTen ;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;
    protected NhanVien( String ten , String gt , String ns , String dc , String mst , String nkhd)
    {
        this.hoVaTen = ten;
        this.gioiTinh = gt;
        this.ngaySinh = ns;
        this.diaChi = dc;
        this.maSoThue = mst;
        this.ngayKiHopDong = nkhd;
    }

    @Override
    public String toString() {
        return this.maNhanVien + " " + this.hoVaTen + " " +this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.ngayKiHopDong;
    }
    
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a);
    }
}
