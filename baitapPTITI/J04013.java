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
class ThiSinhThiDaiHoc{
    private String maThiSinh;
    private String hoVaTen;
    private double diemToan;
    private double diemLi;
    private double diemHoa;
    private double diemUuTien;
    private double tongDiem;
    private double diemChuan;
    private String trangThaiString;
    protected ThiSinhThiDaiHoc(String ma , String ten , double toan , double li , double hoa)
    {
        this.maThiSinh = ma;
        this.hoVaTen = ten;
        this.diemToan = toan;
        this.diemLi = li;
        this.diemHoa = hoa;
        String kv = ma.substring(0 , 3);
        switch (kv) {
            case "KV1":
                this.diemUuTien = 0.5;
                break;
            case "KV2":
                this.diemUuTien = 1;
                break;
            case "KV3":
                this.diemUuTien = 2.5;
                break;
            default:
                throw new AssertionError();
        }
        this.tongDiem = toan * 2 + li + hoa;
        this.diemChuan = this.tongDiem + this.diemUuTien;
        if(this.diemChuan >= 24) this.trangThaiString = "TRUNG TUYEN";
        else this.trangThaiString = "TRUOT";
        
    }

    @Override
    public String toString() {
        String diemUuTienStr = (this.diemUuTien == (int) this.diemUuTien) ? String.format("%.0f", this.diemUuTien) : String.format("%.1f", this.diemUuTien);
        String tongDiemStr = (this.tongDiem == (int) this.tongDiem) ? String.format("%.0f", this.tongDiem) : String.format("%.1f", this.tongDiem);if((int)this.diemUuTien == this.diemUuTien) this.diemUuTien = (int)this.diemUuTien;
        return this.maThiSinh + " " + this.hoVaTen + " " + diemUuTienStr + " " + tongDiemStr + " " + this.trangThaiString;
    }
    
}
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinhThiDaiHoc a = new ThiSinhThiDaiHoc(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a);
    }
}
