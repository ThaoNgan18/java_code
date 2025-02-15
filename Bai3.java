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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap email: ");
        
        String email = sc.nextLine(); // nhập email
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("ten cua dia chi mail: " + username);
      
        System.out.print("Nhap 1 chuoi: ");
        String input = sc.nextLine();
        int count = 0; //biến đếm số lượng
        
        for(int i = 0; i < input.length();i++){
            if (Character.isUpperCase(input.charAt(i))) {
                count++;
            }
        }
        System.out.println("So luong ky tu hoa: " + count);
    }
}

