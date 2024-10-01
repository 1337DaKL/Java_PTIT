/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05011;

/**
 *
 * @author luong
 */
public class NguoiChoi {
    private String maNguoiChoiString;
    private String tenNguoiChoiString;
    private String gioVaoString;
    private String giaRaString;
    private int thoiGianCHoi;
    public NguoiChoi(String ma , String ten , String vao , String ra)
    {
        this.maNguoiChoiString = ma;
        this.tenNguoiChoiString = ten;
        this.gioVaoString = vao;
        this.giaRaString = ra;
        this.thoiGianCHoi = ((Integer.parseInt(ra.substring(0 ,2)) * 60 + Integer.parseInt(ra.substring(3))) - (Integer.parseInt(vao.substring(0 ,2)) * 60 + Integer.parseInt(vao.substring(3))));
    }

    @Override
    public String toString() {
        return this.maNguoiChoiString + " " + this.tenNguoiChoiString + " " + (this.thoiGianCHoi / 60) + " gio " + (this.thoiGianCHoi % 60) + " phut";
    }

    public int getThoiGianCHoi() {
        return thoiGianCHoi;
    }
    
}
