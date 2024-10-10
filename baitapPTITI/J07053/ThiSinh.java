/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07053;

/**
 *
 * @author luong
 */
public class ThiSinh {
    private String tenThiSinh , ngaySinh  , xepLoai , maThiSinh ;
    private double diemLiThuyet , diemThucHanh , diemThuong , diemTrungBinh;
    public int tuoiThiSinh;
    public ThiSinh(int dem ,String ten , String ngaySinh , double diemLyThuyet , double diemThucHanh)
    {
        this.maThiSinh = "PH" + String.format("%02d", dem);
        this.tenThiSinh = Helper.chuanHoaTen(ten);
        this.ngaySinh = Helper.chuanHoaNgaySinh(ngaySinh);
        this.diemLiThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemThuong = Helper.tinhDiemThuong(diemLiThuyet, diemThucHanh);
        this.diemTrungBinh = Math.round((this.diemLiThuyet + this.diemThucHanh) / 2 + diemThuong);
        if(this.diemTrungBinh > 10) this.diemTrungBinh = 10;
        this.xepLoai = Helper.xepLoai(this.diemTrungBinh);
        this.tuoiThiSinh = Helper.tinhTuoi(this.ngaySinh);
    }

    @Override
    public String toString() {
        return this.maThiSinh + " " + this.tenThiSinh + " "+ this.tuoiThiSinh + " " + (int)this.diemTrungBinh + " " + this.xepLoai;
    }
    
}
