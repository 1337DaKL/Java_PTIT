/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanhLan1;

/**
 *
 * @author luong
 */
import java.util.*;
public class DanhDauSanPhamLoi {
    public static String createRange(int start, int end) {
        return (start == end) ? String.valueOf(start) : start + "-" + end ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int totalProducts = sc.nextInt(); 
        int errorCount = sc.nextInt();   

        int[] errorProducts = new int[errorCount];
        for (int i = 0; i < errorCount; i++) {
            errorProducts[i] = sc.nextInt();
        }  
        Arrays.sort(errorProducts);

        List<String> errorRanges = new ArrayList<>();
        int start = errorProducts[0];
        for (int i = 1; i < errorCount; i++) {
            if (errorProducts[i] != errorProducts[i - 1] + 1) {
                errorRanges.add(createRange(start, errorProducts[i - 1]));
                start = errorProducts[i];
            }
        }
        errorRanges.add(createRange(start, errorProducts[errorCount - 1]));

        List<String> correctRanges = new ArrayList<>();
        start = 1;
        for (int i = 0; i < errorCount; i++) {
            if (start < errorProducts[i]) {
                correctRanges.add(createRange(start, errorProducts[i] - 1));
            }
            start = errorProducts[i] + 1;
        }
        if (start <= totalProducts) {
            correctRanges.add(createRange(start, totalProducts));
        }
        String error = "Errors : ";
        for(int i = 0 ; i < errorRanges.size() ; i++)
        {
            if(i < errorRanges.size() - 2)
            {
                error = error + errorRanges.get(i) + ", ";
            }
            else if(i == errorRanges.size() - 2 )
            {
                error = error + errorRanges.get(i) + " and ";
            }
            else error = error + errorRanges.get(i);
        }
        System.out.println(error);
        String correct = "Correct : ";
        for(int i = 0 ; i < correctRanges.size() ; i++)
        {
            if(i < correctRanges.size() - 2)
            {
                correct = correct + correctRanges.get(i) + ", ";
            }
            else if(i == correctRanges.size() - 2 )
            {
                correct = correct + correctRanges.get(i) + " and ";
            }
            else correct = correct + correctRanges.get(i);
        }
        System.out.println(correct);
    }
}
//100 10
//2 3 5 10 11 12 25 26 88 89