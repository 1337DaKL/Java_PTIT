/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J06003;

/**
 *
 * @author daklp
 */
public class Nhom {
    private int nhom;
    private String chuDe;

    public Nhom(int nhom, String chuDe) {
        this.nhom = nhom;
        this.chuDe = chuDe;
    }

    @Override
    public String toString() {
        return "Bai tap dang ky: " + this.chuDe;
    }
    
}
