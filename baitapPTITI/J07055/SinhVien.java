/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07055;

/**
 *
 * @author luong
 */
public class SinhVien implements Comparable<SinhVien> {
    private String hoVaTen , xepLoai , maSinhVien ;
    private double diemLuyenTap , diemThucHanh , diemThi , diemTrungBinh;
    public SinhVien(int ma , String ten , double diemLuyenTap , double diemThucHanh , double diemThi)
    {
        this.maSinhVien = "SV" + String.format("%02d", ma);
        this.hoVaTen = Helper.chuanHoa(ten);
        this.diemLuyenTap = diemLuyenTap;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
        this.diemTrungBinh = this.diemLuyenTap / 4 + this.diemThucHanh * 35 / 100 + this.diemThi * 40 / 100;
        this.xepLoai = Helper.xepLoai(this.diemTrungBinh);
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoVaTen + " " + String.format("%.02f", this.diemTrungBinh) + " " + this.xepLoai;
    }
    @Override
    public int compareTo(SinhVien b)
    {
        return Double.compare(b.diemTrungBinh, this.diemTrungBinh);
    }
}
