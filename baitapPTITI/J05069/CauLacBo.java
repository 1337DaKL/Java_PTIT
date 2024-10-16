/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05069;

/**
 *
 * @author luong
 */
public class CauLacBo {
    private String maCauLacBo , tenCauLacBo ;
    private long giaVe;

    public String getMaCauLacBo() {
        return maCauLacBo;
    }

    public String getTenCauLacBo() {
        return tenCauLacBo;
    }

    public long getGiaVe() {
        return giaVe;
    }
    public CauLacBo(String maCauLacBo , String tenCauLacBo , long giaVe)
    {
        this.maCauLacBo = maCauLacBo;
        this.tenCauLacBo = tenCauLacBo;
        this.giaVe = giaVe;
    }
}
