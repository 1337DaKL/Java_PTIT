/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05076;

/**
 *
 * @author luong
 */
public class MatHang {
    private String maMatHang , tenMatHang , xepLoai;

    public MatHang(String maMatHang, String tenMatHang, String xepLoai) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.xepLoai = xepLoai;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenMatHang ; 
    }
    
}
