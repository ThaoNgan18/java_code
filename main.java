/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh22;

/**
 *
 * @author thao trang
 */
public class main {

    public static void main(String[] args) {
        PhanSo[] a = {
            new PhanSo(2, 3),
            new PhanSo(-7, 8),
            new PhanSo(2, -5),
            new PhanSo(6, 15),
            new PhanSo(8, 5)
        };
        for (PhanSo x : a) {
            x.hienThi();
        }
        PhanSo t = new PhanSo();
        for (PhanSo x : a) {
            t = t.cong(x);
        }
        System.out.print("\n Tong = ");
        t.rutGon().hienThi();

        //c
        PhanSo m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].soSanh(m) > 0) {
                m = a[i];
            }
        }
        System.out.print("\n MAX = ");
        m.hienThi();
    }
}
