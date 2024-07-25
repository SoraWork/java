/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Windows 10 Pro
 */
public class HangDb {
    public String MaHang;
    public String TenHang;
    public long DonGia;
    public int SoLuong;

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    }

    public HangDb(String MaHang, String TenHang, long DonGia, int SoLuong) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HangDb() {
    }
    
}
