/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J04018;

/**
 *
 * @author luong
 */
public class SoPhuc {
    private int phanNguyen;
    private int phanAO;

    public SoPhuc(int nguyen, int ao) {
        this.phanNguyen = nguyen;
        this.phanAO = ao;
    }
    public SoPhuc phepTinhC(SoPhuc b)
    {
        SoPhuc ketQua = new SoPhuc(this.phanNguyen + b.phanNguyen, this.phanAO + b.phanAO);
        int ketQuaphanNguyen = ketQua.phanNguyen * this.phanNguyen - ketQua.phanAO * this.phanAO;
        int ketQuaphanAO = ketQua.phanNguyen * this.phanAO + ketQua.phanAO * this.phanNguyen;
        return new SoPhuc(ketQuaphanNguyen, ketQuaphanAO);
    }
    public SoPhuc phepTinhD(SoPhuc b)
    {
        SoPhuc ketQua = new SoPhuc(this.phanNguyen + b.phanNguyen, this.phanAO + b.phanAO);
        int ketQuaphanNguyen = ketQua.phanNguyen * ketQua.phanNguyen - ketQua.phanAO * ketQua.phanAO;
        int ketQuaphanAO = 2 * ketQua.phanAO * ketQua.phanNguyen;
        return new SoPhuc(ketQuaphanNguyen, ketQuaphanAO);
    }

    @Override
    public String toString() {
        return this.phanNguyen + " + " + this.phanAO + "i";
    }
    
}
