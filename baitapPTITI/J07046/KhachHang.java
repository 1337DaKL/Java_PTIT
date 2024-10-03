/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07046;

/**
 *
 * @author luong
 */
public class KhachHang implements Comparable<KhachHang>{
    private  String maKhachHangString;
    private String hoVaTenString;
    private String maPhongString;
    private String ngayDenString;
    private String ngayDiString;
    private int ngayLuuTru;
    public static int tinhSoNgayLuuTru(String den , String di)
    {
        int denI = Integer.parseInt(den.substring(0 , 2)) + Integer.parseInt(den.substring(3 , 5)) * 30;
        int diI = Integer.parseInt(di.substring(0 , 2)) + Integer.parseInt(di.substring(3 , 5)) * 30;
        return diI - denI;
    }
    public KhachHang(int i , String ten , String ma , String den , String di)
    {
        this.maKhachHangString = "KH" + String.format("%02d", i);
        this.hoVaTenString = ten;
        this.maPhongString = ma;
        this.ngayDenString = den;
        this.ngayDiString = di;
        this.ngayLuuTru = tinhSoNgayLuuTru(den, di);
    }

    @Override
    public String toString() {
        return this.maKhachHangString + " " + this.hoVaTenString + " " + this.maPhongString + " " + this.ngayLuuTru;
    }
    @Override
    public int compareTo(KhachHang b)
    {
        return b.ngayLuuTru - this.ngayLuuTru;
    }
    
}
