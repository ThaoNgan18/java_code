/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thao trang
 */
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    public void themDs(PhanSo p){
        this.ds.add(p);
    }
    public void themDs(PhanSo... a){
       this.ds.addAll(Arrays.asList(a));
    }
    public void themPt(){
        
    }
//        public PhanSo timMax(){
//        //nếu lổi ket hop voi kiem tran (if)
//        return this.ds.stream().max((a, b) -> a.soSanh(b).get());
//    }
//    
//    public void sapXep(){
//        this.ds.so.sort((a, b) -> a.soSanh(b).get());
//    }
}
