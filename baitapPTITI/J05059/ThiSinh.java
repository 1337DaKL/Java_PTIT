/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J05059;

/**
 *
 * @author daklp
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maThiSinh , tenThiSinh , trangThai ;
    private double diemToan , diemLy , diemHoa , diemUuTien , diemXetTuyen;

    public ThiSinh(String maThiSinh, String tenThiSinh, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.tenThiSinh = tenThiSinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemUuTien = Helper.tinhDiemUuTien(maThiSinh);
        this.diemXetTuyen = this.diemHoa + this.diemToan * 2 + this.diemLy + this.diemUuTien;
    }

    @Override
    public String toString() {
        String output = this.maThiSinh + " " + this.tenThiSinh + " " ;
        if(this.diemUuTien == (long)this.diemUuTien)
        {
            output += (long)this.diemUuTien;
        }
        else
        {
            output += String.format("%.01f", this.diemUuTien);
        }
        output += " ";
        if(this.diemXetTuyen == (long)this.diemXetTuyen)
        {
            output += (long)this.diemXetTuyen;
        }
        else
        {
            output += String.format("%.01f", this.diemXetTuyen);
        }
        return output + " " + this.trangThai;
    }

    public void setMaThiSinh(String maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setDiemUuTien(double diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public void setDiemXetTuyen(double diemXetTuyen) {
        this.diemXetTuyen = diemXetTuyen;
    }

    public String getMaThiSinh() {
        return maThiSinh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public double getDiemUuTien() {
        return diemUuTien;
    }

    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }
    @Override
    public int compareTo(ThiSinh b)
    {
        if(b.diemXetTuyen == this.diemXetTuyen)
        {
            return this.maThiSinh.compareTo(b.maThiSinh);
        }
        return Double.compare(b.diemXetTuyen, this.diemXetTuyen);
    }
}
