/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07060;

/**
 *
 * @author daklp
 */
public class CaThi {
    private String ngayThi , gioThi , idPhongThi , maCaThi;

    public CaThi(String ngayThi, String gioThi, String idPhongThi , int i) {
        this.maCaThi = "C" + String.format("%03d", i);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.idPhongThi = idPhongThi;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public CaThi() {
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getIdPhongThi() {
        return idPhongThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public void setGioThi(String gioThi) {
        this.gioThi = gioThi;
    }

    public void setIdPhongThi(String idPhongThi) {
        this.idPhongThi = idPhongThi;
    }
    
}
