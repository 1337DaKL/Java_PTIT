/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05072;

/**
 *
 * @author luong
 */
public class TinhThanh {
    private String maVung , tenTinh ;
    private long giaCuoc;
    public TinhThanh(String maVung , String tenTinh , long giaCuoc)
    {
        this.maVung = maVung;
        this.tenTinh = tenTinh;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public long getGiaCuoc() {
        return giaCuoc;
    }
    
}
