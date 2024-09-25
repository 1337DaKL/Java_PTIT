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
class PhanSO{
    private long tu ;
    private long mau;
    protected PhanSO(long x , long y)
    {
        this.tu= x;
        this.mau = y;
    }
    private  long uc(long a , long b)
    {
        if(b == 0) return a;
        return uc(b, a % b);
   }
    protected PhanSO phepTinhC(PhanSO b)
    {
        long x = this.tu * b.mau + this.mau * b.tu;
        long y = this.mau * b.mau;
        long ucnl = uc(x , y);
        PhanSO k = new PhanSO(x / ucnl , y / ucnl);
        long xx = k.tu * k.tu;
        long yy = k.mau * k.mau;
        PhanSO kk = new PhanSO(xx / uc(xx, yy), yy / uc(xx , yy));
        return kk;
    }
    protected PhanSO phepTinhD (PhanSO b)
    {
        long x = this.tu * b.tu;
        long y = this.mau * b.mau;
        x /= uc(x, y);
        y /= uc(x, y);
        PhanSO c = phepTinhC(b);
        long xx = x * c.tu;
        long yy = y * c.mau;
        long uc = this.uc(xx, yy);
        PhanSO kk = new PhanSO(xx / uc, yy / uc);
        return kk;
    }

    @Override
    public String toString() {
        return this.tu + "/" + this.mau;
    }
    
}
public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0)
        {
            PhanSO a = new PhanSO(sc.nextLong(), sc.nextLong());
            PhanSO b = new PhanSO(sc.nextLong(), sc.nextLong());
            System.out.println(a.phepTinhC(b) + " " + a.phepTinhD(b));
            
        }
        
    }
}
