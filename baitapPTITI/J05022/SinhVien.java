/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05022;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maString;
    private String tenString;
    private String lopString;
    private String emString;
    public SinhVien(String ma , String ten , String lop , String em)
    {
        this.maString = ma;
        this.tenString = ten;
        this.lopString = lop;
        this.emString = em;
    }

    @Override
    public String toString() {
        return this.maString + " " + this.tenString + " " + this.lopString + " " + this.emString;
    }

    public String getLopString() {
        return lopString;
    }
    
}
