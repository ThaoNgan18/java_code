/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thuchanh1;

import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class ThucHanh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = (int)(Math.random() * 100) + 1; // hàm rondom một số từ 1 đến 100
        
        Scanner sc = new Scanner(System.in);
        int d;
        do{
            System.out.print("So ban doan = ");
            d = sc.nextInt();
            
            if(d > n){
                System.out.println("SO NHAP LON HON");
            }
            else if(d < n){
                System.out.println("SO NHAP NHO HON");
            }
            else{
                System.out.println("CHINH XAC!!");
            }
        }while(d != n);
    }
}
