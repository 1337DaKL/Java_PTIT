/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05025;

/**
 *
 * @author luong
 */
public class GiangVien implements Comparable<GiangVien>{
    private String maGiangVienString;
    private String boMonString;
    private String tenGiangVienString;
    public static String name(String s)
    {
        String[] a = s.trim().split("\\s+");
        String ss = "";
        for(int i = 0 ; i < a.length ; i++)
        {
            ss = ss + a[i].substring(0 , 1).toUpperCase();
        }
        return ss;
    }

    public String getTenGiangVienString() {
        return tenGiangVienString;
    }

    public String getMaGiangVienString() {
        return maGiangVienString;
    }

    public String getBoMonString() {
        return boMonString;
    }
    public GiangVien(int i , String ten , String mon)
    {
        this.maGiangVienString = "GV" + String.format("%02d", i);
        this.tenGiangVienString = ten;
        this.boMonString = name(mon);
    }

    @Override
    public String toString() {
        return this.maGiangVienString + " " + this.tenGiangVienString + " " + this.boMonString;
    }
    @Override
    public int compareTo( GiangVien b)
    {
        String[] arr = this.getTenGiangVienString().trim().split("\\s+");
        String[] brr = b.getTenGiangVienString().trim().split("\\s+");
        if(arr[arr.length - 1].compareTo(brr[brr.length - 1]) == 0) return this.getMaGiangVienString().compareTo(b.getMaGiangVienString());
        return arr[arr.length - 1].compareTo(brr[brr.length - 1]);
    }
}
