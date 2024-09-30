/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J05033;

/**
 *
 * @author luong
 */
public class Time {
    private int gio;
    private int phut;
    private int giay;
    public Time(int gio , int phut , int giay)
    {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    }   
}
