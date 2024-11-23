/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07071;

/**
 *
 * @author daklp
 */
public class Ten implements Comparable<Ten>{
    private String ten;

    public Ten(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return this.ten;
    }
    @Override
    public int compareTo(Ten b)
    {
        String[] tena = this.ten.trim().split("\\s+");
        String[] tenb = b.ten.trim().split("\\s+");
        if(tena[tena.length - 1].equals(tenb[tenb.length - 1]))
        {
            return tena[0].compareTo(tenb[0]);
        }
        return tena[tena.length - 1].compareTo(tenb[tenb.length - 1]);
    }

    public String getTen() {
        return ten;
    }
}
