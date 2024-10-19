/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLanThu2.lopWordset;

import java.util.TreeSet;

/**
 *
 * @author luong
 */
public class Helper {
    public static TreeSet<String> tinhDoiTuong(String s)
    {
        TreeSet<String> ketQua = new TreeSet<>();
        String[] arrstr = s.trim().split("\\s+");
        for(String x : arrstr)
        {
            ketQua.add(x.toLowerCase());
        }
        return ketQua;
    }
}
