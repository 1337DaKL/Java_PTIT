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
class MonHoc{
    private String maMonHocString;
    private String tenMonHocString;
    private long soTinChi;
    protected MonHoc(String ma , String ten , long tin)
    {
        this.maMonHocString = ma;
        this.tenMonHocString = ten;
        this.soTinChi = tin;
    }
    protected String getNam()
    {
        return this.tenMonHocString;
    }
    @Override
    public String toString() {
        return this.maMonHocString + " " + this.tenMonHocString + " " + this.soTinChi;
    }
    
}
public class J07034 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int test = sc.nextInt();
        sc.nextLine();
        TreeMap<String , MonHoc> map = new TreeMap<>();
        while(test-- > 0)
        {
            String ma = sc.nextLine();
            String mon = sc.nextLine();
            long tin = sc.nextLong();
            sc.nextLine();
            MonHoc a = new MonHoc(ma, mon, tin);
            map.put(a.getNam(), a);
        }
        Set<Map.Entry<String , MonHoc>> entrys = map.entrySet();
        for(Map.Entry<String , MonHoc> x : entrys)
        {
            System.out.println(x.getValue());
        }
    }
}
