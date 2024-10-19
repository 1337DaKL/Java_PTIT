/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.sapXepDonBanQuanAo;

/**
 *
 * @author luong
 */
public class SanPham {
    private String maLoai , tenSanPham ;
    private long donGialoai1 , donGiaLoai2;

    public SanPham(String maLoai, String tenSanPham, long donGialoai1, long donGiaLoai2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.donGialoai1 = donGialoai1;
        this.donGiaLoai2 = donGiaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public long getDonGialoai1() {
        return donGialoai1;
    }

    public long getDonGiaLoai2() {
        return donGiaLoai2;
    }
    
}
