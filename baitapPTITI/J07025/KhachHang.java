/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07025;

/**
 *
 * @author daklp
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maKhachHang , tenKhachHang , ngaySinh , gioiTinh , diaChi;
    public KhachHang(int i , String tenKhachHang , String  gioiTinh ,String  ngaySinh , String diaChi)
    {
        this.maKhachHang = "KH" + String.format("%03d", i);
        this.tenKhachHang = Helper.chuanHoaTen(tenKhachHang);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = Helper.chuanHoaNgaySinh(ngaySinh);
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return this.maKhachHang + " " + this.tenKhachHang + " " + this.gioiTinh + " " + this.diaChi + " " + this.ngaySinh;
    }
    @Override
    public int compareTo(KhachHang b)
    {
        String ngaya = this.ngaySinh.substring(0 , 2);
        String thanga = this.ngaySinh.substring(3 , 5);
        String nama = this.ngaySinh.substring(6 , 10);
        String ngayb = b.ngaySinh.substring(0 , 2);
        String thangb = b.ngaySinh.substring(3 , 5);
        String namb = b.ngaySinh.substring(6 , 10);
        if(nama.equals(namb))
        {
            if(thanga.equals(thangb))
            {
                return ngaya.compareTo(ngayb);
            }
            return thanga.compareTo(thangb);
        }
        return nama.compareTo(namb);
    }
}
