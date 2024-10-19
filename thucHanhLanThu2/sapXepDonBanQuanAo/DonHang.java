/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.sapXepDonBanQuanAo;

/**
 *
 * @author luong
 */
public class DonHang implements Comparable<DonHang>{
    private SanPham sanPham;
    private String maDOnHang;
    private long soLuongMua , soTienGiamGia , soTienPhaiTra , tongTien , donGia;
    public DonHang( int i , String maDonHang , long soLuongMua , SanPham sanPham)
    {
        this.sanPham = sanPham;
        this.maDOnHang = maDonHang + "-" + String.format("%03d", i);
        this.soLuongMua = soLuongMua;
        this.donGia = Helper.tinhDonGia(maDonHang, sanPham);
        this.tongTien = this.soLuongMua * this.donGia;
        this.soTienGiamGia = Helper.tinhTienGiamGia(soLuongMua, tongTien);
        this.soTienPhaiTra = this.tongTien - this.soTienGiamGia;
    }

    @Override
    public String toString() {
        return this.maDOnHang + " " + this.sanPham.getTenSanPham() + " " + this.soTienGiamGia + " " + this.soTienPhaiTra;
    }
    @Override
    public int compareTo(DonHang b)
    {
        return Long.compare(b.soTienPhaiTra, this.soTienPhaiTra);
    }
}
