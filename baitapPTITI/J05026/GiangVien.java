/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05026;

/**
 *
 * @author luong
 */
public class GiangVien {
    private String maGiangVienString;
    private String tenGiangVienString;
    private String boMonString;
    private String chuanHoa(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "" ;
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase();
        }
        return ss;
    }
    public GiangVien(int i , String ten , String mon)
    {
        this.maGiangVienString = "GV" + String.format("%02d", i);
        this.tenGiangVienString = ten;
        this.boMonString = chuanHoa(mon);
    }

    @Override
    public String toString() {
        return this.maGiangVienString + " " + this.tenGiangVienString + " " + this.boMonString;
    }

    public String getBoMonString() {
        return boMonString;
    }
    public String getChuanHoa(String s)
    {
        return chuanHoa(s);
    }
}
