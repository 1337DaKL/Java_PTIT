/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05014;

/**
 *
 * @author daklp
 */
public class GiaoVien implements Comparable<GiaoVien>{
    private String maGiaoVien , tenGiaoVien , maXetTuyen , trangThai , monHoc;
    private double diemTinHoc , diemChuyenMon , diemUuTien , tongDiem;

    public GiaoVien(int i ,String tenGiaoVien, String maXetTuyen, double diemTinHoc, double diemChuyenMon) {
        this.maGiaoVien = "GV" + String.format("%02d", i);
        this.tenGiaoVien = tenGiaoVien;
        this.maXetTuyen = maXetTuyen;
        this.diemTinHoc = diemTinHoc;
        this.diemChuyenMon = diemChuyenMon;
        this.diemUuTien = Helper.tinhDiemUuTien(maXetTuyen);
        this.tongDiem = this.diemTinHoc * 2 + this.diemChuyenMon + this.diemUuTien;
        this.trangThai = Helper.xetTrungTuyen(tongDiem);
        this.monHoc = Helper.monHoc(this.maXetTuyen);
    }

    @Override
    public String toString() {
        return this.maGiaoVien + " " + this.tenGiaoVien + " " + this.monHoc + " " + String.format("%.01f", this.tongDiem) + " " + this.trangThai;
    }
    @Override
    public int compareTo(GiaoVien b)
    {
        return Double.compare(b.tongDiem, this.tongDiem);
    }
}
