/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI;

/**
 *
 * @author luong
 */
import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String inforString;
    protected LoaiPhong(String in4)
    {
        this.inforString = in4;
    }
    private String getTenPhong()
    {
        String[] a = this.inforString.trim().split("\\s+");
        return a[1];
    }
    @Override
    public int compareTo(LoaiPhong b)
    {
        return this.getTenPhong().compareTo(b.getTenPhong());
    }
    @Override
    public String toString() {
        return this.inforString;
    }
    
}
public class J07045 {
    public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("input.txt"));
            int n = Integer.parseInt(in.nextLine());
            while(n-->0){
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for(LoaiPhong tmp : ds){
                System.out.println(tmp);
            }
        }
}
