/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhTranVanVu.thucTapCoSO;

/**
 *
 * @author luong
 */
public class DeTai {
    private String tenGianVien , tenDeTai , maDeTaiString;
    public DeTai(int i , String tenGiangVien , String tenDeTai)
    {
        this.maDeTaiString = "DT" + String.format("%03d", i);
        this.tenGianVien = tenGiangVien;
        this.tenDeTai = tenDeTai;
    }

    @Override
    public String toString() {
        return this.maDeTaiString + " "+ this.tenGianVien + " "+ this.tenDeTai;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public String getMaDeTaiString() {
        return maDeTaiString;
    }
    
    
}
