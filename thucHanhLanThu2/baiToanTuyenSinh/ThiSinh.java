/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.baiToanTuyenSinh;

/**
 *
 * @author luong
 */
public class ThiSinh {
    private String maThiSinh , tenThiSinh , trangThai ;
    private double diemToan , diemLi , diemHoa , diemUuTien , tongDiem , diemChuan;

    public ThiSinh(String maThiSinh, String tenThiSinh, double diemToan, double diemLi, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
        this.diemUuTien = Helper.tinhDiemUuTien(maThiSinh);
        this.tongDiem = this.diemToan * 2 + this.diemLi + this.diemHoa ;
        this.diemChuan = this.tongDiem + this.diemUuTien;
        this.trangThai = Helper.xetTrangThai(diemChuan);
    }

    @Override
    public String toString() {
        String ketQua = this.maThiSinh + " " + this.tenThiSinh + " ";
        if(this.diemUuTien == (int)this.diemUuTien) ketQua += (int)diemUuTien;
        else ketQua += String.format("%.01f", this.diemUuTien);
        ketQua += " ";
        if(this.tongDiem == (int)this.tongDiem) ketQua += (int)this.tongDiem;
        else ketQua += String.format("%.01f", this.tongDiem);
        ketQua = ketQua + " " + this.trangThai;
        return ketQua;
    }
    
}
