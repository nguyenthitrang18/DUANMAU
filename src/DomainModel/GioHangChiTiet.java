/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class GioHangChiTiet {
    private String idGioHang;
    private String idChiTietSP;
    private Integer soluong;
    private BigDecimal Dongia;
    private BigDecimal dongiakhigam;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(String idGioHang, String idChiTietSP, Integer soluong, BigDecimal Dongia, BigDecimal dongiakhigam) {
        this.idGioHang = idGioHang;
        this.idChiTietSP = idChiTietSP;
        this.soluong = soluong;
        this.Dongia = Dongia;
        this.dongiakhigam = dongiakhigam;
    }

    public String getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(String idGioHang) {
        this.idGioHang = idGioHang;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public BigDecimal getDongia() {
        return Dongia;
    }

    public void setDongia(BigDecimal Dongia) {
        this.Dongia = Dongia;
    }

    public BigDecimal getDongiakhigam() {
        return dongiakhigam;
    }

    public void setDongiakhigam(BigDecimal dongiakhigam) {
        this.dongiakhigam = dongiakhigam;
    }
    
    
}
