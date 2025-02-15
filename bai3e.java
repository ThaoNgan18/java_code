/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;
import java.util.Scanner;

public class bai3e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");

        String result = "";
        for (String x : words) {
            result += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        System.out.println("Chuoi sau khi chuan hoa: " + result.trim()); 
    }
}
