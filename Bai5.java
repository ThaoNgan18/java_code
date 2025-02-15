/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class Bai5 {
   //ma trận n * m
    public static int [][] inputArr(int n, int m){
        int [][] a = new int [n][m];
        
        for(int i = 0; i < n; i++ ){
            for (int j = 0; j < m; j++)
                a[i][j] = (int )(Math.random() * 100 + 1 );
        }
        return a;
    }
    public static void outPut(int [][] a){
        for (int[] row : a) {
            for (int x: row) {
                System.out.printf("%d\t", x);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void tongDong(int [][] a){
        for(int i = 0; i < a.length; i++ )
            for(int j = 0; j < a[i].length; j++)
                
    }
    public static void rcmaxMin(int [][] a){
        int maxRowSum = Integer.MIN_VALUE, maxRowIndex = -1;
        int minColSum = Integer.MAX_VALUE, minColIndex = -1;

        for (int i = 0; i < a.length; i++) {
            int rowSum = Arrays.stream(a[i]).sum();
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }

        for (int j = 0; j < a[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < a.length; i++) {
                colSum += a[i][j];
            }
            if (colSum < minColSum) {
                minColSum = colSum;
                minColIndex = j;
            }
        }

        System.out.println("Chi so dong lon nhat " + maxRowIndex);
        System.out.println("chi so cot nho nhat: " + minColIndex);
    }
    public static void sumMax(int [][] a, int d){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chi so dong: ");
        d = sc.nextInt();
        
        for(int i = 0; i < a.length ;i++){
            
        }
    }
    public static void main(String[] args) {
        int [][] a = inputArr(3, 4 );
        outPut(a);
        
        
    }
}


