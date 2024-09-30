/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05006;

/**
 *
 * @author luong
 */
public class NhanVien {
    private String maNhanVienString;
    private String hoVaTenString;
    private String gioTinhString;
    private String ngaySinhString;
    private String diaChiString;
    private String maSoThueString;
    private String ngayKiHopDongString;
    public NhanVien(int i , String ten , String gt , String ns , String dc , String ma , String nk)
    {
        this.maNhanVienString = String.format("%05d", i);
        this.hoVaTenString = ten;
        this.gioTinhString = gt;
        this.ngaySinhString = ns;
        this.diaChiString = dc;
        this.maSoThueString = ma;
        this.ngayKiHopDongString = nk;
    }

    @Override
    public String toString() {
        return this.maNhanVienString + " " + this.hoVaTenString + " " + this.gioTinhString + " " + this.ngaySinhString + " " + this.diaChiString + " " + this.maSoThueString + " " + this.ngayKiHopDongString;
    }
    
}
