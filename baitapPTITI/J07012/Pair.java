/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Java_PTIT.baitapPTITI.J07012;

/**
 *
 * @author daklp
 */
public class Pair implements Comparable<Pair>{
    private String first;
    private int second;
    public Pair(String first , int second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }
    @Override
    public int compareTo(Pair b)
    {
        if(this.second == b.second)
        {
            return this.first.compareTo(b.first);
        }
        return b.second - this.second;
    }

    public String getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
