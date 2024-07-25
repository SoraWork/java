/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Windows 10 Pro
 */
public class HangTable {
    ArrayList<HangDb> item;
    long tonggiatri;
    String ngaylap;
    String mahoadon;
    HangTable(){
        item = new ArrayList(); 
    }

    public ArrayList<HangDb> getItem() {
        return item;
    }

    public void setItem(ArrayList<HangDb> item) {
        this.item = item;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public long getTonggiatri() {
        return tonggiatri;
    }

    public void setTonggiatri(long tonggiatri) {
        this.tonggiatri = tonggiatri;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }
    public HangDb GetItem(int i){
        return item.get(i);
    }
    public void AddItem(HangDb hang){
        item.add(hang);
    }
    public int GetSoLuong(){
        return item.size();
    }
    public void Tinhtonggt(){
        long a = 0;
        for(int i=0;i<item.size();i++){
            a+=item.get(i).getDonGia()*item.get(i).getSoLuong();
        }
        tonggiatri = a;
    }
           
}
