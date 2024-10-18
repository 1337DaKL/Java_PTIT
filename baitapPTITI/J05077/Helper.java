/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05077;

/**
 *
 * @author luong
 */
public class Helper {
    public static long tinhHeSoNhan(String maNhanVien)
    {
        String nhom = maNhanVien.substring(0 , 1);
        int soNamCongTac = Integer.parseInt(maNhanVien.substring(1 , 3));
        if(nhom.equals("A"))
        {
            if(soNamCongTac >= 1 && soNamCongTac <= 3) return 10;
            if(soNamCongTac >= 4 && soNamCongTac <= 8) return 12;
            if(soNamCongTac >= 9 && soNamCongTac <= 15) return 14;
            return 20;
        }
        if(nhom.equals("B"))
        {
            if(soNamCongTac >= 1 && soNamCongTac <= 3) return 10;
            if(soNamCongTac >= 4 && soNamCongTac <= 8) return 11;
            if(soNamCongTac >= 9 && soNamCongTac <= 15) return 13;
            return 16;
        }
        if(nhom.equals("C"))
        {
            if(soNamCongTac >= 1 && soNamCongTac <= 3) return 9;
            if(soNamCongTac >= 4 && soNamCongTac <= 8) return 10;
            if(soNamCongTac >= 9 && soNamCongTac <= 15) return 12;
            return 14;
        }
        if(soNamCongTac >= 1 && soNamCongTac <= 3) return 8;
        if(soNamCongTac >= 4 && soNamCongTac <= 8) return 9;
        if(soNamCongTac >= 9 && soNamCongTac <= 15) return 11;
        return 13;
    }
}
