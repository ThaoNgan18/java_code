/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai4 {
    //mảng
    public static int [] inputArr(int n){
        int [] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n ; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void outPut(int [] a){
        for(int i = 0; i< a.length ; i++){
            System.out.printf("%d\t", a[i]);
        }
        System.out.println();
    }
    // kiểm tra xe có phải số nguyên tố không
    public static boolean isNguyento(int x){
        if(x < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(x);i++)
            if(i % x == 0 )
                return false;
        return true;
    }
    public static void main(String[] args) {
        int [] a = inputArr(5);
        outPut(a);
        
        //Tính tổng nguyên tố cách 2
        // hàm filter thay thế cho IF else
        System.out.println(IntStream.of(a).filter(x -> isNguyento(x) == true).sum());
        
        //Số dương lớn nhất getAsInt lấy dữ liệu nguyên
        System.out.println(IntStream.of(a).filter(x -> x > 0).max().getAsInt());
        
        //số âm nhỏ nhất
        System.out.println(IntStream.of(a).filter(x -> x < 0).min().getAsInt());
        
        //Tổng các số nguyên tố cách 1
        int t = 0;
        for(int x: a){
            if(isNguyento(x) == true)
                t+= x;
        }
        System.out.println(t);
        
        //sắp xếp theo thứ tự tâng dần 
        Arrays.sort(a);
        outPut(a);
        
        //tìm x bằng phương pháp nhị phân
        int idx = Arrays.binarySearch(a,9 );
        System.out.println(idx);
        
    }
}

