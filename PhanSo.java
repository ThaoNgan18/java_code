/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh22;

import java.util.Scanner;

/**
 *
 * @author thao trang
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public PhanSo(){
        this(0, 1);
    }
    
    public void nhapPs(){
        //dùng chung tĩnh cho final cũng dc su dung toàn hệ thống
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu so = ");
        
    }
    public PhanSo rutGon(){
        int u = ucln(this.tuSo, this.mauSo);
        
        return new PhanSo(this.tuSo/u, this.mauSo/u);
    }
    
    public PhanSo cong(PhanSo p){
        return new PhanSo(this.tuSo * p.mauSo + this.mauSo * p.tuSo, this.mauSo * p.mauSo);
    }
    public static int ucln(int a, int b){
        if(a  == 0 || b == 0)
            return 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while(a != b){
            if(a  > b)
                a -= b;
            else
                b -=a;
        }
        return a;
    }
    public int soSanh(PhanSo p){
        double v1 = this.tuSo * 1.0/ this.mauSo; //nhan cho thuc de thanh so thuc
        double v2 = p.tuSo *1.0 / p.mauSo;
        if(v1 > v2)
            return 1;
        else if(v1 < v2)
            return -1;
        return 0;
    }
    
    public void hienThi(){
        System.out.printf("%d/%d", this.tuSo, this.mauSo);
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    
}

