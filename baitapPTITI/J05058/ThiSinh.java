/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05058;

/**
 *
 * @author luong
 */
public class ThiSinh  implements Comparable<ThiSinh>{
    private String maThiSinh , tenThiSinh , trangThai;
    private double diemToan , diemLi , diemHoa , diemUuTien , tongDiem ;
    public ThiSinh(String maThiSinh , String tenThiSinh , double  diemToan , double  diemLi , double diemHoa)
    {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.diemHoa = diemHoa;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemUuTien = Helper.tinhDiemUuTien(maThiSinh);
        this.tongDiem = this.diemToan * 2 + diemLi + diemHoa + diemUuTien;
        this.trangThai = Helper.trangThaiXetTuyen(tongDiem);
    }

    @Override
    public String toString() {
        String ketQua = this.maThiSinh + " " + this.tenThiSinh + " ";
        if((int)this.diemUuTien == this.diemUuTien) ketQua += (int)diemUuTien;
        else ketQua += String.format("%.01f", this.diemUuTien);
        ketQua += " ";
        if((int)this.tongDiem == this.tongDiem) ketQua += (int)this.tongDiem;
        else ketQua += String.format("%.01f", this.tongDiem);
        return ketQua + " " + this.trangThai;
    }
    @Override 
    public int compareTo(ThiSinh b)
    {
        if(this.tongDiem == b.tongDiem) 
        {
            return this.maThiSinh.compareTo(b.maThiSinh);
        }
        return Double.compare(b.tongDiem, this.tongDiem);
    }
}
