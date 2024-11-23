/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07059;

/**
 *
 * @author daklp
 */
public class CaThi implements Comparable<CaThi>{
    private String maCaThi , ngayThi , gioThi , phongThi;

    public CaThi(int i , String ngayThi, String gioThi, String phongThi) {
        this.maCaThi = "C" + String.format("%03d", i);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    @Override
    public String toString() {
        return this.maCaThi + " " + this.ngayThi + " " + this.gioThi + " " + this.phongThi;
    }
    @Override
    public int compareTo(CaThi b)
    {
        int ngaya = Integer.parseInt(this.ngayThi.substring(0 , 2));
        int thanga = Integer.parseInt(this.ngayThi.substring(3 , 5));
        int nama = Integer.parseInt(this.ngayThi.substring(6 , 10));
        int gioa = Integer.parseInt(this.gioThi.substring(0 , 2));
        int phuta = Integer.parseInt(this.gioThi.substring(3 , 5));
        int ngayb = Integer.parseInt(b.ngayThi.substring(0 , 2));
        int thangb = Integer.parseInt(b.ngayThi.substring(3 , 5));
        int namb = Integer.parseInt(b.ngayThi.substring(6 , 10));
        int giob = Integer.parseInt(b.gioThi.substring(0 , 2));
        int phutb = Integer.parseInt(b.gioThi.substring(3 , 5));
        if(nama == namb)
        {
            if(thanga == thangb)
            {
                if(ngaya == ngayb)
                {
                    if(gioa == giob)
                    {
                        if(phuta == phutb)
                        {
                            return this.maCaThi.compareTo(b.maCaThi);
                        }
                        return phuta - phutb;
                    }
                    return gioa - giob;
                }
                return ngaya - ngayb;
            }
            return thanga - thangb;
        }
        return nama - namb;
    }
}
