/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05061;

/**
 *
 * @author luong
 */
public class PhuHo implements Comparable<PhuHo>{
    private String tenPhuHo , ngaySinh , maThiTuyen  , xepLoai ;
    private double diemLiThuyet , diemThucHanh , diemTrungBinh , diemThuong;
    private int tuoi;
    public PhuHo(int i  ,String tenPhuHo , String ngaySinh , double  diemLiThuyet , double diemThucHanh)
    {
        this.tenPhuHo = tenPhuHo;
        this.ngaySinh = ngaySinh;
        this.diemLiThuyet = diemLiThuyet;
        this.diemThucHanh = diemThucHanh;
        this.maThiTuyen = "PH" + String.format("%02d", i);
        this.tuoi = Hepler.tinhTuoi(ngaySinh);
        this.diemThuong = Hepler.tinhDiemThuong(diemLiThuyet, diemThucHanh);
        this.diemTrungBinh = Hepler.tinhDiemTrungBinh(diemLiThuyet, diemThucHanh, diemThuong);
        this.xepLoai = Hepler.xepLoai(diemTrungBinh);
    }

    @Override
    public String toString() {
        return this.maThiTuyen + " " + tenPhuHo + " " + this.tuoi + " " + (int)this.diemTrungBinh + " " + this.xepLoai;

    }
    @Override
    public int compareTo(PhuHo b)
    {
        if(this.diemTrungBinh == b.diemTrungBinh)
        {
            return this.maThiTuyen.compareTo(b.maThiTuyen);
        }
        return Double.compare(b.diemTrungBinh, this.diemTrungBinh);
    }
}
