/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05024;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maString;
    private String teString;
    private String lopString;
    private String emailString;
    private String nganhString;
    public SinhVien(String ma , String ten , String lop , String email)
    {
        this.maString = ma;
        this.teString = ten;
        this.lopString = lop;
        this.emailString = email;
        if(ma.substring(3 , 7).equals("DCKT"))
        {
            this.nganhString = "KE TOAN";
        }
        else if(ma.substring(3 , 7).equals("DCCN"))
        {
            this.nganhString = "CONG NGHE THONG TIN";
        }
        else if(ma.substring(3 , 7).equals("DCAT"))
        {
            this.nganhString = "AN TOAN THONG TIN";
        }
        else if(ma.substring(3 , 7).equals("DCVT"))
        {
            this.nganhString = "VIEN THONG";
        }
        else 
        {
            this.nganhString = "DIEN TU";
        }
    }

    @Override
    public String toString() {
        return this.maString + " " + this.teString + " " + this.lopString + " " + this.emailString ;
    }

    public String getNganhString() {
        return this.nganhString;
    }

    public String getLopString() {
        return lopString;
    }
    
    
}
