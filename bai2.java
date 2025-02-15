/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;

import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //nhập dữ liệu
        System.out.println("Nhap vao bac cua da thuc: ");
        int n = sc.nextInt();
        
        System.out.println("Nhap vao gia tri x: ");
        double x = sc.nextDouble();
        
        double kq = 0;
        for(int i = 0; i <= n; i++){
            System.out.printf("a%d = ", i ); //là một dạng format
            double a  = sc.nextDouble();
            kq += a * Math.pow(x, i);
        }
        System.out.printf("Gia tri da thuc = %.1f\n", kq);
          
    }
}


