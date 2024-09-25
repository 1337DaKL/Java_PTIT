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
    private String tenMonString;
    private String hinhThucThiString;
    protected MonHoc(String ma , String mon , String hinhThuc)
    {
        this.maMonHocString = ma;
        this.tenMonString = mon;
        this.hinhThucThiString = hinhThuc;
    }
    protected String getMaMonHoc()
    {
        return this.maMonHocString;
    }
    @Override
    public String toString() {
        return this.maMonHocString + " " +this.tenMonString + " " + this.hinhThucThiString;
    }
    
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int test = sc.nextInt();
        sc.nextLine();
        TreeMap<String , MonHoc> map = new TreeMap<>();
        while(test-- > 0)
        {
            MonHoc a = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(a.getMaMonHoc(), a);
        }
        Set<Map.Entry<String , MonHoc>> entrys = map.entrySet();
        for(Map.Entry<String , MonHoc> x : entrys)
        {
            System.out.println(x.getValue());
        }
    }
}
