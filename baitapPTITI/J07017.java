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
class Pair<First , Second>
{
    private First x;
    private Second y;
    protected Pair(First x , Second y)
    {
        this.x = x;
        this.y = y;
    }
    protected  boolean checkX()
    {
        for(int i = 2 ; i <= Math.sqrt((Integer)this.x) ; i++)
        {
            if(((Integer)this.x) % i == 0) return false;
        }
        return (Integer)this.x > 1;
    }
    protected  boolean checkY()
    {
        for(int i = 2 ; i <= Math.sqrt((Integer)this.y) ; i++)
        {
            if(((Integer)this.y) % i == 0) return false;
        }
        return (Integer)this.y > 1;
    }
    protected boolean isPrime()
    {
        if(this.checkX() && this.checkY()) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    
}
public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
