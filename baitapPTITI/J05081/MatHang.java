/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05081;

/**
 *
 * @author luong
 */
public class MatHang {
    private String maString;
    private String tenString;
    private String donViString;
    private Long giaMuaLong;
    private Long giaBanLong;
    private Long loiNhuanLong;
    public MatHang(int ma , String ten , String dv , Long mua , Long ban)
    {
        this.maString = "MH" + String.format("%03d", ma);
        this.tenString = ten;
        this.donViString = dv;
        this.giaMuaLong = mua;
        this.giaBanLong = ban;
        this.loiNhuanLong = ban - mua;
    }

    public String getMaString() {
        return maString;
    }

    public Long getLoiNhuanLong() {
        return loiNhuanLong;
    }

    @Override
    public String toString() {
        return this.maString + " " + this.tenString + " " + this.donViString +" " + this.giaMuaLong + " " + this.giaBanLong + " " + this.loiNhuanLong;
    }
    
}
