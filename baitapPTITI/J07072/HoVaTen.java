/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapPTITI.J07072;

/**
 *
 * @author luong
 */
public class HoVaTen implements Comparable<HoVaTen>{
    private String tenString , ho , dem , ten;
    public HoVaTen(String ten)
    {
        this.tenString = Helper.chuanHoa(ten);
        String[] a = this.tenString.split("\\s+");
        this.ho = a[0];
        this.ten = a[a.length - 1];
        this.dem = "";
        for(int i = 1 ; i < a.length - 1 ; i++)
        {
            this.dem += a[i];
        }
    }

    @Override
    public String toString() {
        return this.tenString;
    }
    @Override
    public int compareTo(HoVaTen b)
    {
        if(this.ten.equals(b.ten))
        {
            if(this.ho.equals(b.ho))
            {
                return this.dem.compareTo(b.dem);
            }
            return this.ho.compareTo(b.ho);
        }
        return this.ten.compareTo(b.ten);
    }
    
}
