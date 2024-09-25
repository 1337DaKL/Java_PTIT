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
class Pair<First , Second>{
    private First x ;
    private Second y;
    protected Pair(First x , Second y)
    {
        this.x = x;
        this.y = y;
    }
    private boolean checkX(First x)
    {
        for(int i = 2 ; i <= Math.sqrt((Integer)x) ; i++)
        {
            if((Integer)x % i == 0) return  false;
        }
        return (Integer)x > 1;
    }
    private boolean checkY(Second y)
    {
        for(int i = 2 ; i <= Math.sqrt((Integer)y) ; i++)
        {
            if((Integer)y % i == 0) return  false;
        }
        return (Integer)y > 1;
    }
    protected boolean isPrime()
    {
        if(checkX(this.x) && checkY(this.y)) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    
}
public class J04020 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
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
