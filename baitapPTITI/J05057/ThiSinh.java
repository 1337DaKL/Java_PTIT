/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05057;

/**
 *
 * @author luong
 */
public class ThiSinh {
    private String maThiSinh , tenThiSinh , trangThai ;
    private double diemToan , diemLi , diemHoa , diemUuTien , tongDiem , tongDiemXetTuyen;
    ThiSinh(String maThiSinh , String tenThiSinh , double diemToan , double diemLi , double diemHoa)
    {
        this.maThiSinh = maThiSinh ;
        this.tenThiSinh = tenThiSinh;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
        this.diemUuTien = Helper.tingDiemUuTien(maThiSinh);
        this.tongDiem = this.diemToan * 2 + this.diemHoa + this.diemLi;
        this.tongDiemXetTuyen = this.tongDiem + this.diemUuTien;
        this.trangThai = Helper.xetTrangThai(this.tongDiemXetTuyen);
    }

    @Override
    public String toString() {
        String ketQua = this.maThiSinh + " " + this. tenThiSinh;
        if((int)this.diemUuTien == this.diemUuTien) ketQua = ketQua + " " + (int)this.diemUuTien;
        else ketQua  = ketQua + " " + String.format("%.01f", this.diemUuTien);
        if((int)this.tongDiem == this.tongDiem) ketQua = ketQua  + " " + (int)this.tongDiem;
        else ketQua = ketQua + " " + String.format("%.01f", this.tongDiem);
        return ketQua + " " + this.trangThai;
    }
    
}
