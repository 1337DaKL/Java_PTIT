/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07057;

/**
 *
 * @author luong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String hoVaTen , danToc  , maThiSinh , trangThai;
    private double khuVuc ,diemThi , diemUuTien , tongDiem;
    public ThiSinh(int ma ,String ten , double diemThi , String danToc , double khuVuc)
    {
        this.maThiSinh = "TS" + String.format("%02d", ma);
        this.hoVaTen = Helper.chuanHoa(ten);
        this.diemThi = diemThi;
        this.danToc = danToc ;
        this.khuVuc = khuVuc;       
        this.diemUuTien = Helper.tinhDiemUuTien(this.khuVuc, this.danToc);
        this.tongDiem = this.diemUuTien + this.diemThi;
        this.trangThai = Helper.trangThai(this.tongDiem);
    }

    @Override
    public String toString() {
        return this.maThiSinh + " " + this.hoVaTen + " " + String.format("%.01f", this.tongDiem) + " " + this.trangThai;
    }
    @Override
    public int compareTo(ThiSinh b)
    {
        if(this.tongDiem == b.tongDiem)
        {
            return this.maThiSinh.compareTo(b.maThiSinh);
        }
        if(this.tongDiem  > b.tongDiem) return -1;
        return 1;
    }
}
