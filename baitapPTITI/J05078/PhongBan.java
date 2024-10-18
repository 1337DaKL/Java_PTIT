/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05078;

/**
 *
 * @author luong
 */
public class PhongBan {
    private String maPhong , tenPhong;
    public PhongBan(String thongTinPhong)
    {
        this.maPhong = Helper.layMaPhong(thongTinPhong);
        this.tenPhong = Helper.layTenPhong(thongTinPhong);
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
    
}
