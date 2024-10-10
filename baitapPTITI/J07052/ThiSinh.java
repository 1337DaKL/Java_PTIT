/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07052;

/**
 *
 * @author luong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maThiSinh , hoVaTen , trangThai;
    private double diemToan , diemLi , diemHoa , diemUuTien , diemTong , diemChuan;
    public ThiSinh(String ma , String ten , double toan , double li , double hoa)
    {
        this.maThiSinh = ma;
        this.hoVaTen = Heper.chuanHoaTen(ten);
        this.diemToan = toan;
        this.diemLi = li;
        this.diemHoa = hoa;
        this.diemTong = toan * 2 + li + hoa;
        this.diemUuTien = Heper.tinhDiemChuan(ma);
        this.diemChuan = this.diemTong + this.diemUuTien;
        
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        String ok;
        if((int)this.diemChuan == this.diemChuan) ok = (int)this.diemChuan + "";
        else ok = String.format("%.01f", this.diemChuan);
        String okk;
        if((int)this.diemUuTien == this.diemUuTien) okk = (int)this.diemUuTien + "";
        else okk = String.format("%.01f", this.diemUuTien);
        return this.maThiSinh + " " + this.hoVaTen  + okk + " " + ok + " " + this.trangThai;
    }

    public double getDiemChuan() {
        return diemChuan;
    }
    
    @Override
    public int compareTo(ThiSinh b) {
        if(this.diemChuan == b.diemChuan) {
            return this.maThiSinh.compareTo(b.maThiSinh);
        }
        return Double.compare(b.diemChuan, this.diemChuan);
    }

}
