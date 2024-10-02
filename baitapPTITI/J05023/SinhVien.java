/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05023;

/**
 *
 * @author luong
 */
public class SinhVien {
    private String maString;
    private String tenString;
    private String lopString;
    private String emailString;
    public SinhVien(String ma , String ten , String lop , String email)
    {
        this.maString = ma;
        this.tenString = ten;
        this.lopString = lop;
        this.emailString = email;
    }

    public String getLopString() {
        return lopString;
    }

    @Override
    public String toString() {
        return this.maString + " " + this.tenString + " " + this.lopString + " " + this.emailString;
    }
    
}
