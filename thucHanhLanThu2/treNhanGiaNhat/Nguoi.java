/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.treNhanGiaNhat;

/**
 *
 * @author luong
 */
public class Nguoi implements Comparable<Nguoi>{
    public String ten , ngaySinh;

    public Nguoi(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return this.ten;
    }
    @Override
    public int compareTo(Nguoi b)
    {
        int ngaya = Integer.parseInt(this.ngaySinh.substring(0 , 2));
        int thanga = Integer.parseInt(this.ngaySinh.substring(3 , 5));
        int nama = Integer.parseInt(this.ngaySinh.substring(6));
        int ngayb = Integer.parseInt(b.ngaySinh.substring(0 , 2));
        int thangb = Integer.parseInt(b.ngaySinh.substring(3 , 5));
        int namb = Integer.parseInt(b.ngaySinh.substring(6));
        if(nama == namb)
        {
            if(thanga == thangb)
            {
                return ngaya - ngayb;
            }
            return thanga - thangb;
        }
        return nama - namb;
    }
}
