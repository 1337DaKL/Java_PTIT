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
class ThiSinh{
    private  String hoVaTen;
    private  String ngaySinh;
    private  double diemMon1;
    private  double diemMon2;
    private  double diemMon3;
    private  double tongDiem;
    protected ThiSinh(String ten , String ngay , double diem1 , double diem2 , double diem3)
    {
        this.hoVaTen = ten;
        this.ngaySinh = ngay;
        this.diemMon1 = diem1;
        this.diemMon2 = diem2;
        this.diemMon3 = diem3;
        this.tongDiem = diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return this.hoVaTen + " " + this.ngaySinh + " " + String.format("%.01f", this.tongDiem);
    }
    
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a);
    }
}
